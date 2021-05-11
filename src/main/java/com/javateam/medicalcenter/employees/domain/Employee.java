package com.javateam.medicalcenter.employees.domain;

//import org.hibernate.boot.model.naming.PhysicalNamingStrategy;

import com.javateam.medicalcenter.appointments.domain.Appointment;
import com.javateam.medicalcenter.users.domain.User;
import lombok.*;
import org.springframework.context.annotation.Scope;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

@DiscriminatorValue("Employee")
@Entity
@Data
@Scope("prototype")
//@Setter(value=AccessLevel.NONE)
public class Employee extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public Long getId() {
        return super.getId();
    }

    private String name;

    private String surname;

    private String employeePosition;

    private int hireDate;

    private BigDecimal salary;

    private Long pesel;

    private Time dateOfBirth;

    private boolean isMale;

    private String email;

    @OneToMany
    @JoinColumn
    private Set<Appointment> appointment = new HashSet<>();




}








