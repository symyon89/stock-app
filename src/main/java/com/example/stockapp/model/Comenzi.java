package com.example.stockapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Comenzi {
    @Id
    private Integer id;

    @OneToMany
    private List<Produse> produse;

    @Enumerated
    private StatusComanda statusComanda;
}
