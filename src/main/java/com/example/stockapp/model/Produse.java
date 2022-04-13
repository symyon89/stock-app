package com.example.stockapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Produse {
    @Id
    private Integer id;
    private String numeProdus;
    private Integer stoc;
}
