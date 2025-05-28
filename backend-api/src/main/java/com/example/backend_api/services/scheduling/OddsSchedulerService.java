package com.example.backend_api.services.scheduling;

import java.util.logging.Logger;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.backend_api.services.FootballApiClient;
import com.example.backend_api.services.OddsProcessingService;

@Service
public class OddsSchedulerService {

    private final FootballApiClient apiService;
    private final OddsProcessingService oddsProcessingService;
    private static final Logger logger = Logger.getLogger(OddsSchedulerService.class.getName());

    public OddsSchedulerService(FootballApiClient apiService, OddsProcessingService oddsProcessingService) {
        this.apiService = apiService;
        this.oddsProcessingService = oddsProcessingService;
    }

    @Scheduled(fixedRate = 300000) // every 5 minutes
    public void fetchAndSaveOddsScheduled() {
        try {
            String json = apiService.callExternalApi().block();
            int saved = oddsProcessingService.processAndSaveOdds(json);
            logger.info("Scheduled: Saved " + saved + " odds records.");
        } catch (Exception e) {
            logger.warning("Scheduled fetch-and-save failed: " + e.getMessage());
        }
    }
}