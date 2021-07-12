package com.vpk.tutorial.kafkaconsumerservice.messaging.consumer;

import com.vpk.tutorial.kafkaconsumerservice.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EmployeeConsumer {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeConsumer.class);

    @KafkaListener(id = "employee-group-1",topics = "#{'${kafka.employee.topic.name}'.split(',')}",
            containerFactory = "employeeKafkaListenerContainerFactory")
    public void listen(Employee employee){
        logger.info(employee.toString());
    }
}
