package com.javateam.medicalcenter.doctors.domain;
import com.javateam.medicalcenter.appointments.domain.Appointment;
import com.javateam.medicalcenter.users.domain.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.List;


@Entity
@Table(name="DOCTORS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Doctor extends Employee {

    @Id
    @GeneratedValue
    private Long doctorId;
    private Specialization specialization;
    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;

    public Doctor(Specialization specialization, String email, String name, String surname, Time dateOfBirth, Long pesel, int hireDate, BigDecimal salary) {


    }
}
