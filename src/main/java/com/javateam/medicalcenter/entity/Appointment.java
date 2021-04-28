package com.javateam.medicalcenter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.internal.build.AllowPrintStacktrace;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="APPOINTMENT")
@Data
@NoArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDate appDate;

    private LocalTime appTime;

    private String interview;

    private String diagnose;

    private String recommendations;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Doctor doctor;

}
