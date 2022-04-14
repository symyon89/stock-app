package com.example.stockapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Comenzi {
    @Id
    private Integer id;

    @ManyToOne
    private Produse produse;

    @Enumerated
    private StatusComanda statusComanda;
}
