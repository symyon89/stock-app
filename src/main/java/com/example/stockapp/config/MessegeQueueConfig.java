package com.example.stockapp.config;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class MessegeQueueConfig {
//    @Bean
//    public ApplicationRunner runner(AmqpTemplate template) {
//        return args -> template.convertAndSend("COMENZI", "foo");
//    }
//
//    @Bean
//    public Queue myQueue() {
//        return new Queue("COMENZI");
//    }



}
