package com.example.backend_api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.backend_api.entities.Odds;
import com.example.backend_api.repository.OddsRepository;
import com.example.backend_api.requests.OddsProcessingService;
import com.example.backend_api.requests.TestGet;
import java.util.List;

@RestController
@RequestMapping("/odds")
public class OddsController {

    private final OddsRepository oddsRepository;
    private final TestGet apiService;
    private final OddsProcessingService oddsProcessingService;

    public OddsController(OddsRepository oddsRepository, TestGet apiService, OddsProcessingService oddsProcessingService) {
        this.oddsRepository = oddsRepository;
        this.apiService = apiService;
        this.oddsProcessingService = oddsProcessingService;
    }

    @GetMapping
    public List<Odds> getAllOdds() {
        return oddsRepository.findAll();
    }

    @GetMapping("/fetch")
    public ResponseEntity<String> fetchData() {
        String json = apiService.callExternalApi().block();
        return ResponseEntity.ok()
                .header("Content-Type", "application/json")
                .body(json);
    }

    @GetMapping("/fetch-and-save")
    public ResponseEntity<String> fetchAndSaveOdds() {
        String json = apiService.callExternalApi().block();
        try {
            int saved = oddsProcessingService.processAndSaveOdds(json);
            return ResponseEntity.ok("Saved " + saved + " odds records.");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error: " + e.getMessage());
        }
    }
}

