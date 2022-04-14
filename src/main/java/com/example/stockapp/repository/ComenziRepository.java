package com.example.stockapp.repository;

import com.example.stockapp.model.Comenzi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComenziRepository extends JpaRepository<Comenzi, Integer> {
}