package com.vpk.tutorial.kafkaconsumerservice.messaging.deserializer;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vpk.tutorial.kafkaconsumerservice.model.Employee;
import org.apache.kafka.common.serialization.Deserializer;

public class EmployeeDeserializer implements Deserializer<Employee> {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Employee deserialize(String s, byte[] bytes) {
        objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        Employee employee;
        try{
            employee = objectMapper.readValue(bytes,Employee.class);
        }catch (Exception e){
            throw new RuntimeException("Exception in deserializer");
        }
        return employee;
    }
}

