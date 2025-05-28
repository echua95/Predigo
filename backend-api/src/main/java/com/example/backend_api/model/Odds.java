package com.example.backend_api.model;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "odds")
@IdClass(OddsId.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Odds {

    @Id
    @Column(name = "matchid")
    private Integer matchid;

    @Id
    @Column(name = "betoperatorid")
    private Integer betoperatorid;

    @Column(name = "1x2fthome", nullable = false)
    private BigDecimal oneX2FtHome;

    @Column(name = "1x2ftdraw", nullable = false)
    private BigDecimal oneX2FtDraw;

    @Column(name = "1x2ftaway", nullable = false)
    private BigDecimal oneX2FtAway;

    @Column(name = "1x2hthome", nullable = false)
    private BigDecimal oneX2HtHome;

    @Column(name = "1x2htdraw", nullable = false)
    private BigDecimal oneX2HtDraw;

    @Column(name = "1x2htaway", nullable = false)
    private BigDecimal oneX2HtAway;

    @Column(name = "bttsft")
    private BigDecimal bttsft;

    @Column(name = "over0_5")
    private BigDecimal over0_5;

    @Column(name = "over1_5")
    private BigDecimal over1_5;

    @Column(name = "over2_5")
    private BigDecimal over2_5;

    @Column(name = "over3_5")
    private BigDecimal over3_5;

    @Column(name = "over4_5")
    private BigDecimal over4_5;

    @Column(name = "under0_5")
    private BigDecimal under0_5;

    @Column(name = "under1_5")
    private BigDecimal under1_5;

    @Column(name = "under2_5")
    private BigDecimal under2_5;

    @Column(name = "under3_5")
    private BigDecimal under3_5;

    @Column(name = "under4_5")
    private BigDecimal under4_5;

    @Column(name = "hsh")
    private Integer hsh;

    @Column(name = "ttsl")
    private Integer ttsl;

    @Column(name = "ttsfg")
    private Integer ttsfg;

    @Column(name = "hdphome-1")
    private BigDecimal hdphomeMinus1;

    @Column(name = "hdphome-1_5")
    private BigDecimal hdphomeMinus1_5;

    @Column(name = "hdphome-2")
    private BigDecimal hdphomeMinus2;

    @Column(name = "hdphome-2_5")
    private BigDecimal hdphomeMinus2_5;

    @Column(name = "hdphome-3_5")
    private BigDecimal hdphomeMinus3_5;

    @Column(name = "hdphome+1")
    private BigDecimal hdphomePlus1;

    @Column(name = "hdphome+1_5")
    private BigDecimal hdphomePlus1_5;

    @Column(name = "hdphome+2")
    private BigDecimal hdphomePlus2;

    @Column(name = "hdphome+2_5")
    private BigDecimal hdphomePlus2_5;

    @Column(name = "hdphome+3_5")
    private BigDecimal hdphomePlus3_5;

}