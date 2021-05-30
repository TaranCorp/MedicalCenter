package com.javateam.medicalcenter.employees.domain;

import com.javateam.medicalcenter.users.domain.BasicUser;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
public abstract class Employee extends BasicUser {


    private int hireDate;
    private BigDecimal salary;
    private String jobTitle;

    @OneToMany()
    @JoinColumn(name = "employee_id")
    private List<Employee> allEmployees;

}








