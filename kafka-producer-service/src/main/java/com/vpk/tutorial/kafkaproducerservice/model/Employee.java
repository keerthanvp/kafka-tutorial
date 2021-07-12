package com.vpk.tutorial.kafkaproducerservice.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    private int id;
    private String name;
    private int age;
    private int salary;
}
