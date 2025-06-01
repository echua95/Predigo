package com.example.backend_api.model;

import java.math.BigDecimal;
import jakarta.persistence.*;
import lombok.*;
import lombok.AllArgsConstructor; //Qijie Added this
import lombok.Data; //Qijie Added this
import lombok.NoArgsConstructor; //Qijie Added this

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

    //1x2fthome (LIVE) checked
    @Column(name = "1x2fthome_T-120h") private BigDecimal oneX2FtHome_TMinus120h;
    @Column(name = "1x2fthome_T-96h") private BigDecimal oneX2FtHome_TMinus96h;
    @Column(name = "1x2fthome_T-72h") private BigDecimal oneX2FtHome_TMinus72h;
    @Column(name = "1x2fthome_T-48h") private BigDecimal oneX2FtHome_TMinus48h;
    @Column(name = "1x2fthome_T-24h") private BigDecimal oneX2FtHome_TMinus24h;
    @Column(name = "1x2fthome_T-12h") private BigDecimal oneX2FtHome_TMinus12h;
    @Column(name = "1x2fthome_T-30min") private BigDecimal oneX2FtHome_TMinus30min;
    @Column(name = "1x2fthome_T-15min") private BigDecimal oneX2FtHome_TMinus15min;
    @Column(name = "1x2fthome_T-5min") private BigDecimal oneX2FtHome_TMinus5min;
    @Column(name = "1x2fthome_T+55min") private BigDecimal oneX2FtHome_TPlus55min;
    @Column(name = "1x2fthome_T+98min") private BigDecimal oneX2FtHome_TPlus98min;

    //1x2ftdraw (LIVE) checked
    @Column(name = "1x2ftdraw_T-120h") private BigDecimal oneX2FtDraw_TMinus120h;
    @Column(name = "1x2ftdraw_T-96h") private BigDecimal oneX2FtDraw_TMinus96h;
    @Column(name = "1x2ftdraw_T-72h") private BigDecimal oneX2FtDraw_TMinus72h;
    @Column(name = "1x2ftdraw_T-48h") private BigDecimal oneX2FtDraw_TMinus48h;
    @Column(name = "1x2ftdraw_T-24h") private BigDecimal oneX2FtDraw_TMinus24h;
    @Column(name = "1x2ftdraw_T-12h") private BigDecimal oneX2FtDraw_TMinus12h;
    @Column(name = "1x2ftdraw_T-30min") private BigDecimal oneX2FtDraw_TMinus30min;
    @Column(name = "1x2ftdraw_T-15min") private BigDecimal oneX2FtDraw_TMinus15min;
    @Column(name = "1x2ftdraw_T-5min") private BigDecimal oneX2FtDraw_TMinus5min;
    @Column(name = "1x2ftdraw_T+55min") private BigDecimal oneX2FtDraw_TPlus55min;
    @Column(name = "1x2ftdraw_T+98min") private BigDecimal oneX2FtDraw_TPlus98min;

    //1x2ftaway (LIVE) checked
    @Column(name = "1x2ftaway_T-120h") private BigDecimal oneX2FtAway_TMinus120h;
    @Column(name = "1x2ftaway_T-96h") private BigDecimal oneX2FtAway_TMinus96h;
    @Column(name = "1x2ftaway_T-72h") private BigDecimal oneX2FtAway_TMinus72h;
    @Column(name = "1x2ftaway_T-48h") private BigDecimal oneX2FtAway_TMinus48h;
    @Column(name = "1x2ftaway_T-24h") private BigDecimal oneX2FtAway_TMinus24h;
    @Column(name = "1x2ftaway_T-12h") private BigDecimal oneX2FtAway_TMinus12h;
    @Column(name = "1x2ftaway_T-30min") private BigDecimal oneX2FtAway_TMinus30min;
    @Column(name = "1x2ftaway_T-15min") private BigDecimal oneX2FtAway_TMinus15min;
    @Column(name = "1x2ftaway_T-5min") private BigDecimal oneX2FtAway_TMinus5min;
    @Column(name = "1x2ftaway_T+55min") private BigDecimal oneX2FtAway_TPlus55min;
    @Column(name = "1x2ftaway_T+98min") private BigDecimal oneX2FtAway_TPlus98min;
    
    //1x2hthome (NO-LIVE) checked
    @Column(name = "1x2hthome_T-120h") private BigDecimal oneX2HtHome_TMinus120h;
    @Column(name = "1x2hthome_T-96h") private BigDecimal oneX2HtHome_TMinus96h;
    @Column(name = "1x2hthome_T-72h") private BigDecimal oneX2HtHome_TMinus72h;
    @Column(name = "1x2hthome_T-48h") private BigDecimal oneX2HtHome_TMinus48h;
    @Column(name = "1x2hthome_T-24h") private BigDecimal oneX2HtHome_TMinus24h;
    @Column(name = "1x2hthome_T-12h") private BigDecimal oneX2HtHome_TMinus12h;
    @Column(name = "1x2hthome_T-30min") private BigDecimal oneX2HtHome_TMinus30min;
    @Column(name = "1x2hthome_T-15min") private BigDecimal oneX2HtHome_TMinus15min;
    @Column(name = "1x2hthome_T-5min") private BigDecimal oneX2HtHome_TMinus5min;

    //1x2htdraw (NO-LIVE) checked
    @Column(name = "1x2htdraw_T-120h") private BigDecimal oneX2HtDraw_TMinus120h;
    @Column(name = "1x2htdraw_T-96h") private BigDecimal oneX2HtDraw_TMinus96h;
    @Column(name = "1x2htdraw_T-72h") private BigDecimal oneX2HtDraw_TMinus72h;
    @Column(name = "1x2htdraw_T-48h") private BigDecimal oneX2HtDraw_TMinus48h;
    @Column(name = "1x2htdraw_T-24h") private BigDecimal oneX2HtDraw_TMinus24h;
    @Column(name = "1x2htdraw_T-12h") private BigDecimal oneX2HtDraw_TMinus12h;
    @Column(name = "1x2htdraw_T-30min") private BigDecimal oneX2HtDraw_TMinus30min;
    @Column(name = "1x2htdraw_T-15min") private BigDecimal oneX2HtDraw_TMinus15min;
    @Column(name = "1x2htdraw_T-5min") private BigDecimal oneX2HtDraw_TMinus5min;
    
    //1x2htaway (NO-LIVE) checked
    @Column(name = "1x2htaway_T-120h") private BigDecimal oneX2HtAway_TMinus120h;
    @Column(name = "1x2htaway_T-96h") private BigDecimal oneX2HtAway_TMinus96h;
    @Column(name = "1x2htaway_T-72h") private BigDecimal oneX2HtAway_TMinus72h;
    @Column(name = "1x2htaway_T-48h") private BigDecimal oneX2HtAway_TMinus48h;
    @Column(name = "1x2htaway_T-24h") private BigDecimal oneX2HtAway_TMinus24h;
    @Column(name = "1x2htaway_T-12h") private BigDecimal oneX2HtAway_TMinus12h;
    @Column(name = "1x2htaway_T-30min") private BigDecimal oneX2HtAway_TMinus30min;
    @Column(name = "1x2htaway_T-15min") private BigDecimal oneX2HtAway_TMinus15min;
    @Column(name = "1x2htaway_T-5min") private BigDecimal oneX2HtAway_TMinus5min;

    // Both Team to score half time Yes (NO-LIVE) checked
    @Column(name = "bttsHt_Yes_T-120h") private BigDecimal bttsHt_Yes_TMinus120h;
    @Column(name = "bttsHt_Yes_T-96h") private BigDecimal bttsHt_Yes_TMinus96h;
    @Column(name = "bttsHt_Yes_T-72h") private BigDecimal bttsHt_Yes_TMinus72h;
    @Column(name = "bttsHt_Yes_T-48h") private BigDecimal bttsHt_Yes_TMinus48h;
    @Column(name = "bttsHt_Yes_T-24h") private BigDecimal bttsHt_Yes_TMinus24h;
    @Column(name = "bttsHt_Yes_T-12h") private BigDecimal bttsHt_Yes_TMinus12h;
    @Column(name = "bttsHt_Yes_T-30min") private BigDecimal bttsHt_Yes_TMinus30min;
    @Column(name = "bttsHt_Yes_T-15min") private BigDecimal bttsHt_Yes_TMinus15min;
    @Column(name = "bttsHt_Yes_T-5min") private BigDecimal bttsHt_Yes_TMinus5min;
    
    // Both Team to score half time No (NO-LIVE) checked
    @Column(name = "bttsHt_No_T-120h") private BigDecimal bttsHt_No_TMinus120h;
    @Column(name = "bttsHt_No_T-96h") private BigDecimal bttsHt_No_TMinus96h;
    @Column(name = "bttsHt_No_T-72h") private BigDecimal bttsHt_No_TMinus72h;
    @Column(name = "bttsHt_No_T-48h") private BigDecimal bttsHt_No_TMinus48h;
    @Column(name = "bttsHt_No_T-24h") private BigDecimal bttsHt_No_TMinus24h;
    @Column(name = "bttsHt_No_T-12h") private BigDecimal bttsHt_No_TMinus12h;
    @Column(name = "bttsHt_No_T-30min") private BigDecimal bttsHt_No_TMinus30min;
    @Column(name = "bttsHt_No_T-15min") private BigDecimal bttsHt_No_TMinus15min;
    @Column(name = "bttsHt_No_T-5min") private BigDecimal bttsHt_No_TMinus5min;

    // Both Team to score full time Yes (NO-LIVE) checked
    @Column(name = "bttsFt_Yes_T-120h") private BigDecimal bttsFt_Yes_TMinus120h;
    @Column(name = "bttsFt_Yes_T-96h") private BigDecimal bttsFt_Yes_TMinus96h;
    @Column(name = "bttsFt_Yes_T-72h") private BigDecimal bttsFt_Yes_TMinus72h;
    @Column(name = "bttsFt_Yes_T-48h") private BigDecimal bttsFt_Yes_TMinus48h;
    @Column(name = "bttsFt_Yes_T-24h") private BigDecimal bttsFt_Yes_TMinus24h;
    @Column(name = "bttsFt_Yes_T-12h") private BigDecimal bttsFt_Yes_TMinus12h;
    @Column(name = "bttsFt_Yes_T-30min") private BigDecimal bttsFt_Yes_TMinus30min;
    @Column(name = "bttsFt_Yes_T-15min") private BigDecimal bttsFt_Yes_TMinus15min;
    @Column(name = "bttsFt_Yes_T-5min") private BigDecimal bttsFt_Yes_TMinus5min;

    // Both Team to score full time No (NO-LIVE) checked
    @Column(name = "bttsFt_No_T-120h") private BigDecimal bttsFt_No_TMinus120h;
    @Column(name = "bttsFt_No_T-96h") private BigDecimal bttsFt_No_TMinus96h;
    @Column(name = "bttsFt_No_T-72h") private BigDecimal bttsFt_No_TMinus72h;
    @Column(name = "bttsFt_No_T-48h") private BigDecimal bttsFt_No_TMinus48h;
    @Column(name = "bttsFt_No_T-24h") private BigDecimal bttsFt_No_TMinus24h;
    @Column(name = "bttsFt_No_T-12h") private BigDecimal bttsFt_No_TMinus12h;
    @Column(name = "bttsFt_No_T-30min") private BigDecimal bttsFt_No_TMinus30min;
    @Column(name = "bttsFt_No_T-15min") private BigDecimal bttsFt_No_TMinus15min;
    @Column(name = "bttsFt_No_T-5min") private BigDecimal bttsFt_No_TMinus5min;

    // Over 0.5 goals Half-Time (NO-LIVE) checked
    @Column(name = "over0_5_ht_T-120h") private BigDecimal over0_5_Ht_TMinus120h;
    @Column(name = "over0_5_ht_T-96h") private BigDecimal over0_5_Ht_TMinus96h;
    @Column(name = "over0_5_ht_T-72h") private BigDecimal over0_5_Ht_TMinus72h;
    @Column(name = "over0_5_ht_T-48h") private BigDecimal over0_5_Ht_TMinus48h;
    @Column(name = "over0_5_ht_T-24h") private BigDecimal over0_5_Ht_TMinus24h;
    @Column(name = "over0_5_ht_T-12h") private BigDecimal over0_5_Ht_TMinus12h;
    @Column(name = "over0_5_ht_T-30min") private BigDecimal over0_5_Ht_TMinus30min;
    @Column(name = "over0_5_ht_T-15min") private BigDecimal over0_5_Ht_TMinus15min;
    @Column(name = "over0_5_ht_T-5min") private BigDecimal over0_5_Ht_TMinus5min;

    // Over 1 goals Half-Time (NO-LIVE) checked
    @Column(name = "over1_ht_T-120h") private BigDecimal over1_Ht_TMinus120h;
    @Column(name = "over1_ht_T-96h") private BigDecimal over1_Ht_TMinus96h;
    @Column(name = "over1_ht_T-72h") private BigDecimal over1_Ht_TMinus72h;
    @Column(name = "over1_ht_T-48h") private BigDecimal over1_Ht_TMinus48h;
    @Column(name = "over1_ht_T-24h") private BigDecimal over1_Ht_TMinus24h;
    @Column(name = "over1_ht_T-12h") private BigDecimal over1_Ht_TMinus12h;
    @Column(name = "over1_ht_T-30min") private BigDecimal over1_Ht_TMinus30min;
    @Column(name = "over1_ht_T-15min") private BigDecimal over1_Ht_TMinus15min;
    @Column(name = "over1_ht_T-5min") private BigDecimal over1_Ht_TMinus5min;

    // Over 1.5 goals Half-Time (NO-LIVE) checked
    @Column(name = "over1_5_ht_T-120h") private BigDecimal over1_5_Ht_TMinus120h;
    @Column(name = "over1_5_ht_T-96h") private BigDecimal over1_5_Ht_TMinus96h;
    @Column(name = "over1_5_ht_T-72h") private BigDecimal over1_5_Ht_TMinus72h;
    @Column(name = "over1_5_ht_T-48h") private BigDecimal over1_5_Ht_TMinus48h;
    @Column(name = "over1_5_ht_T-24h") private BigDecimal over1_5_Ht_TMinus24h;
    @Column(name = "over1_5_ht_T-12h") private BigDecimal over1_5_Ht_TMinus12h;
    @Column(name = "over1_5_ht_T-30min") private BigDecimal over1_5_Ht_TMinus30min;
    @Column(name = "over1_5_ht_T-15min") private BigDecimal over1_5_Ht_TMinus15min;
    @Column(name = "over1_5_ht_T-5min") private BigDecimal over1_5_Ht_TMinus5min;

    // Over 2 goals Half-Time (NO-LIVE) checked
    @Column(name = "over2_ht_T-120h") private BigDecimal over2_Ht_TMinus120h;
    @Column(name = "over2_ht_T-96h") private BigDecimal over2_Ht_TMinus96h;
    @Column(name = "over2_ht_T-72h") private BigDecimal over2_Ht_TMinus72h;
    @Column(name = "over2_ht_T-48h") private BigDecimal over2_Ht_TMinus48h;
    @Column(name = "over2_ht_T-24h") private BigDecimal over2_Ht_TMinus24h;
    @Column(name = "over2_ht_T-12h") private BigDecimal over2_Ht_TMinus12h;
    @Column(name = "over2_ht_T-30min") private BigDecimal over2_Ht_TMinus30min;
    @Column(name = "over2_ht_T-15min") private BigDecimal over2_Ht_TMinus15min;
    @Column(name = "over2_ht_T-5min") private BigDecimal over2_Ht_TMinus5min;

    // Over 2.5 goals Half-Time (NO-LIVE) checked
    @Column(name = "over2_5_ht_T-120h") private BigDecimal over2_5_Ht_TMinus120h;
    @Column(name = "over2_5_ht_T-96h") private BigDecimal over2_5_Ht_TMinus96h;
    @Column(name = "over2_5_ht_T-72h") private BigDecimal over2_5_Ht_TMinus72h;
    @Column(name = "over2_5_ht_T-48h") private BigDecimal over2_5_Ht_TMinus48h;
    @Column(name = "over2_5_ht_T-24h") private BigDecimal over2_5_Ht_TMinus24h;
    @Column(name = "over2_5_ht_T-12h") private BigDecimal over2_5_Ht_TMinus12h;
    @Column(name = "over2_5_ht_T-30min") private BigDecimal over2_5_Ht_TMinus30min;
    @Column(name = "over2_5_ht_T-15min") private BigDecimal over2_5_Ht_TMinus15min;
    @Column(name = "over2_5_ht_T-5min") private BigDecimal over2_5_Ht_TMinus5min;

    // Over 0.5 goals Full-Time (LIVE) checked
    @Column(name = "over0_5_ft_T-120h") private BigDecimal over0_5_Ft_TMinus120h;
    @Column(name = "over0_5_ft_T-96h") private BigDecimal over0_5_Ft_TMinus96h;
    @Column(name = "over0_5_ft_T-72h") private BigDecimal over0_5_Ft_TMinus72h;
    @Column(name = "over0_5_ft_T-48h") private BigDecimal over0_5_Ft_TMinus48h;
    @Column(name = "over0_5_ft_T-24h") private BigDecimal over0_5_Ft_TMinus24h;
    @Column(name = "over0_5_ft_T-12h") private BigDecimal over0_5_Ft_TMinus12h;
    @Column(name = "over0_5_ft_T-30min") private BigDecimal over0_5_Ft_TMinus30min;
    @Column(name = "over0_5_ft_T-15min") private BigDecimal over0_5_Ft_TMinus15min;
    @Column(name = "over0_5_ft_T-5min") private BigDecimal over0_5_Ft_TMinus5min;
    @Column(name = "over0_5_ft_T+55min") private BigDecimal over0_5_Ft_TPlus55min;
    @Column(name = "over0_5_ft_T+98min") private BigDecimal over0_5_Ft_TPlus98min;

    // Over 1.5 goals Full-Time (LIVE) checked
    @Column(name = "over1_5_ft_T-120h") private BigDecimal over1_5_Ft_TMinus120h;
    @Column(name = "over1_5_ft_T-96h") private BigDecimal over1_5_Ft_TMinus96h;
    @Column(name = "over1_5_ft_T-72h") private BigDecimal over1_5_Ft_TMinus72h;
    @Column(name = "over1_5_ft_T-48h") private BigDecimal over1_5_Ft_TMinus48h;
    @Column(name = "over1_5_ft_T-24h") private BigDecimal over1_5_Ft_TMinus24h;
    @Column(name = "over1_5_ft_T-12h") private BigDecimal over1_5_Ft_TMinus12h;
    @Column(name = "over1_5_ft_T-30min") private BigDecimal over1_5_Ft_TMinus30min;
    @Column(name = "over1_5_ft_T-15min") private BigDecimal over1_5_Ft_TMinus15min;
    @Column(name = "over1_5_ft_T-5min") private BigDecimal over1_5_Ft_TMinus5min;
    @Column(name = "over1_5_ft_T+55min") private BigDecimal over1_5_Ft_TPlus55min;
    @Column(name = "over1_5_ft_T+98min") private BigDecimal over1_5_Ft_TPlus98min;

    // Over 2.5 goals Full-Time (LIVE) checked
    @Column(name = "over2_5_ft_T-120h") private BigDecimal over2_5_Ft_TMinus120h;
    @Column(name = "over2_5_ft_T-96h") private BigDecimal over2_5_Ft_TMinus96h;
    @Column(name = "over2_5_ft_T-72h") private BigDecimal over2_5_Ft_TMinus72h;
    @Column(name = "over2_5_ft_T-48h") private BigDecimal over2_5_Ft_TMinus48h;
    @Column(name = "over2_5_ft_T-24h") private BigDecimal over2_5_Ft_TMinus24h;
    @Column(name = "over2_5_ft_T-12h") private BigDecimal over2_5_Ft_TMinus12h;
    @Column(name = "over2_5_ft_T-30min") private BigDecimal over2_5_Ft_TMinus30min;
    @Column(name = "over2_5_ft_T-15min") private BigDecimal over2_5_Ft_TMinus15min;
    @Column(name = "over2_5_ft_T-5min") private BigDecimal over2_5_Ft_TMinus5min;
    @Column(name = "over2_5_ft_T+55min") private BigDecimal over2_5_Ft_TPlus55min;
    @Column(name = "over2_5_ft_T+98min") private BigDecimal over2_5_Ft_TPlus98min;

    // Over 3.5 goals Full-Time (LIVE) checked
    @Column(name = "over3_5_ft_T-120h") private BigDecimal over3_5_Ft_TMinus120h;
    @Column(name = "over3_5_ft_T-96h") private BigDecimal over3_5_Ft_TMinus96h;
    @Column(name = "over3_5_ft_T-72h") private BigDecimal over3_5_Ft_TMinus72h;
    @Column(name = "over3_5_ft_T-48h") private BigDecimal over3_5_Ft_TMinus48h;
    @Column(name = "over3_5_ft_T-24h") private BigDecimal over3_5_Ft_TMinus24h;
    @Column(name = "over3_5_ft_T-12h") private BigDecimal over3_5_Ft_TMinus12h;
    @Column(name = "over3_5_ft_T-30min") private BigDecimal over3_5_Ft_TMinus30min;
    @Column(name = "over3_5_ft_T-15min") private BigDecimal over3_5_Ft_TMinus15min;
    @Column(name = "over3_5_ft_T-5min") private BigDecimal over3_5_Ft_TMinus5min;
    @Column(name = "over3_5_ft_T+55min") private BigDecimal over3_5_Ft_TPlus55min;
    @Column(name = "over3_5_ft_T+98min") private BigDecimal over3_5_Ft_TPlus98min;

    // Over 4.5 goals Full-Time (LIVE) checked
    @Column(name = "over4_5_ft_T-120h") private BigDecimal over4_5_Ft_TMinus120h;
    @Column(name = "over4_5_ft_T-96h") private BigDecimal over4_5_Ft_TMinus96h;
    @Column(name = "over4_5_ft_T-72h") private BigDecimal over4_5_Ft_TMinus72h;
    @Column(name = "over4_5_ft_T-48h") private BigDecimal over4_5_Ft_TMinus48h;
    @Column(name = "over4_5_ft_T-24h") private BigDecimal over4_5_Ft_TMinus24h;
    @Column(name = "over4_5_ft_T-12h") private BigDecimal over4_5_Ft_TMinus12h;
    @Column(name = "over4_5_ft_T-30min") private BigDecimal over4_5_Ft_TMinus30min;
    @Column(name = "over4_5_ft_T-15min") private BigDecimal over4_5_Ft_TMinus15min;
    @Column(name = "over4_5_ft_T-5min") private BigDecimal over4_5_Ft_TMinus5min;
    @Column(name = "over4_5_ft_T+55min") private BigDecimal over4_5_Ft_TPlus55min;
    @Column(name = "over4_5_ft_T+98min") private BigDecimal over4_5_Ft_TPlus98min;
    
    // Under 0.5 goals Full Time (LIVE) checked
    @Column(name = "under0_5_ft_T-120h") private BigDecimal under0_5_FT_TMinus120h;
    @Column(name = "under0_5_ft_T-96h")  private BigDecimal under0_5_FT_TMinus96h;
    @Column(name = "under0_5_ft_T-72h")  private BigDecimal under0_5_FT_TMinus72h;
    @Column(name = "under0_5_ft_T-48h")  private BigDecimal under0_5_FT_TMinus48h;
    @Column(name = "under0_5_ft_T-24h")  private BigDecimal under0_5_FT_TMinus24h;
    @Column(name = "under0_5_ft_T-12h")  private BigDecimal under0_5_FT_TMinus12h;
    @Column(name = "under0_5_ft_T-30min") private BigDecimal under0_5_FT_TMinus30min;
    @Column(name = "under0_5_ft_T-15min") private BigDecimal under0_5_FT_TMinus15min;
    @Column(name = "under0_5_ft_T-5min")  private BigDecimal under0_5_FT_TMinus5min;
    @Column(name = "under0_5_ft_T+55min") private BigDecimal under0_5_FT_TPlus55min;
    @Column(name = "under0_5_ft_T+98min") private BigDecimal under0_5_FT_TPlus98min;

    // Under 1.5 goals Full Time (LIVE) checked
    @Column(name = "under1_5_ft_T-120h") private BigDecimal under1_5_FT_TMinus120h;
    @Column(name = "under1_5_ft_T-96h")  private BigDecimal under1_5_FT_TMinus96h;
    @Column(name = "under1_5_ft_T-72h")  private BigDecimal under1_5_FT_TMinus72h;
    @Column(name = "under1_5_ft_T-48h")  private BigDecimal under1_5_FT_TMinus48h;
    @Column(name = "under1_5_ft_T-24h")  private BigDecimal under1_5_FT_TMinus24h;
    @Column(name = "under1_5_ft_T-12h")  private BigDecimal under1_5_FT_TMinus12h;
    @Column(name = "under1_5_ft_T-30min") private BigDecimal under1_5_FT_TMinus30min;
    @Column(name = "under1_5_ft_T-15min") private BigDecimal under1_5_FT_TMinus15min;
    @Column(name = "under1_5_ft_T-5min")  private BigDecimal under1_5_FT_TMinus5min;
    @Column(name = "under1_5_ft_T+55min") private BigDecimal under1_5_FT_TPlus55min;
    @Column(name = "under1_5_ft_T+98min") private BigDecimal under1_5_FT_TPlus98min;

    // Under 2.5 goals Full Time (LIVE) checked
    @Column(name = "under2_5_ft_T-120h") private BigDecimal under2_5_FT_TMinus120h;
    @Column(name = "under2_5_ft_T-96h")  private BigDecimal under2_5_FT_TMinus96h;
    @Column(name = "under2_5_ft_T-72h")  private BigDecimal under2_5_FT_TMinus72h;
    @Column(name = "under2_5_ft_T-48h")  private BigDecimal under2_5_FT_TMinus48h;
    @Column(name = "under2_5_ft_T-24h")  private BigDecimal under2_5_FT_TMinus24h;
    @Column(name = "under2_5_ft_T-12h")  private BigDecimal under2_5_FT_TMinus12h;
    @Column(name = "under2_5_ft_T-30min") private BigDecimal under2_5_FT_TMinus30min;
    @Column(name = "under2_5_ft_T-15min") private BigDecimal under2_5_FT_TMinus15min;
    @Column(name = "under2_5_ft_T-5min")  private BigDecimal under2_5_FT_TMinus5min;
    @Column(name = "under2_5_ft_T+55min") private BigDecimal under2_5_FT_TPlus55min;
    @Column(name = "under2_5_ft_T+98min") private BigDecimal under2_5_FT_TPlus98min;

    // Under 3.5 goals Full Time (LIVE) checked
    @Column(name = "under3_5_ft_T-120h") private BigDecimal under3_5_FT_TMinus120h;
    @Column(name = "under3_5_ft_T-96h")  private BigDecimal under3_5_FT_TMinus96h;
    @Column(name = "under3_5_ft_T-72h")  private BigDecimal under3_5_FT_TMinus72h;
    @Column(name = "under3_5_ft_T-48h")  private BigDecimal under3_5_FT_TMinus48h;
    @Column(name = "under3_5_ft_T-24h")  private BigDecimal under3_5_FT_TMinus24h;
    @Column(name = "under3_5_ft_T-12h")  private BigDecimal under3_5_FT_TMinus12h;
    @Column(name = "under3_5_ft_T-30min") private BigDecimal under3_5_FT_TMinus30min;
    @Column(name = "under3_5_ft_T-15min") private BigDecimal under3_5_FT_TMinus15min;
    @Column(name = "under3_5_ft_T-5min")  private BigDecimal under3_5_FT_TMinus5min;
    @Column(name = "under3_5_ft_T+55min") private BigDecimal under3_5_FT_TPlus55min;
    @Column(name = "under3_5_ft_T+98min") private BigDecimal under3_5_FT_TPlus98min;

    // Under 4.5 goals Full Time (LIVE)
    @Column(name = "under4_5_ft_T-120h") private BigDecimal under4_5_FT_TMinus120h;
    @Column(name = "under4_5_ft_T-96h")  private BigDecimal under4_5_FT_TMinus96h;
    @Column(name = "under4_5_ft_T-72h")  private BigDecimal under4_5_FT_TMinus72h;
    @Column(name = "under4_5_ft_T-48h")  private BigDecimal under4_5_FT_TMinus48h;
    @Column(name = "under4_5_ft_T-24h")  private BigDecimal under4_5_FT_TMinus24h;
    @Column(name = "under4_5_ft_T-12h")  private BigDecimal under4_5_FT_TMinus12h;
    @Column(name = "under4_5_ft_T-30min") private BigDecimal under4_5_FT_TMinus30min;
    @Column(name = "under4_5_ft_T-15min") private BigDecimal under4_5_FT_TMinus15min;
    @Column(name = "under4_5_ft_T-5min")  private BigDecimal under4_5_FT_TMinus5min;
    @Column(name = "under4_5_ft_T+55min") private BigDecimal under4_5_FT_TPlus55min;
    @Column(name = "under4_5_ft_T+98min") private BigDecimal under4_5_FT_TPlus98min;

    // Under 0.5 goals Half Time (NO-LIVE)
    @Column(name = "under0_5_ht_T-120h") private BigDecimal under0_5_HT_TMinus120h;
    @Column(name = "under0_5_ht_T-96h")  private BigDecimal under0_5_HT_TMinus96h;
    @Column(name = "under0_5_ht_T-72h")  private BigDecimal under0_5_HT_TMinus72h;
    @Column(name = "under0_5_ht_T-48h")  private BigDecimal under0_5_HT_TMinus48h;
    @Column(name = "under0_5_ht_T-24h")  private BigDecimal under0_5_HT_TMinus24h;
    @Column(name = "under0_5_ht_T-12h")  private BigDecimal under0_5_HT_TMinus12h;
    @Column(name = "under0_5_ht_T-30min") private BigDecimal under0_5_HT_TMinus30min;
    @Column(name = "under0_5_ht_T-15min") private BigDecimal under0_5_HT_TMinus15min;
    @Column(name = "under0_5_ht_T-5min")  private BigDecimal under0_5_HT_TMinus5min;

    // Under 1.5 goals Half Time (NO-LIVE)
    @Column(name = "under1_5_ht_T-120h") private BigDecimal under1_5_HT_TMinus120h;
    @Column(name = "under1_5_ht_T-96h")  private BigDecimal under1_5_HT_TMinus96h;
    @Column(name = "under1_5_ht_T-72h")  private BigDecimal under1_5_HT_TMinus72h;
    @Column(name = "under1_5_ht_T-48h")  private BigDecimal under1_5_HT_TMinus48h;
    @Column(name = "under1_5_ht_T-24h")  private BigDecimal under1_5_HT_TMinus24h;
    @Column(name = "under1_5_ht_T-12h")  private BigDecimal under1_5_HT_TMinus12h;
    @Column(name = "under1_5_ht_T-30min") private BigDecimal under1_5_HT_TMinus30min;
    @Column(name = "under1_5_ht_T-15min") private BigDecimal under1_5_HT_TMinus15min;
    @Column(name = "under1_5_ht_T-5min")  private BigDecimal under1_5_HT_TMinus5min;

    // Under 2.5 goals Half Time (NO-LIVE)
    @Column(name = "under2_5_ht_T-120h") private BigDecimal under2_5_HT_TMinus120h;
    @Column(name = "under2_5_ht_T-96h")  private BigDecimal under2_5_HT_TMinus96h;
    @Column(name = "under2_5_ht_T-72h")  private BigDecimal under2_5_HT_TMinus72h;
    @Column(name = "under2_5_ht_T-48h")  private BigDecimal under2_5_HT_TMinus48h;
    @Column(name = "under2_5_ht_T-24h")  private BigDecimal under2_5_HT_TMinus24h;
    @Column(name = "under2_5_ht_T-12h")  private BigDecimal under2_5_HT_TMinus12h;
    @Column(name = "under2_5_ht_T-30min") private BigDecimal under2_5_HT_TMinus30min;
    @Column(name = "under2_5_ht_T-15min") private BigDecimal under2_5_HT_TMinus15min;
    @Column(name = "under2_5_ht_T-5min")  private BigDecimal under2_5_HT_TMinus5min;

    // Highest scoring half 1st (NO-LIVE)
    @Column(name = "hsh_1st_T-120h") private Integer hsh_1st_TMinus120h;
    @Column(name = "hsh_1st_T-96h") private Integer hsh_1st_TMinus96h;
    @Column(name = "hsh_1st_T-72h") private Integer hsh_1st_TMinus72h;
    @Column(name = "hsh_1st_T-48h") private Integer hsh_1st_TMinus48h;
    @Column(name = "hsh_1st_T-24h") private Integer hsh_1st_TMinus24h;
    @Column(name = "hsh_1st_T-12h") private Integer hsh_1st_TMinus12h;
    @Column(name = "hsh_1st_T-30min") private Integer hsh_1st_TMinus30min;
    @Column(name = "hsh_1st_T-15min") private Integer hsh_1st_TMinus15min;
    @Column(name = "hsh_1st_T-5min") private Integer hsh_1st_TMinus5min;

    // Highest scoring half 2nd (NO-LIVE)
    @Column(name = "hsh_2nd_T-120h") private Integer hsh_2nd_TMinus120h;
    @Column(name = "hsh_2nd_T-96h") private Integer hsh_2nd_TMinus96h;
    @Column(name = "hsh_2nd_T-72h") private Integer hsh_2nd_TMinus72h;
    @Column(name = "hsh_2nd_T-48h") private Integer hsh_2nd_TMinus48h;
    @Column(name = "hsh_2nd_T-24h") private Integer hsh_2nd_TMinus24h;
    @Column(name = "hsh_2nd_T-12h") private Integer hsh_2nd_TMinus12h;
    @Column(name = "hsh_2nd_T-30min") private Integer hsh_2nd_TMinus30min;
    @Column(name = "hsh_2nd_T-15min") private Integer hsh_2nd_TMinus15min;
    @Column(name = "hsh_2nd_T-5min") private Integer hsh_2nd_TMinus5min;

    // Team to score last Home Half Time (NO-LIVE)
    @Column(name = "ttslhome_T-120h_HT") private BigDecimal ttslhome_TMinus120h_HT;
    @Column(name = "ttslhome_T-96h_HT") private BigDecimal ttslhome_TMinus96h_HT;
    @Column(name = "ttslhome_T-72h_HT") private BigDecimal ttslhome_TMinus72h_HT;
    @Column(name = "ttslhome_T-48h_HT") private BigDecimal ttslhome_TMinus48h_HT;
    @Column(name = "ttslhome_T-24h_HT") private BigDecimal ttslhome_TMinus24h_HT;
    @Column(name = "ttslhome_T-12h_HT") private BigDecimal ttslhome_TMinus12h_HT;
    @Column(name = "ttslhome_T-30min_HT") private BigDecimal ttslhome_TMinus30min_HT;
    @Column(name = "ttslhome_T-15min_HT") private BigDecimal ttslhome_TMinus15min_HT;
    @Column(name = "ttslhome_T-5min_HT") private BigDecimal ttslhome_TMinus5min_HT;

    // Team to score last Home Full Time (LIVE)
    @Column(name = "ttslhome_T-120h_FT") private BigDecimal ttslhome_TMinus120h_FT;
    @Column(name = "ttslhome_T-96h_FT") private BigDecimal ttslhome_TMinus96h_FT;
    @Column(name = "ttslhome_T-72h_FT") private BigDecimal ttslhome_TMinus72h_FT;
    @Column(name = "ttslhome_T-48h_FT") private BigDecimal ttslhome_TMinus48h_FT;
    @Column(name = "ttslhome_T-24h_FT") private BigDecimal ttslhome_TMinus24h_FT;
    @Column(name = "ttslhome_T-12h_FT") private BigDecimal ttslhome_TMinus12h_FT;
    @Column(name = "ttslhome_T-30min_FT") private BigDecimal ttslhome_TMinus30min_FT;
    @Column(name = "ttslhome_T-15min_FT") private BigDecimal ttslhome_TMinus15min_FT;
    @Column(name = "ttslhome_T-5min_FT") private BigDecimal ttslhome_TMinus5min_FT;
    @Column(name = "ttslhome_T+55min_FT") private BigDecimal ttslhome_TPlus55min_FT;
    @Column(name = "ttslhome_T+98min_FT") private BigDecimal ttslhome_TPlus98min_FT;


    // Team to score last Away Half Time (NO-LIVE)
    @Column(name = "ttslaway_T-120h_HT") private BigDecimal ttslaway_TMinus120h_HT;
    @Column(name = "ttslaway_T-96h_HT") private BigDecimal ttslaway_TMinus96h_HT;
    @Column(name = "ttslaway_T-72h_HT") private BigDecimal ttslaway_TMinus72h_HT;
    @Column(name = "ttslaway_T-48h_HT") private BigDecimal ttslaway_TMinus48h_HT;
    @Column(name = "ttslaway_T-24h_HT") private BigDecimal ttslaway_TMinus24h_HT;
    @Column(name = "ttslaway_T-12h_HT") private BigDecimal ttslaway_TMinus12h_HT;
    @Column(name = "ttslaway_T-30min_HT") private BigDecimal ttslaway_TMinus30min_HT;
    @Column(name = "ttslaway_T-15min_HT") private BigDecimal ttslaway_TMinus15min_HT;
    @Column(name = "ttslaway_T-5min_HT") private BigDecimal ttslaway_TMinus5min_HT;

    // Team to score last Away Full Time (LIVE)
    @Column(name = "ttslaway_T-120h_FT") private BigDecimal ttslaway_TMinus120h_FT;
    @Column(name = "ttslaway_T-96h_FT") private BigDecimal ttslaway_TMinus96h_FT;
    @Column(name = "ttslaway_T-72h_FT") private BigDecimal ttslaway_TMinus72h_FT;
    @Column(name = "ttslaway_T-48h_FT") private BigDecimal ttslaway_TMinus48h_FT;
    @Column(name = "ttslaway_T-24h_FT") private BigDecimal ttslaway_TMinus24h_FT;
    @Column(name = "ttslaway_T-12h_FT") private BigDecimal ttslaway_TMinus12h_FT;
    @Column(name = "ttslaway_T-30min_FT") private BigDecimal ttslaway_TMinus30min_FT;
    @Column(name = "ttslaway_T-15min_FT") private BigDecimal ttslaway_TMinus15min_FT;
    @Column(name = "ttslaway_T-5min_FT") private BigDecimal ttslaway_TMinus5min_FT;
    @Column(name = "ttslaway_T+55min_FT") private BigDecimal ttslaway_TPlus55min_FT;
    @Column(name = "ttslaway_T+98min_FT") private BigDecimal ttslaway_TPlus98min_FT;

    // Team to score first goal Home (NO-LIVE)
    @Column(name = "ttsfghome_T-120h") private BigDecimal ttsfghome_TMinus120h;
    @Column(name = "ttsfghome_T-96h") private BigDecimal ttsfghome_TMinus96h;
    @Column(name = "ttsfghome_T-72h") private BigDecimal ttsfghome_TMinus72h;
    @Column(name = "ttsfghome_T-48h") private BigDecimal ttsfghome_TMinus48h;
    @Column(name = "ttsfghome_T-24h") private BigDecimal ttsfghome_TMinus24h;
    @Column(name = "ttsfghome_T-12h") private BigDecimal ttsfghome_TMinus12h;
    @Column(name = "ttsfghome_T-30min") private BigDecimal ttsfghome_TMinus30min;
    @Column(name = "ttsfghome_T-15min") private BigDecimal ttsfghome_TMinus15min;
    @Column(name = "ttsfghome_T-5min") private BigDecimal ttsfghome_TMinus5min;

    // Team to score first goal Away (NO-LIVE)
    @Column(name = "ttsfaway_T-120h") private BigDecimal ttsfaway_TMinus120h;
    @Column(name = "ttsfaway_T-96h") private BigDecimal ttsfaway_TMinus96h;
    @Column(name = "ttsfaway_T-72h") private BigDecimal ttsfaway_TMinus72h;
    @Column(name = "ttsfaway_T-48h") private BigDecimal ttsfaway_TMinus48h;
    @Column(name = "ttsfaway_T-24h") private BigDecimal ttsfaway_TMinus24h;
    @Column(name = "ttsfaway_T-12h") private BigDecimal ttsfaway_TMinus12h;
    @Column(name = "ttsfaway_T-30min") private BigDecimal ttsfaway_TMinus30min;
    @Column(name = "ttsfaway_T-15min") private BigDecimal ttsfaway_TMinus15min;
    @Column(name = "ttsfaway_T-5min") private BigDecimal ttsfaway_TMinus5min;
    
    // handicap Home -1 goals Full Time (LIVE)
    @Column(name = "hdphome-1_FT_T-120h") private BigDecimal hdphomeMinus1_FT_TMinus120h;
    @Column(name = "hdphome-1_FT_T-96h") private BigDecimal hdphomeMinus1_FT_TMinus96h;
    @Column(name = "hdphome-1_FT_T-72h") private BigDecimal hdphomeMinus1_FT_TMinus72h;
    @Column(name = "hdphome-1_FT_T-48h") private BigDecimal hdphomeMinus1_FT_TMinus48h;
    @Column(name = "hdphome-1_FT_T-24h") private BigDecimal hdphomeMinus1_FT_TMinus24h;
    @Column(name = "hdphome-1_FT_T-12h") private BigDecimal hdphomeMinus1_FT_TMinus12h;
    @Column(name = "hdphome-1_FT_T-30min") private BigDecimal hdphomeMinus1_FT_TMinus30min;
    @Column(name = "hdphome-1_FT_T-15min") private BigDecimal hdphomeMinus1_FT_TMinus15min;
    @Column(name = "hdphome-1_FT_T-5min") private BigDecimal hdphomeMinus1_FT_TMinus5min;
    @Column(name = "hdphome-1_FT_T+55min") private BigDecimal hdphomeMinus1_FT_TPlus55min;
    @Column(name = "hdphome-1_FT_T+98min") private BigDecimal hdphomeMinus1_FT_TPlus98min;

    // Handicap Home -1.5 goals Full Time (LIVE)
    @Column(name = "hdphome-1_5_FT_T-120h") private BigDecimal hdphomeMinus1_5_FT_TMinus120h;
    @Column(name = "hdphome-1_5_FT_T-96h") private BigDecimal hdphomeMinus1_5_FT_TMinus96h;
    @Column(name = "hdphome-1_5_FT_T-72h") private BigDecimal hdphomeMinus1_5_FT_TMinus72h;
    @Column(name = "hdphome-1_5_FT_T-48h") private BigDecimal hdphomeMinus1_5_FT_TMinus48h;
    @Column(name = "hdphome-1_5_FT_T-24h") private BigDecimal hdphomeMinus1_5_FT_TMinus24h;
    @Column(name = "hdphome-1_5_FT_T-12h") private BigDecimal hdphomeMinus1_5_FT_TMinus12h;
    @Column(name = "hdphome-1_5_FT_T-30min") private BigDecimal hdphomeMinus1_5_FT_TMinus30min;
    @Column(name = "hdphome-1_5_FT_T-15min") private BigDecimal hdphomeMinus1_5_FT_TMinus15min;
    @Column(name = "hdphome-1_5_FT_T-5min") private BigDecimal hdphomeMinus1_5_FT_TMinus5min;
    @Column(name = "hdphome-1_5_FT_T+55min") private BigDecimal hdphomeMinus1_5_FT_TPlus55min;
    @Column(name = "hdphome-1_5_FT_T+98min") private BigDecimal hdphomeMinus1_5_FT_TPlus98min;

    // Handicap Home -2.0 goals Full Time (LIVE)
    @Column(name = "hdphome-2_FT_T-120h") private BigDecimal hdphomeMinus2_FT_TMinus120h;
    @Column(name = "hdphome-2_FT_T-96h") private BigDecimal hdphomeMinus2_FT_TMinus96h;
    @Column(name = "hdphome-2_FT_T-72h") private BigDecimal hdphomeMinus2_FT_TMinus72h;
    @Column(name = "hdphome-2_FT_T-48h") private BigDecimal hdphomeMinus2_FT_TMinus48h;
    @Column(name = "hdphome-2_FT_T-24h") private BigDecimal hdphomeMinus2_FT_TMinus24h;
    @Column(name = "hdphome-2_FT_T-12h") private BigDecimal hdphomeMinus2_FT_TMinus12h;
    @Column(name = "hdphome-2_FT_T-30min") private BigDecimal hdphomeMinus2_FT_TMinus30min;
    @Column(name = "hdphome-2_FT_T-15min") private BigDecimal hdphomeMinus2_FT_TMinus15min;
    @Column(name = "hdphome-2_FT_T-5min") private BigDecimal hdphomeMinus2_FT_TMinus5min;
    @Column(name = "hdphome-2_FT_T+55min") private BigDecimal hdphomeMinus2_FT_TPlus55min;
    @Column(name = "hdphome-2_FT_T+98min") private BigDecimal hdphomeMinus2_FT_TPlus98min;

    // Handicap Home -2.5 goals Full Time (LIVE)
    @Column(name = "hdphome-2_5_FT_T-120h") private BigDecimal hdphomeMinus2_5_FT_TMinus120h;
    @Column(name = "hdphome-2_5_FT_T-96h") private BigDecimal hdphomeMinus2_5_FT_TMinus96h;
    @Column(name = "hdphome-2_5_FT_T-72h") private BigDecimal hdphomeMinus2_5_FT_TMinus72h;
    @Column(name = "hdphome-2_5_FT_T-48h") private BigDecimal hdphomeMinus2_5_FT_TMinus48h;
    @Column(name = "hdphome-2_5_FT_T-24h") private BigDecimal hdphomeMinus2_5_FT_TMinus24h;
    @Column(name = "hdphome-2_5_FT_T-12h") private BigDecimal hdphomeMinus2_5_FT_TMinus12h;
    @Column(name = "hdphome-2_5_FT_T-30min") private BigDecimal hdphomeMinus2_5_FT_TMinus30min;
    @Column(name = "hdphome-2_5_FT_T-15min") private BigDecimal hdphomeMinus2_5_FT_TMinus15min;
    @Column(name = "hdphome-2_5_FT_T-5min") private BigDecimal hdphomeMinus2_5_FT_TMinus5min;
    @Column(name = "hdphome-2_5_FT_T+55min") private BigDecimal hdphomeMinus2_5_FT_TPlus55min;
    @Column(name = "hdphome-2_5_FT_T+98min") private BigDecimal hdphomeMinus2_5_FT_TPlus98min;

    // Handicap Home -3 goals Full Time (LIVE)
    @Column(name = "hdphome-3_FT_T-120h") private BigDecimal hdphomeMinus3_FT_TMinus120h;
    @Column(name = "hdphome-3_FT_T-96h") private BigDecimal hdphomeMinus3_FT_TMinus96h;
    @Column(name = "hdphome-3_FT_T-72h") private BigDecimal hdphomeMinus3_FT_TMinus72h;
    @Column(name = "hdphome-3_FT_T-48h") private BigDecimal hdphomeMinus3_FT_TMinus48h;
    @Column(name = "hdphome-3_FT_T-24h") private BigDecimal hdphomeMinus3_FT_TMinus24h;
    @Column(name = "hdphome-3_FT_T-12h") private BigDecimal hdphomeMinus3_FT_TMinus12h;
    @Column(name = "hdphome-3_FT_T-30min") private BigDecimal hdphomeMinus3_FT_TMinus30min;
    @Column(name = "hdphome-3_FT_T-15min") private BigDecimal hdphomeMinus3_FT_TMinus15min;
    @Column(name = "hdphome-3_FT_T-5min") private BigDecimal hdphomeMinus3_FT_TMinus5min;
    @Column(name = "hdphome-3_FT_T+55min") private BigDecimal hdphomeMinus3_FT_TPlus55min;
    @Column(name = "hdphome-3_FT_T+98min") private BigDecimal hdphomeMinus3_FT_TPlus98min;

    // Handicap Home -3.5 goals Full Time (LIVE)
    @Column(name = "hdphome-3_5_FT_T-120h") private BigDecimal hdphomeMinus3_5_FT_TMinus120h;
    @Column(name = "hdphome-3_5_FT_T-96h") private BigDecimal hdphomeMinus3_5_FT_TMinus96h;
    @Column(name = "hdphome-3_5_FT_T-72h") private BigDecimal hdphomeMinus3_5_FT_TMinus72h;
    @Column(name = "hdphome-3_5_FT_T-48h") private BigDecimal hdphomeMinus3_5_FT_TMinus48h;
    @Column(name = "hdphome-3_5_FT_T-24h") private BigDecimal hdphomeMinus3_5_FT_TMinus24h;
    @Column(name = "hdphome-3_5_FT_T-12h") private BigDecimal hdphomeMinus3_5_FT_TMinus12h;
    @Column(name = "hdphome-3_5_FT_T-30min") private BigDecimal hdphomeMinus3_5_FT_TMinus30min;
    @Column(name = "hdphome-3_5_FT_T-15min") private BigDecimal hdphomeMinus3_5_FT_TMinus15min;
    @Column(name = "hdphome-3_5_FT_T-5min") private BigDecimal hdphomeMinus3_5_FT_TMinus5min;
    @Column(name = "hdphome-3_5_FT_T+55min") private BigDecimal hdphomeMinus3_5_FT_TPlus55min;
    @Column(name = "hdphome-3_5_FT_T+98min") private BigDecimal hdphomeMinus3_5_FT_TPlus98min;
    
    // Handicap Home +1 goals Full Time (LIVE)
    @Column(name = "hdphome+1_FT_T-120h") private BigDecimal hdphomePlus1_FT_TMinus120h;
    @Column(name = "hdphome+1_FT_T-96h") private BigDecimal hdphomePlus1_FT_TMinus96h;
    @Column(name = "hdphome+1_FT_T-72h") private BigDecimal hdphomePlus1_FT_TMinus72h;
    @Column(name = "hdphome+1_FT_T-48h") private BigDecimal hdphomePlus1_FT_TMinus48h;
    @Column(name = "hdphome+1_FT_T-24h") private BigDecimal hdphomePlus1_FT_TMinus24h;
    @Column(name = "hdphome+1_FT_T-12h") private BigDecimal hdphomePlus1_FT_TMinus12h;
    @Column(name = "hdphome+1_FT_T-30min") private BigDecimal hdphomePlus1_FT_TMinus30min;
    @Column(name = "hdphome+1_FT_T-15min") private BigDecimal hdphomePlus1_FT_TMinus15min;
    @Column(name = "hdphome+1_FT_T-5min") private BigDecimal hdphomePlus1_FT_TMinus5min;
    @Column(name = "hdphome+1_FT_T+55min") private BigDecimal hdphomePlus1_FT_TPlus55min;
    @Column(name = "hdphome+1_FT_T+98min") private BigDecimal hdphomePlus1_FT_TPlus98min;
    
    // Handicap Home +1.5 goals Full Time (LIVE)
    @Column(name = "hdphome+1_5_FT_T-120h") private BigDecimal hdphomePlus1_5_FT_TMinus120h;
    @Column(name = "hdphome+1_5_FT_T-96h") private BigDecimal hdphomePlus1_5_FT_TMinus96h;
    @Column(name = "hdphome+1_5_FT_T-72h") private BigDecimal hdphomePlus1_5_FT_TMinus72h;
    @Column(name = "hdphome+1_5_FT_T-48h") private BigDecimal hdphomePlus1_5_FT_TMinus48h;
    @Column(name = "hdphome+1_5_FT_T-24h") private BigDecimal hdphomePlus1_5_FT_TMinus24h;
    @Column(name = "hdphome+1_5_FT_T-12h") private BigDecimal hdphomePlus1_5_FT_TMinus12h;
    @Column(name = "hdphome+1_5_FT_T-30min") private BigDecimal hdphomePlus1_5_FT_TMinus30min;
    @Column(name = "hdphome+1_5_FT_T-15min") private BigDecimal hdphomePlus1_5_FT_TMinus15min;
    @Column(name = "hdphome+1_5_FT_T-5min") private BigDecimal hdphomePlus1_5_FT_TMinus5min;
    @Column(name = "hdphome+1_5_FT_T+55min") private BigDecimal hdphomePlus1_5_FT_TPlus55min;
    @Column(name = "hdphome+1_5_FT_T+98min") private BigDecimal hdphomePlus1_5_FT_TPlus98min;
    
    // Handicap Home +2 goals Full Time (LIVE)
    @Column(name = "hdphome+2_FT_T-120h") private BigDecimal hdphomePlus2_FT_TMinus120h;
    @Column(name = "hdphome+2_FT_T-96h") private BigDecimal hdphomePlus2_FT_TMinus96h;
    @Column(name = "hdphome+2_FT_T-72h") private BigDecimal hdphomePlus2_FT_TMinus72h;
    @Column(name = "hdphome+2_FT_T-48h") private BigDecimal hdphomePlus2_FT_TMinus48h;
    @Column(name = "hdphome+2_FT_T-24h") private BigDecimal hdphomePlus2_FT_TMinus24h;
    @Column(name = "hdphome+2_FT_T-12h") private BigDecimal hdphomePlus2_FT_TMinus12h;
    @Column(name = "hdphome+2_FT_T-30min") private BigDecimal hdphomePlus2_FT_TMinus30min;
    @Column(name = "hdphome+2_FT_T-15min") private BigDecimal hdphomePlus2_FT_TMinus15min;
    @Column(name = "hdphome+2_FT_T-5min") private BigDecimal hdphomePlus2_FT_TMinus5min;
    @Column(name = "hdphome+2_FT_T+55min") private BigDecimal hdphomePlus2_FT_TPlus55min;
    @Column(name = "hdphome+2_FT_T+98min") private BigDecimal hdphomePlus2_FT_TPlus98min;
    
    // Handicap Home +2.5 goals Full Time (LIVE)
    @Column(name = "hdphome+2_5_FT_T-120h") private BigDecimal hdphomePlus2_5_FT_TMinus120h;
    @Column(name = "hdphome+2_5_FT_T-96h") private BigDecimal hdphomePlus2_5_FT_TMinus96h;
    @Column(name = "hdphome+2_5_FT_T-72h") private BigDecimal hdphomePlus2_5_FT_TMinus72h;
    @Column(name = "hdphome+2_5_FT_T-48h") private BigDecimal hdphomePlus2_5_FT_TMinus48h;
    @Column(name = "hdphome+2_5_FT_T-24h") private BigDecimal hdphomePlus2_5_FT_TMinus24h;
    @Column(name = "hdphome+2_5_FT_T-12h") private BigDecimal hdphomePlus2_5_FT_TMinus12h;
    @Column(name = "hdphome+2_5_FT_T-30min") private BigDecimal hdphomePlus2_5_FT_TMinus30min;
    @Column(name = "hdphome+2_5_FT_T-15min") private BigDecimal hdphomePlus2_5_FT_TMinus15min;
    @Column(name = "hdphome+2_5_FT_T-5min") private BigDecimal hdphomePlus2_5_FT_TMinus5min;
    @Column(name = "hdphome+2_5_FT_T+55min") private BigDecimal hdphomePlus2_5_FT_TPlus55min;
    @Column(name = "hdphome+2_5_FT_T+98min") private BigDecimal hdphomePlus2_5_FT_TPlus98min;
    
    // Handicap Home +3 goals Full Time (LIVE)
    @Column(name = "hdphome+3_FT_T-120h") private BigDecimal hdphomePlus3_FT_TMinus120h;
    @Column(name = "hdphome+3_FT_T-96h") private BigDecimal hdphomePlus3_FT_TMinus96h;
    @Column(name = "hdphome+3_FT_T-72h") private BigDecimal hdphomePlus3_FT_TMinus72h;
    @Column(name = "hdphome+3_FT_T-48h") private BigDecimal hdphomePlus3_FT_TMinus48h;
    @Column(name = "hdphome+3_FT_T-24h") private BigDecimal hdphomePlus3_FT_TMinus24h;
    @Column(name = "hdphome+3_FT_T-12h") private BigDecimal hdphomePlus3_FT_TMinus12h;
    @Column(name = "hdphome+3_FT_T-30min") private BigDecimal hdphomePlus3_FT_TMinus30min;
    @Column(name = "hdphome+3_FT_T-15min") private BigDecimal hdphomePlus3_FT_TMinus15min;
    @Column(name = "hdphome+3_FT_T-5min") private BigDecimal hdphomePlus3_FT_TMinus5min;
    @Column(name = "hdphome+3_FT_T+55min") private BigDecimal hdphomePlus3_FT_TPlus55min;
    @Column(name = "hdphome+3_FT_T+98min") private BigDecimal hdphomePlus3_FT_TPlus98min;
    
    // Handicap Home +3.5 goals Full Time (LIVE)
    @Column(name = "hdphome+3_5_FT_T-120h") private BigDecimal hdphomePlus3_5_FT_TMinus120h;
    @Column(name = "hdphome+3_5_FT_T-96h") private BigDecimal hdphomePlus3_5_FT_TMinus96h;
    @Column(name = "hdphome+3_5_FT_T-72h") private BigDecimal hdphomePlus3_5_FT_TMinus72h;
    @Column(name = "hdphome+3_5_FT_T-48h") private BigDecimal hdphomePlus3_5_FT_TMinus48h;
    @Column(name = "hdphome+3_5_FT_T-24h") private BigDecimal hdphomePlus3_5_FT_TMinus24h;
    @Column(name = "hdphome+3_5_FT_T-12h") private BigDecimal hdphomePlus3_5_FT_TMinus12h;
    @Column(name = "hdphome+3_5_FT_T-30min") private BigDecimal hdphomePlus3_5_FT_TMinus30min;
    @Column(name = "hdphome+3_5_FT_T-15min") private BigDecimal hdphomePlus3_5_FT_TMinus15min;
    @Column(name = "hdphome+3_5_FT_T-5min") private BigDecimal hdphomePlus3_5_FT_TMinus5min;
    @Column(name = "hdphome+3_5_FT_T+55min") private BigDecimal hdphomePlus3_5_FT_TPlus55min;
    @Column(name = "hdphome+3_5_FT_T+98min") private BigDecimal hdphomePlus3_5_FT_TPlus98min;

    // Handicap Away -0.5 goals Half Time (NO-LIVE)
    @Column(name = "hdpaway-0_5_HT_T-120h") private BigDecimal hdpawayMinus0_5_HT_TMinus120h;
    @Column(name = "hdpaway-0_5_HT_T-96h") private BigDecimal hdpawayMinus0_5_HT_TMinus96h;
    @Column(name = "hdpaway-0_5_HT_T-72h") private BigDecimal hdpawayMinus0_5_HT_TMinus72h;
    @Column(name = "hdpaway-0_5_HT_T-48h") private BigDecimal hdpawayMinus0_5_HT_TMinus48h;
    @Column(name = "hdpaway-0_5_HT_T-24h") private BigDecimal hdpawayMinus0_5_HT_TMinus24h;
    @Column(name = "hdpaway-0_5_HT_T-12h") private BigDecimal hdpawayMinus0_5_HT_TMinus12h;
    @Column(name = "hdpaway-0_5_HT_T-30min") private BigDecimal hdpawayMinus0_5_HT_TMinus30min;
    @Column(name = "hdpaway-0_5_HT_T-15min") private BigDecimal hdpawayMinus0_5_HT_TMinus15min;
    @Column(name = "hdpaway-0_5_HT_T-5min") private BigDecimal hdpawayMinus0_5_HT_TMinus5min;

    // Handicap Away -1 goals Half Time (NO-LIVE)
    @Column(name = "hdpaway-1_HT_T-120h") private BigDecimal hdpawayMinus1_HT_TMinus120h;
    @Column(name = "hdpaway-1_HT_T-96h") private BigDecimal hdpawayMinus1_HT_TMinus96h;
    @Column(name = "hdpaway-1_HT_T-72h") private BigDecimal hdpawayMinus1_HT_TMinus72h;
    @Column(name = "hdpaway-1_HT_T-48h") private BigDecimal hdpawayMinus1_HT_TMinus48h;
    @Column(name = "hdpaway-1_HT_T-24h") private BigDecimal hdpawayMinus1_HT_TMinus24h;
    @Column(name = "hdpaway-1_HT_T-12h") private BigDecimal hdpawayMinus1_HT_TMinus12h;
    @Column(name = "hdpaway-1_HT_T-30min") private BigDecimal hdpawayMinus1_HT_TMinus30min;
    @Column(name = "hdpaway-1_HT_T-15min") private BigDecimal hdpawayMinus1_HT_TMinus15min;
    @Column(name = "hdpaway-1_HT_T-5min") private BigDecimal hdpawayMinus1_HT_TMinus5min;

    // Handicap Away -1.5 goals Half Time (NO-LIVE)
    @Column(name = "hdpaway-1_5_HT_T-120h") private BigDecimal hdpawayMinus1_5_HT_TMinus120h;
    @Column(name = "hdpaway-1_5_HT_T-96h") private BigDecimal hdpawayMinus1_5_HT_TMinus96h;
    @Column(name = "hdpaway-1_5_HT_T-72h") private BigDecimal hdpawayMinus1_5_HT_TMinus72h;
    @Column(name = "hdpaway-1_5_HT_T-48h") private BigDecimal hdpawayMinus1_5_HT_TMinus48h;
    @Column(name = "hdpaway-1_5_HT_T-24h") private BigDecimal hdpawayMinus1_5_HT_TMinus24h;
    @Column(name = "hdpaway-1_5_HT_T-12h") private BigDecimal hdpawayMinus1_5_HT_TMinus12h;
    @Column(name = "hdpaway-1_5_HT_T-30min") private BigDecimal hdpawayMinus1_5_HT_TMinus30min;
    @Column(name = "hdpaway-1_5_HT_T-15min") private BigDecimal hdpawayMinus1_5_HT_TMinus15min;
    @Column(name = "hdpaway-1_5_HT_T-5min") private BigDecimal hdpawayMinus1_5_HT_TMinus5min;

    // Handicap Away -2 goals Half Time (NO-LIVE)
    @Column(name = "hdpaway-2_HT_T-120h") private BigDecimal hdpawayMinus2_HT_TMinus120h;
    @Column(name = "hdpaway-2_HT_T-96h") private BigDecimal hdpawayMinus2_HT_TMinus96h;
    @Column(name = "hdpaway-2_HT_T-72h") private BigDecimal hdpawayMinus2_HT_TMinus72h;
    @Column(name = "hdpaway-2_HT_T-48h") private BigDecimal hdpawayMinus2_HT_TMinus48h;
    @Column(name = "hdpaway-2_HT_T-24h") private BigDecimal hdpawayMinus2_HT_TMinus24h;
    @Column(name = "hdpaway-2_HT_T-12h") private BigDecimal hdpawayMinus2_HT_TMinus12h;
    @Column(name = "hdpaway-2_HT_T-30min") private BigDecimal hdpawayMinus2_HT_TMinus30min;
    @Column(name = "hdpaway-2_HT_T-15min") private BigDecimal hdpawayMinus2_HT_TMinus15min;
    @Column(name = "hdpaway-2_HT_T-5min") private BigDecimal hdpawayMinus2_HT_TMinus5min;

    // Handicap Away -2.5 goals Half Time (NO-LIVE)
    @Column(name = "hdpaway-2_5_HT_T-120h") private BigDecimal hdpawayMinus2_5_HT_TMinus120h;
    @Column(name = "hdpaway-2_5_HT_T-96h") private BigDecimal hdpawayMinus2_5_HT_TMinus96h;
    @Column(name = "hdpaway-2_5_HT_T-72h") private BigDecimal hdpawayMinus2_5_HT_TMinus72h;
    @Column(name = "hdpaway-2_5_HT_T-48h") private BigDecimal hdpawayMinus2_5_HT_TMinus48h;
    @Column(name = "hdpaway-2_5_HT_T-24h") private BigDecimal hdpawayMinus2_5_HT_TMinus24h;
    @Column(name = "hdpaway-2_5_HT_T-12h") private BigDecimal hdpawayMinus2_5_HT_TMinus12h;
    @Column(name = "hdpaway-2_5_HT_T-30min") private BigDecimal hdpawayMinus2_5_HT_TMinus30min;
    @Column(name = "hdpaway-2_5_HT_T-15min") private BigDecimal hdpawayMinus2_5_HT_TMinus15min;
    @Column(name = "hdpaway-2_5_HT_T-5min") private BigDecimal hdpawayMinus2_5_HT_TMinus5min;

    // Handicap Away +0.5 goals Half Time (NO-LIVE)
    @Column(name = "hdpaway+0_5_HT_T-120h") private BigDecimal hdpawayPlus0_5_HT_TMinus120h;
    @Column(name = "hdpaway+0_5_HT_T-96h") private BigDecimal hdpawayPlus0_5_HT_TMinus96h;
    @Column(name = "hdpaway+0_5_HT_T-72h") private BigDecimal hdpawayPlus0_5_HT_TMinus72h;
    @Column(name = "hdpaway+0_5_HT_T-48h") private BigDecimal hdpawayPlus0_5_HT_TMinus48h;
    @Column(name = "hdpaway+0_5_HT_T-24h") private BigDecimal hdpawayPlus0_5_HT_TMinus24h;
    @Column(name = "hdpaway+0_5_HT_T-12h") private BigDecimal hdpawayPlus0_5_HT_TMinus12h;
    @Column(name = "hdpaway+0_5_HT_T-30min") private BigDecimal hdpawayPlus0_5_HT_TMinus30min;
    @Column(name = "hdpaway+0_5_HT_T-15min") private BigDecimal hdpawayPlus0_5_HT_TMinus15min;
    @Column(name = "hdpaway+0_5_HT_T-5min") private BigDecimal hdpawayPlus0_5_HT_TMinus5min;

    // Handicap Away +1 goals Half Time (NO-LIVE)
    @Column(name = "hdpaway+1_HT_T-120h") private BigDecimal hdpawayPlus1_HT_TMinus120h;
    @Column(name = "hdpaway+1_HT_T-96h") private BigDecimal hdpawayPlus1_HT_TMinus96h;
    @Column(name = "hdpaway+1_HT_T-72h") private BigDecimal hdpawayPlus1_HT_TMinus72h;
    @Column(name = "hdpaway+1_HT_T-48h") private BigDecimal hdpawayPlus1_HT_TMinus48h;
    @Column(name = "hdpaway+1_HT_T-24h") private BigDecimal hdpawayPlus1_HT_TMinus24h;
    @Column(name = "hdpaway+1_HT_T-12h") private BigDecimal hdpawayPlus1_HT_TMinus12h;
    @Column(name = "hdpaway+1_HT_T-30min") private BigDecimal hdpawayPlus1_HT_TMinus30min;
    @Column(name = "hdpaway+1_HT_T-15min") private BigDecimal hdpawayPlus1_HT_TMinus15min;
    @Column(name = "hdpaway+1_HT_T-5min") private BigDecimal hdpawayPlus1_HT_TMinus5min;
    
    // Handicap Away +1.5 goals Half Time (NO-LIVE)
    @Column(name = "hdpaway+1_5_HT_T-120h") private BigDecimal hdpawayPlus1_5_HT_TMinus120h;
    @Column(name = "hdpaway+1_5_HT_T-96h") private BigDecimal hdpawayPlus1_5_HT_TMinus96h;
    @Column(name = "hdpaway+1_5_HT_T-72h") private BigDecimal hdpawayPlus1_5_HT_TMinus72h;
    @Column(name = "hdpaway+1_5_HT_T-48h") private BigDecimal hdpawayPlus1_5_HT_TMinus48h;
    @Column(name = "hdpaway+1_5_HT_T-24h") private BigDecimal hdpawayPlus1_5_HT_TMinus24h;
    @Column(name = "hdpaway+1_5_HT_T-12h") private BigDecimal hdpawayPlus1_5_HT_TMinus12h;
    @Column(name = "hdpaway+1_5_HT_T-30min") private BigDecimal hdpawayPlus1_5_HT_TMinus30min;
    @Column(name = "hdpaway+1_5_HT_T-15min") private BigDecimal hdpawayPlus1_5_HT_TMinus15min;
    @Column(name = "hdpaway+1_5_HT_T-5min") private BigDecimal hdpawayPlus1_5_HT_TMinus5min;
    
    // Handicap Away +2 goals Half Time (NO-LIVE)
    @Column(name = "hdpaway+2_HT_T-120h") private BigDecimal hdpawayPlus2_HT_TMinus120h;
    @Column(name = "hdpaway+2_HT_T-96h") private BigDecimal hdpawayPlus2_HT_TMinus96h;
    @Column(name = "hdpaway+2_HT_T-72h") private BigDecimal hdpawayPlus2_HT_TMinus72h;
    @Column(name = "hdpaway+2_HT_T-48h") private BigDecimal hdpawayPlus2_HT_TMinus48h;
    @Column(name = "hdpaway+2_HT_T-24h") private BigDecimal hdpawayPlus2_HT_TMinus24h;
    @Column(name = "hdpaway+2_HT_T-12h") private BigDecimal hdpawayPlus2_HT_TMinus12h;
    @Column(name = "hdpaway+2_HT_T-30min") private BigDecimal hdpawayPlus2_HT_TMinus30min;
    @Column(name = "hdpaway+2_HT_T-15min") private BigDecimal hdpawayPlus2_HT_TMinus15min;
    @Column(name = "hdpaway+2_HT_T-5min") private BigDecimal hdpawayPlus2_HT_TMinus5min;

    // Handicap Away +2.5 goals Half Time (NO-LIVE)
    @Column(name = "hdpaway+2_5_HT_T-120h") private BigDecimal hdpawayPlus2_5_HT_TMinus120h;
    @Column(name = "hdpaway+2_5_HT_T-96h") private BigDecimal hdpawayPlus2_5_HT_TMinus96h;
    @Column(name = "hdpaway+2_5_HT_T-72h") private BigDecimal hdpawayPlus2_5_HT_TMinus72h;
    @Column(name = "hdpaway+2_5_HT_T-48h") private BigDecimal hdpawayPlus2_5_HT_TMinus48h;
    @Column(name = "hdpaway+2_5_HT_T-24h") private BigDecimal hdpawayPlus2_5_HT_TMinus24h;
    @Column(name = "hdpaway+2_5_HT_T-12h") private BigDecimal hdpawayPlus2_5_HT_TMinus12h;
    @Column(name = "hdpaway+2_5_HT_T-30min") private BigDecimal hdpawayPlus2_5_HT_TMinus30min;
    @Column(name = "hdpaway+2_5_HT_T-15min") private BigDecimal hdpawayPlus2_5_HT_TMinus15min;
    @Column(name = "hdpaway+2_5_HT_T-5min") private BigDecimal hdpawayPlus2_5_HT_TMinus5min;
    
}