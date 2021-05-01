package com.javateam.medicalcenter.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

//@Entity
//@Id @GeneratedValue
//Extends User
public class Employee {

    Employee employee = new Employee();

    private String employeePosition;
    private BigDecimal salary;
    private int hireDate;

    public Employee () {

    }




}








