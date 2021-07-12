package com.vpk.tutorial.kafkaconsumerservice.messaging.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(id = "group1",topics = "#{'${kafka.topic.name}'.split(',')}",
            containerFactory = "kafkaListenerContainerFactory")
    public void listen(String message){
        logger.info(message);
    }
}
