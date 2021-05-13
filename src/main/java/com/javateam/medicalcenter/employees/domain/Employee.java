package com.javateam.medicalcenter.employees.domain;

import com.javateam.medicalcenter.users.domain.User;
import lombok.*;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;

@Table(name="TBL_EMPLOYEES")
@DiscriminatorValue("Employee")
@Entity
@RequiredArgsConstructor
@Getter
@Setter
public abstract class Employee extends User {

    @Column(name = "FIRST_NAME")
    private String name;
    @Column(name = "FAMILY_NAME")
    private String surname;
    @Column(name = "POSITION")
    private String employeePosition;
    @Column(name = "SALARY")
    private int hireDate;
    @Column(name = "PESEL")
    private BigDecimal salary;
    @Column(name = "HIRE_DATE")
    private Long pesel;
    @Column(name = "DATE_OF_BIRTH")
    private Time dateOfBirth;
    @Column(name = "SEX")
    private boolean isMale;
    @Column(name = "MAIL")
    private String email;

}








