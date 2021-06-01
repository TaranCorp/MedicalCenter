package com.javateam.medicalcenter.doctors.domain;

import com.javateam.medicalcenter.employees.domain.Employee;
import com.javateam.medicalcenter.employees.domain.Specialization;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Doctor")
@AllArgsConstructor
@NoArgsConstructor
public class Doctor extends Employee {

    private Specialization specialization;
}
