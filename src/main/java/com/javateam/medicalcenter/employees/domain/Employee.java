package com.javateam.medicalcenter.employees.domain;

import com.javateam.medicalcenter.appointments.domain.Appointment;
import com.javateam.medicalcenter.users.domain.User;
import lombok.*;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.springframework.context.annotation.Scope;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;

@Table(name = "EMPLOYEES")
@DiscriminatorValue("Employee")
@Entity
@Data
@Scope("prototype")
//@Setter(value=AccessLevel.NONE)
public abstract class Employee extends User implements PhysicalNamingStrategy {

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
    @JoinColumn(name = "id", nullable = false)
    private Appointment appointment;

}








