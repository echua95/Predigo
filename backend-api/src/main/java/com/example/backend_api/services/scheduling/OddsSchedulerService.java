package com.example.backend_api.services.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.backend_api.services.FootballApiClient;
import com.example.backend_api.services.OddsProcessingService;

@Service
public class OddsSchedulerService {

    private final FootballApiClient apiService;
    private final OddsProcessingService oddsProcessingService;

    public OddsSchedulerService(FootballApiClient apiService, OddsProcessingService oddsProcessingService) {
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