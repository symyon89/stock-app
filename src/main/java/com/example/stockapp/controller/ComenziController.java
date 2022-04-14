package com.example.stockapp.controller;

import com.example.stockapp.dto.ProduseDto;
import com.example.stockapp.model.StatusComanda;
import com.example.stockapp.service.ComenziService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import static com.example.stockapp.config.MessegeQueueConfig.REZULTATE_COMENZI;

@Component
@Slf4j
@RequiredArgsConstructor
public class ComenziController {

    private final ComenziService comenziService;
    private final RabbitTemplate rabbitTemplate;
    private final DirectExchange exchange;

    @RabbitListener(queues = "COMENZI")
    public void messageListener(ProduseDto produseDto){
    //log.info("Order recived : ",produseDto );
        StatusComanda comanda= comenziService.processOrder(produseDto);
        rabbitTemplate.convertAndSend(exchange.getName(),REZULTATE_COMENZI,comanda);
    }



}
