package com.example.backend_api.services;

import com.example.backend_api.model.Odds;
import com.example.backend_api.model.OddsId;
import com.example.backend_api.repository.OddsRepository;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

@Service
public class OddsProcessingService {

    private final OddsRepository oddsRepository;
    private final ObjectMapper objectMapper;

    private static final Set<String> bettingTypesWith11Snapshots = Set.of(
        "1x2ft", "overunderft", "bttsft", "ttslft", "ttsfgft"
    );

    public OddsProcessingService(OddsRepository oddsRepository, ObjectMapper objectMapper) {
        this.oddsRepository = oddsRepository;
        this.objectMapper = objectMapper;
    }

    public void processAndSaveOdds(String json, String snapshotTag) throws Exception {
        JsonNode root = objectMapper.readTree(json);

        for (JsonNode matchNode : root.path("response")) {
            Integer matchId = matchNode.path("fixture").path("id").asInt();

            for (JsonNode bookmaker : matchNode.path("bookmakers")) {
                int operatorId = bookmaker.path("id").asInt();
                OddsId id = new OddsId(matchId, operatorId);

                Odds odds = oddsRepository.findById(id).orElseGet(() -> new Odds(matchId, operatorId));

                for (JsonNode bet : bookmaker.path("bets")) {
                    String betTypeKey = normalizeBetType(bet.path("name").asText());

                    if (!isSupportedBetType(betTypeKey)) continue;

                    JsonNode values = bet.path("values");
                    updateOddsForSnapshot(odds, betTypeKey, values, snapshotTag);
                }

                oddsRepository.save(odds);
            }
        }
    }

    private boolean isSupportedBetType(String key) {
        return true;
    }

    private String normalizeBetType(String name) {
        return name.toLowerCase()
                   .replace(" ", "")
                   .replace("/", "")
                   .replace("(", "")
                   .replace(")", "");
    }

    private void updateOddsForSnapshot(Odds odds, String betType, JsonNode values, String snapshotTag) {
        BigDecimal home = getOddValue(values, "Home");
        BigDecimal draw = getOddValue(values, "Draw");
        BigDecimal away = getOddValue(values, "Away");
        BigDecimal yes = getOddValue(values, "Yes");
        BigDecimal no = getOddValue(values, "No");

        switch (betType) {
            case "1x2ft" -> setOdds(odds::setOneX2FtHome, odds::setOneX2FtDraw, odds::setOneX2FtAway, snapshotTag, home, draw, away);
            case "1x2ht" -> setOdds(odds::setOneX2HtHome, odds::setOneX2HtDraw, odds::setOneX2HtAway, snapshotTag, home, draw, away);
            case "bttsft" -> setOdds(odds::setBttsFtYes, odds::setBttsFtNo, null, snapshotTag, yes, no, null);
            case "btts1st" -> setOdds(odds::setBtts1stYes, odds::setBtts1stNo, null, snapshotTag, yes, no, null);
            case "btts2nd" -> setOdds(odds::setBtts2ndYes, odds::setBtts2ndNo, null, snapshotTag, yes, no, null);
            case "overunderft" -> {
                BigDecimal over = getOddValue(values, "Over 2.5");
                BigDecimal under = getOddValue(values, "Under 2.5");
                setOdds(odds::setOverFt, odds::setUnderFt, null, snapshotTag, over, under, null);
            }
            case "overunderht" -> {
                BigDecimal over = getOddValue(values, "Over 1.5");
                BigDecimal under = getOddValue(values, "Under 1.5");
                setOdds(odds::setOverHt, odds::setUnderHt, null, snapshotTag, over, under, null);
            }
            case "ttslft" -> setOdds(odds::setTtslFtHome, odds::setTtslFtAway, null, snapshotTag, home, away, null);
            case "ttslht" -> setOdds(odds::setTtslHtHome, odds::setTtslHtAway, null, snapshotTag, home, away, null);
            case "ttsfgft" -> setOdds(odds::setTtsfgFtHome, odds::setTtsfgFtAway, null, snapshotTag, home, away, null);
            case "ttsfght" -> setOdds(odds::setTtsfgHtHome, odds::setTtsfgHtAway, null, snapshotTag, home, away, null);
        }
    }

