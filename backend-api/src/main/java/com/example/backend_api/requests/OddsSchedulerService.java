package com.example.backend_api.requests;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class OddsSchedulerService {

    private final TestGet apiService;
    private final OddsProcessingService oddsProcessingService;

    public OddsSchedulerService(TestGet apiService, OddsProcessingService oddsProcessingService) {
        this.apiService = apiService;
        this.oddsProcessingService = oddsProcessingService;
    }

    @Scheduled(fixedRate = 300000) // every 5 minutes
    public void fetchAndSaveOddsScheduled() {
        try {
            String json = apiService.callExternalApi().block();
            int saved = oddsProcessingService.processAndSaveOdds(json);
            System.out.println("Scheduled: Saved " + saved + " odds records.");
        } catch (Exception e) {
            System.err.println("Scheduled fetch-and-save failed: " + e.getMessage());
        }
    }
}