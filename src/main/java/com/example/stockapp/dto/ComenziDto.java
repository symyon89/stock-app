package com.example.stockapp.dto;

import com.example.stockapp.model.StatusComanda;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ComenziDto implements Serializable {
    private Integer id;
    private ProduseDto produse;
    private StatusComanda statusComanda;
}