    private void setOdds(SnapshotSetter homeSetter, SnapshotSetter drawSetter, SnapshotSetter awaySetter,
                         String snapshotTag, BigDecimal home, BigDecimal draw, BigDecimal away) {
        if (homeSetter != null && home != null) homeSetter.set(snapshotTag, home);
        if (drawSetter != null && draw != null) drawSetter.set(snapshotTag, draw);
        if (awaySetter != null && away != null) awaySetter.set(snapshotTag, away);
    }

    private BigDecimal getOddValue(JsonNode values, String target) {
        for (JsonNode valueNode : values) {
            if (valueNode.path("value").asText().equalsIgnoreCase(target)) {
                return new BigDecimal(valueNode.path("odd").asText());
            }
        }
        return null;
    }

    @FunctionalInterface
    private interface SnapshotSetter {
        void set(String snapshotTag, BigDecimal value);
    }

public class Odds {
    // --- 1X2 Full Time ---
    private BigDecimal oneX2FtHomeTMinus120h, oneX2FtHomeTMinus96h, oneX2FtHomeTMinus72h, oneX2FtHomeTMinus48h,
            oneX2FtHomeTMinus24h, oneX2FtHomeTMinus12h, oneX2FtHomeTMinus30min, oneX2FtHomeTMinus15min, oneX2FtHomeTMinus5min,
            oneX2FtHomeTPlus55min, oneX2FtHomeTPlus98min;

    private BigDecimal oneX2FtDrawTMinus120h, oneX2FtDrawTMinus96h, oneX2FtDrawTMinus72h, oneX2FtDrawTMinus48h,
            oneX2FtDrawTMinus24h, oneX2FtDrawTMinus12h, oneX2FtDrawTMinus30min, oneX2FtDrawTMinus15min, oneX2FtDrawTMinus5min,
            oneX2FtDrawTPlus55min, oneX2FtDrawTPlus98min;

    private BigDecimal oneX2FtAwayTMinus120h, oneX2FtAwayTMinus96h, oneX2FtAwayTMinus72h, oneX2FtAwayTMinus48h,
            oneX2FtAwayTMinus24h, oneX2FtAwayTMinus12h, oneX2FtAwayTMinus30min, oneX2FtAwayTMinus15min, oneX2FtAwayTMinus5min,
            oneX2FtAwayTPlus55min, oneX2FtAwayTPlus98min;

    // Example additional type: BTTS Full Time
    private BigDecimal bttsFtYesTMinus120h, bttsFtYesTMinus96h, bttsFtYesTMinus72h, bttsFtYesTMinus48h,
            bttsFtYesTMinus24h, bttsFtYesTMinus12h, bttsFtYesTMinus30min, bttsFtYesTMinus15min, bttsFtYesTMinus5min,
            bttsFtYesTPlus55min, bttsFtYesTPlus98min;

    private BigDecimal bttsFtNoTMinus120h, bttsFtNoTMinus96h, bttsFtNoTMinus72h, bttsFtNoTMinus48h,
            bttsFtNoTMinus24h, bttsFtNoTMinus12h, bttsFtNoTMinus30min, bttsFtNoTMinus15min, bttsFtNoTMinus5min,
            bttsFtNoTPlus55min, bttsFtNoTPlus98min;

    public void setOneX2FtHome(String snapshotTag, BigDecimal value) {
        switch (snapshotTag) {
            case "T-120h" -> this.oneX2FtHomeTMinus120h = value;
            case "T-96h" -> this.oneX2FtHomeTMinus96h = value;
            case "T-72h" -> this.oneX2FtHomeTMinus72h = value;
            case "T-48h" -> this.oneX2FtHomeTMinus48h = value;
            case "T-24h" -> this.oneX2FtHomeTMinus24h = value;
            case "T-12h" -> this.oneX2FtHomeTMinus12h = value;
            case "T-30min" -> this.oneX2FtHomeTMinus30min = value;
            case "T-15min" -> this.oneX2FtHomeTMinus15min = value;
            case "T-5min" -> this.oneX2FtHomeTMinus5min = value;
            case "T+55min" -> this.oneX2FtHomeTPlus55min = value;
            case "T+98min" -> this.oneX2FtHomeTPlus98min = value;
        }
    }

