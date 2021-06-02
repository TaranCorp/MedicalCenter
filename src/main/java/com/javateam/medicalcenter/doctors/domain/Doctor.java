package com.javateam.medicalcenter.doctors.domain;

import com.javateam.medicalcenter.employees.domain.Employee;
import com.javateam.medicalcenter.employees.domain.Specialization;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;

@Entity
@DiscriminatorValue("Doctor")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Doctor extends Employee {

    private Specialization specialization;

    public Doctor(Specialization specialization, String email, String name, String surname, Time dateOfBirth, Long pesel,  int hireDate, BigDecimal salary) {


    }
}
