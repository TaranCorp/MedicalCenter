package com.javateam.medicalcenter.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@AllArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@ToString

//@Entity
//@Id @GeneratedValue
public class Employee {

    private long id;
    private String firstName;
    private String lastName;
    private String employeePosition;


}