    public void setOneX2FtDraw(String snapshotTag, BigDecimal value) {
        switch (snapshotTag) {
            case "T-120h" -> this.oneX2FtDrawTMinus120h = value;
            case "T-96h" -> this.oneX2FtDrawTMinus96h = value;
            case "T-72h" -> this.oneX2FtDrawTMinus72h = value;
            case "T-48h" -> this.oneX2FtDrawTMinus48h = value;
            case "T-24h" -> this.oneX2FtDrawTMinus24h = value;
            case "T-12h" -> this.oneX2FtDrawTMinus12h = value;
            case "T-30min" -> this.oneX2FtDrawTMinus30min = value;
            case "T-15min" -> this.oneX2FtDrawTMinus15min = value;
            case "T-5min" -> this.oneX2FtDrawTMinus5min = value;
            case "T+55min" -> this.oneX2FtDrawTPlus55min = value;
            case "T+98min" -> this.oneX2FtDrawTPlus98min = value;
        }
    }

    public void setOneX2FtAway(String snapshotTag, BigDecimal value) {
        switch (snapshotTag) {
            case "T-120h" -> this.oneX2FtAwayTMinus120h = value;
            case "T-96h" -> this.oneX2FtAwayTMinus96h = value;
            case "T-72h" -> this.oneX2FtAwayTMinus72h = value;
            case "T-48h" -> this.oneX2FtAwayTMinus48h = value;
            case "T-24h" -> this.oneX2FtAwayTMinus24h = value;
            case "T-12h" -> this.oneX2FtAwayTMinus12h = value;
            case "T-30min" -> this.oneX2FtAwayTMinus30min = value;
            case "T-15min" -> this.oneX2FtAwayTMinus15min = value;
            case "T-5min" -> this.oneX2FtAwayTMinus5min = value;
            case "T+55min" -> this.oneX2FtAwayTPlus55min = value;
            case "T+98min" -> this.oneX2FtAwayTPlus98min = value;
        }
    }

    public void setBttsFtYes(String snapshotTag, BigDecimal value) {
        switch (snapshotTag) {
            case "T-120h" -> this.bttsFtYesTMinus120h = value;
            case "T-96h" -> this.bttsFtYesTMinus96h = value;
            case "T-72h" -> this.bttsFtYesTMinus72h = value;
            case "T-48h" -> this.bttsFtYesTMinus48h = value;
            case "T-24h" -> this.bttsFtYesTMinus24h = value;
            case "T-12h" -> this.bttsFtYesTMinus12h = value;
            case "T-30min" -> this.bttsFtYesTMinus30min = value;
            case "T-15min" -> this.bttsFtYesTMinus15min = value;
            case "T-5min" -> this.bttsFtYesTMinus5min = value;
            case "T+55min" -> this.bttsFtYesTPlus55min = value;
            case "T+98min" -> this.bttsFtYesTPlus98min = value;
        }
    }

    public void setBttsFtNo(String snapshotTag, BigDecimal value) {
        switch (snapshotTag) {
            case "T-120h" -> this.bttsFtNoTMinus120h = value;
            case "T-96h" -> this.bttsFtNoTMinus96h = value;
            case "T-72h" -> this.bttsFtNoTMinus72h = value;
            case "T-48h" -> this.bttsFtNoTMinus48h = value;
            case "T-24h" -> this.bttsFtNoTMinus24h = value;
            case "T-12h" -> this.bttsFtNoTMinus12h = value;
            case "T-30min" -> this.bttsFtNoTMinus30min = value;
            case "T-15min" -> this.bttsFtNoTMinus15min = value;
            case "T-5min" -> this.bttsFtNoTMinus5min = value;
            case "T+55min" -> this.bttsFtNoTPlus55min = value;
            case "T+98min" -> this.bttsFtNoTPlus98min = value;
        }
    }

    // You can continue to define similar methods for all other betting types used in your service layer.
}





}
