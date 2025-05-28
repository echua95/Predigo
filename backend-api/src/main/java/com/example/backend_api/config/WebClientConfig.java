package com.example.backend_api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient webClient(@Value("${api.football.key}") String apiKey) {
        return WebClient.builder()
            .baseUrl("https://v3.football.api-sports.io") // <-- Set the correct base URL
            .defaultHeader("x-apisports-key", apiKey)
            .build();
    }
}
