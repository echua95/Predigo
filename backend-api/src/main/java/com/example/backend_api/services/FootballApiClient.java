package com.example.backend_api.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

@Service
public class FootballApiClient {

    private final WebClient webClient;
    private final String oddsLivePath;

    public FootballApiClient(WebClient webClient, @Value("${api.football.odds-live-path}") String oddsLivePath) {
        this.webClient = webClient;
        this.oddsLivePath = oddsLivePath;
    }

    public Mono<String> callExternalApi() {
        return webClient.get()
                .uri(oddsLivePath)
                .retrieve()
                .bodyToMono(String.class)
                .onErrorResume(WebClientResponseException.class, ex ->
                        Mono.error(new RuntimeException("API call failed: " + ex.getMessage(), ex))
                );
    }
}
