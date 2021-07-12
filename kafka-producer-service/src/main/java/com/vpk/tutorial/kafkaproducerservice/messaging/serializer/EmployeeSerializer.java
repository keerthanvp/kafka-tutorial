package com.vpk.tutorial.kafkaproducerservice.messaging.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vpk.tutorial.kafkaproducerservice.model.Employee;
import org.apache.kafka.common.serialization.Serializer;

public class EmployeeSerializer implements Serializer<Employee> {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public byte[] serialize(String s, Employee employee) {
        byte[] serializedData;
        try{
            serializedData = objectMapper.writeValueAsBytes(employee);
        }catch (Exception e){
            throw new RuntimeException("Exception while Serializing Employee");
        }
        return serializedData;
    }
}
