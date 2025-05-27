package com.example.backend_api.requests;

import com.example.backend_api.entities.Odds;
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

            // Initialize all fields as null
            BigDecimal oneX2FtHome = null, oneX2FtDraw = null, oneX2FtAway = null;
            BigDecimal oneX2HtHome = null, oneX2HtDraw = null, oneX2HtAway = null;
            BigDecimal bttsft = null;
            BigDecimal over0_5 = null, over1_5 = null, over2_5 = null, over3_5 = null, over4_5 = null;
            BigDecimal under0_5 = null, under1_5 = null, under2_5 = null, under3_5 = null, under4_5 = null;
            Integer hsh = null, ttsl = null, ttsfg = null;
            BigDecimal hdphomeMinus1 = null, hdphomeMinus1_5 = null, hdphomeMinus2 = null, hdphomeMinus2_5 = null, hdphomeMinus3_5 = null;
            BigDecimal hdphomePlus1 = null, hdphomePlus1_5 = null, hdphomePlus2 = null, hdphomePlus2_5 = null, hdphomePlus3_5 = null;

            for (JsonNode oddsNode : matchNode.path("odds")) {
                String oddsName = oddsNode.path("name").asText();

                // 1X2 Fulltime Result
                if ("Fulltime Result".equalsIgnoreCase(oddsName)) {
                    for (JsonNode valueNode : oddsNode.path("values")) {
                        String value = valueNode.path("value").asText();
                        BigDecimal odd = new BigDecimal(valueNode.path("odd").asText());
                        switch (value) {
                            case "Home": oneX2FtHome = odd; break;
                            case "Draw": oneX2FtDraw = odd; break;
                            case "Away": oneX2FtAway = odd; break;
                        }
                    }
                }

                // 1X2 Halftime Result (adjust market name if needed)
                if ("1st Half Result".equalsIgnoreCase(oddsName)) {
                    for (JsonNode valueNode : oddsNode.path("values")) {
                        String value = valueNode.path("value").asText();
                        BigDecimal odd = new BigDecimal(valueNode.path("odd").asText());
                        switch (value) {
                            case "Home": oneX2HtHome = odd; break;
                            case "Draw": oneX2HtDraw = odd; break;
                            case "Away": oneX2HtAway = odd; break;
                        }
                    }
                }

                // Both Teams To Score (Fulltime)
                if ("Both Teams To Score".equalsIgnoreCase(oddsName)) {
                    for (JsonNode valueNode : oddsNode.path("values")) {
                        String value = valueNode.path("value").asText();
                        if ("Yes".equalsIgnoreCase(value)) {
                            bttsft = new BigDecimal(valueNode.path("odd").asText());
                        }
                    }
                }

                // Over/Under markets
                if ("Match Goals".equalsIgnoreCase(oddsName) || "Goals Over/Under".equalsIgnoreCase(oddsName)) {
                    for (JsonNode valueNode : oddsNode.path("values")) {
                        String value = valueNode.path("value").asText();
                        String handicap = valueNode.has("handicap") ? valueNode.path("handicap").asText() : "";
                        BigDecimal odd = new BigDecimal(valueNode.path("odd").asText());
                        if ("0.5".equals(handicap)) {
                            if ("Over".equalsIgnoreCase(value)) over0_5 = odd;
                            if ("Under".equalsIgnoreCase(value)) under0_5 = odd;
                        }
                        if ("1.5".equals(handicap)) {
                            if ("Over".equalsIgnoreCase(value)) over1_5 = odd;
                            if ("Under".equalsIgnoreCase(value)) under1_5 = odd;
                        }
                        if ("2.5".equals(handicap)) {
                            if ("Over".equalsIgnoreCase(value)) over2_5 = odd;
                            if ("Under".equalsIgnoreCase(value)) under2_5 = odd;
                        }
                        if ("3.5".equals(handicap)) {
                            if ("Over".equalsIgnoreCase(value)) over3_5 = odd;
                            if ("Under".equalsIgnoreCase(value)) under3_5 = odd;
                        }
                        if ("4.5".equals(handicap)) {
                            if ("Over".equalsIgnoreCase(value)) over4_5 = odd;
                            if ("Under".equalsIgnoreCase(value)) under4_5 = odd;
                        }
                    }
                }

                // Asian Handicap (example, adjust as needed)
                if ("Asian Handicap".equalsIgnoreCase(oddsName)) {
                    for (JsonNode valueNode : oddsNode.path("values")) {
                        String value = valueNode.path("value").asText();
                        String handicap = valueNode.has("handicap") ? valueNode.path("handicap").asText() : "";
                        BigDecimal odd = new BigDecimal(valueNode.path("odd").asText());
                        if ("-1".equals(handicap) && "Home".equalsIgnoreCase(value)) hdphomeMinus1 = odd;
                        if ("-1.5".equals(handicap) && "Home".equalsIgnoreCase(value)) hdphomeMinus1_5 = odd;
                        if ("-2".equals(handicap) && "Home".equalsIgnoreCase(value)) hdphomeMinus2 = odd;
                        if ("-2.5".equals(handicap) && "Home".equalsIgnoreCase(value)) hdphomeMinus2_5 = odd;
                        if ("-3.5".equals(handicap) && "Home".equalsIgnoreCase(value)) hdphomeMinus3_5 = odd;
                        if ("+1".equals(handicap) && "Home".equalsIgnoreCase(value)) hdphomePlus1 = odd;
                        if ("+1.5".equals(handicap) && "Home".equalsIgnoreCase(value)) hdphomePlus1_5 = odd;
                        if ("+2".equals(handicap) && "Home".equalsIgnoreCase(value)) hdphomePlus2 = odd;
                        if ("+2.5".equals(handicap) && "Home".equalsIgnoreCase(value)) hdphomePlus2_5 = odd;
                        if ("+3.5".equals(handicap) && "Home".equalsIgnoreCase(value)) hdphomePlus3_5 = odd;
                    }
                }

                // Add more mappings for hsh, ttsl, ttsfg as needed, depending on your API's markets
            }

            // Use BigDecimal.ZERO for required fields if missing
            Odds odds = new Odds(
                matchId,
                1, // betoperatorid
                oneX2FtHome != null ? oneX2FtHome : BigDecimal.ZERO,
                oneX2FtDraw != null ? oneX2FtDraw : BigDecimal.ZERO,
                oneX2FtAway != null ? oneX2FtAway : BigDecimal.ZERO,
                oneX2HtHome != null ? oneX2HtHome : BigDecimal.ZERO,
                oneX2HtDraw != null ? oneX2HtDraw : BigDecimal.ZERO,
                oneX2HtAway != null ? oneX2HtAway : BigDecimal.ZERO,
                bttsft,
                over0_5,
                over1_5,
                over2_5,
                over3_5,
                over4_5,
                under0_5,
                under1_5,
                under2_5,
                under3_5,
                under4_5,
                hsh,
                ttsl,
                ttsfg,
                hdphomeMinus1,
                hdphomeMinus1_5,
                hdphomeMinus2,
                hdphomeMinus2_5,
                hdphomeMinus3_5,
                hdphomePlus1,
                hdphomePlus1_5,
                hdphomePlus2,
                hdphomePlus2_5,
                hdphomePlus3_5
            );
            oddsList.add(odds);
        }
        oddsRepository.saveAll(oddsList);
        return oddsList.size();
    }
}