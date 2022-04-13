package com.example.stockapp.controller;

import com.example.stockapp.dto.ComenziDto;
import com.example.stockapp.dto.ProduseListDto;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ComenziController {

    private RabbitTemplate rabbitTemplate;
    private ProduseListDto produseListDto;

    @PostMapping("COMENZI")
    public String comenzi(@RequestBody ComenziDto comenziDto){
        System.out.println(comenziDto.toString());
        return "ok";
    }
}
