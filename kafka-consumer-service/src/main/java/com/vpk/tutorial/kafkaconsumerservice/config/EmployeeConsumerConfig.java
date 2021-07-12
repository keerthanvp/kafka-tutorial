package com.vpk.tutorial.kafkaconsumerservice.config;

import com.vpk.tutorial.kafkaconsumerservice.messaging.deserializer.EmployeeDeserializer;
import com.vpk.tutorial.kafkaconsumerservice.model.Employee;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class EmployeeConsumerConfig {

    @Value("${kafka.consumer.bootstrap-servers}")
    private String bootstrapServer;

    @Value("${kafka.consumer.employee-group-id}")
    private String groupId;

    @Bean
    public ConsumerFactory<String, Employee> employeeConsumerFactory(){
        Map<String,Object> props = new HashMap<>();
        props.put(org.apache.kafka.clients.consumer.ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServer);
        props.put(org.apache.kafka.clients.consumer.ConsumerConfig.GROUP_ID_CONFIG,groupId);
        props.put(org.apache.kafka.clients.consumer.ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(org.apache.kafka.clients.consumer.ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, EmployeeDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(props);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,Employee> employeeKafkaListenerContainerFactory(){
        ConcurrentKafkaListenerContainerFactory<String,Employee> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(employeeConsumerFactory());
        return factory;
    }

}
