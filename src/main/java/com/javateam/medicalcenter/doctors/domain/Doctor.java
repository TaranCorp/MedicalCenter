package com.javateam.medicalcenter.doctors.domain;

import com.javateam.medicalcenter.appointments.domain.Appointment;
import com.javateam.medicalcenter.employees.domain.Employee;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TBL_DOCTORS")
@DiscriminatorValue("Doctor")
@AllArgsConstructor
@NoArgsConstructor

public abstract class Doctor extends Employee {

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;

}
