package com.example.backend_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend_api.model.Odds;
import com.example.backend_api.model.OddsId;

public interface OddsRepository extends JpaRepository<Odds, OddsId> {
   // OddsId is the composite key class (matchId + betOperatorId)
   List<Odds> findByMatchId(Integer matchId); //Added by Qijie
   Optional<Odds> findByMatchIdAndBetOperatorId(Integer matchId, Integer betOperatorId); //Added by Qijie
}
