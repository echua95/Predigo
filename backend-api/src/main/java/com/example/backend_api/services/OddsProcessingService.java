package com.example.backend_api.services;

import com.example.backend_api.model.Odds;
import com.example.backend_api.repository.OddsRepository;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class OddsProcessingService {

    private final OddsRepository oddsRepository;
    private final ObjectMapper objectMapper;

    public OddsProcessingService(OddsRepository oddsRepository, ObjectMapper objectMapper) {
        this.oddsRepository = oddsRepository;
        this.objectMapper = objectMapper;
    }

    public int processAndSaveOdds(String json) throws Exception {
        JsonNode root = objectMapper.readTree(json);
        List<Odds> oddsList = new ArrayList<>();

        for (JsonNode matchNode : root.path("response")) {
            Integer matchId = matchNode.path("fixture").path("id").asInt();

            Odds odds = new Odds();
            odds.setMatchid(matchId);
            odds.setBetoperatorid(1);

            for (JsonNode oddsNode : matchNode.path("odds")) {
                String oddsName = oddsNode.path("name").asText();

                for (String timing : List.of("TMinus120h", "TMinus96h", "TMinus72h", "TMinus48h", "TMinus24h", "TMinus12h", "TMinus30min", "TMinus15min", "TMinus5min")) {

                    if ("Fulltime Result".equalsIgnoreCase(oddsName)) {
                        for (JsonNode valueNode : oddsNode.path("values")) {
                            String value = valueNode.path("value").asText();
                            BigDecimal odd = new BigDecimal(valueNode.path("odd").asText());
                            switch (value) {
                                case "Home": odds.getClass().getMethod("setOneX2FtHome_" + timing, BigDecimal.class).invoke(odds, odd); break;
                                case "Draw": odds.getClass().getMethod("setOneX2FtDraw_" + timing, BigDecimal.class).invoke(odds, odd); break;
                                case "Away": odds.getClass().getMethod("setOneX2FtAway_" + timing, BigDecimal.class).invoke(odds, odd); break;
                            }
                        }
                    }

                    if ("1st Half Result".equalsIgnoreCase(oddsName)) {
                        for (JsonNode valueNode : oddsNode.path("values")) {
                            String value = valueNode.path("value").asText();
                            BigDecimal odd = new BigDecimal(valueNode.path("odd").asText());
                            switch (value) {
                                case "Home": odds.getClass().getMethod("setOneX2HtHome_" + timing, BigDecimal.class).invoke(odds, odd); break;
                                case "Draw": odds.getClass().getMethod("setOneX2HtDraw_" + timing, BigDecimal.class).invoke(odds, odd); break;
                                case "Away": odds.getClass().getMethod("setOneX2HtAway_" + timing, BigDecimal.class).invoke(odds, odd); break;
                            }
                        }
                    }

                    if ("Both Teams To Score".equalsIgnoreCase(oddsName)) {
                        for (JsonNode valueNode : oddsNode.path("values")) {
                            String value = valueNode.path("value").asText();
                            BigDecimal odd = new BigDecimal(valueNode.path("odd").asText());
                            if ("Yes".equalsIgnoreCase(value)) {
                                odds.getClass().getMethod("setBttsft_" + timing, BigDecimal.class).invoke(odds, odd);
                            }
                        }
                    }

                    if ("Goals Over/Under".equalsIgnoreCase(oddsName) || "Match Goals".equalsIgnoreCase(oddsName)) {
                        for (JsonNode valueNode : oddsNode.path("values")) {
                            String value = valueNode.path("value").asText();
                            String handicap = valueNode.has("handicap") ? valueNode.path("handicap").asText() : "";
                            BigDecimal odd = new BigDecimal(valueNode.path("odd").asText());

                            if (List.of("0.5", "1.5", "2.5", "3.5", "4.5").contains(handicap)) {
                                String prefix = ("Over".equalsIgnoreCase(value)) ? "setOver" : ("Under".equalsIgnoreCase(value)) ? "setUnder" : null;
                                if (prefix != null) {
                                    String methodName = prefix + handicap.replace(".", "_") + "_" + timing;
                                    odds.getClass().getMethod(methodName, BigDecimal.class).invoke(odds, odd);
                                }
                            }
                        }
                    }

                    if ("Asian Handicap".equalsIgnoreCase(oddsName)) {
                        for (JsonNode valueNode : oddsNode.path("values")) {
                            String value = valueNode.path("value").asText();
                            String handicap = valueNode.has("handicap") ? valueNode.path("handicap").asText() : "";
                            BigDecimal odd = new BigDecimal(valueNode.path("odd").asText());
                            if (List.of("-1", "-1.5", "-2", "-2.5", "-3", "-3.5", "+1", "+1.5", "+2", "+2.5", "+3", "+3.5").contains(handicap)) {
                                String sign = handicap.startsWith("-") ? "Minus" : "Plus";
                                String side = "Home".equalsIgnoreCase(value) ? "Hdphome" : "Hdpaway";
                                String methodName = "set" + side + sign + handicap.replace("+", "").replace("-", "").replace(".", "_") + "_" + timing;
                                odds.getClass().getMethod(methodName, BigDecimal.class).invoke(odds, odd);
                            }
                        }
                    }
                }
            }

            oddsList.add(odds);
        }

        oddsRepository.saveAll(oddsList);
        return oddsList.size();
    }
}

