package com.javateam.medicalcenter.appointments.domain;

import com.javateam.medicalcenter.doctors.domain.Doctor;
import com.javateam.medicalcenter.patients.domain.Patient;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="APPOINTMENT")
@Data
@NoArgsConstructor
@EnableAutoConfiguration

public class Appointment {
    @Id
    @GeneratedValue
    @Column(name="appointment_id")
    private Long id;

    private LocalDate appDate;

    private LocalTime appTime;

    private String interview;

    private String diagnose;

    private String recommendations;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="doctor_id")
    private Doctor doctor;

}
