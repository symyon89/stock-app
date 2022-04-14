package com.example.stockapp.service;

import com.example.stockapp.dto.ProduseDto;
import com.example.stockapp.model.Produse;
import com.example.stockapp.model.StatusComanda;
import com.example.stockapp.repository.ProduseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.NoSuchElementException;

@Service
@Transactional
@RequiredArgsConstructor
public class ComenziService {


    private final ProduseRepository produseRepository;

    public StatusComanda processOrder(ProduseDto produseDto) {
        Produse  produse = findById(produseDto);
        if (this.checkIfIsStock(produseDto.getStoc(),produse.getStoc())){
            produse.setStoc(produse.getStoc()-produseDto.getStoc());
            this.save(produse);
            return StatusComanda.ACCEPTAT;
        } else {
            return StatusComanda.STOC_INSUFICIENT;
        }
    }

    private Produse findById(ProduseDto produseDto){
        return produseRepository.findById(produseDto.getId()).orElseThrow(NoSuchElementException::new);
    }
    private void save(Produse produse) {
        produseRepository.save(produse);
    }

    private boolean checkIfIsStock(Integer request, Integer stock) {
        return stock >= request;
    }
}
