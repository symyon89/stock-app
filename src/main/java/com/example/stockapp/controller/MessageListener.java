package com.example.stockapp.controller;

import com.example.stockapp.dto.ComenziDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = "COMENZI")
    public void messageListener(ComenziDto comenziDto){

    }

}
