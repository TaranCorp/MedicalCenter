package com.javateam.medicalcenter.employees.domain;

import com.javateam.medicalcenter.appointments.domain.Appointment;
import com.javateam.medicalcenter.users.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name="TBL_DOCTORS")
@DiscriminatorValue("Doctor")
@AllArgsConstructor
@NoArgsConstructor

public class Doctor extends Employee {

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;

}
