package com.vpk.tutorial.kafkaproducerservice.messaging.producer;

import com.vpk.tutorial.kafkaproducerservice.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeProducer {

    @Value("${kafka.employee.topic.name}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, Employee> kafkaTemplate;

    public void send(Employee employee){
        kafkaTemplate.send(topic,employee);
    }
}
