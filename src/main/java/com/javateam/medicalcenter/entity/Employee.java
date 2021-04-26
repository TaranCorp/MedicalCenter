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
public class Employee {

    private long employeeId;
    private String firstName;
    private String lastName;
    private String employeePosition;
    private BigDecimal salary;
    private int hireDate;


}







