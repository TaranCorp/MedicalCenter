package com.javateam.medicalcenter.users.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@MappedSuperclass
@Data
public abstract class Employee extends BasicUser {


    private int hireDate;
    private BigDecimal salary;
    private String jobTitle;

}








