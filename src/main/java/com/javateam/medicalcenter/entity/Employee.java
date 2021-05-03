package com.javateam.medicalcenter.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
//@Table(name="TBL_EMPLOYEES")
//@Id
//@GeneratedValue
@Entity
@Component("myEmployee")
public class Employee extends User {


    private String employeePosition;
    private BigDecimal salary;
    private int hireDate;

    public Employee() {

    }


}








