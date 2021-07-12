package com.vpk.tutorial.kafkaconsumerservice.model;

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
