package com.vpk.tutorial.kafkaproducerservice.messaging.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    @Value("${kafka.topic.name}")
    private String topic;

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void send(String message){
        kafkaTemplate.send(topic,message);
    }
}
