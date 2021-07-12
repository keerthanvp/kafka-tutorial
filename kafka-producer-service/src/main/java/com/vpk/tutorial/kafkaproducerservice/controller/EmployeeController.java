package com.vpk.tutorial.kafkaproducerservice.controller;

import com.vpk.tutorial.kafkaproducerservice.messaging.producer.EmployeeProducer;
import com.vpk.tutorial.kafkaproducerservice.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeProducer producer;

    @PostMapping("/employee")
    public ResponseEntity<Void> create(@RequestBody Employee employee){
        producer.send(employee);
        logger.info(employee.toString());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
