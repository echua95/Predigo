package com.example.backend_api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OddsId implements Serializable {
    private Integer matchid;
    private Integer betoperatorid;
}

