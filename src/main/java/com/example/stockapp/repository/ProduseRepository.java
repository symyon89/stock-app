package com.example.stockapp.repository;

import com.example.stockapp.model.Produse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduseRepository extends JpaRepository<Produse, Integer> {
}