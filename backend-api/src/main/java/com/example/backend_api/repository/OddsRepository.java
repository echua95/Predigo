package com.example.backend_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend_api.model.Odds;
import com.example.backend_api.model.OddsId;

public interface OddsRepository extends JpaRepository<Odds, OddsId> {
    // Integer is the type of primary key (matchid)
}
