package com.vpk.tutorial.kafkaproducerservice.controller;

import com.vpk.tutorial.kafkaproducerservice.messaging.producer.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private static final Logger logger = LoggerFactory.getLogger(MessageController.class);

    @Autowired
    private Producer producer;

    @PostMapping("/message")
    public ResponseEntity<Void> create(@RequestParam String message){
        producer.send(message);
        logger.info(message);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
