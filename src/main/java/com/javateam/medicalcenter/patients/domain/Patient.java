package com.javateam.medicalcenter.patients.domain;

import com.javateam.medicalcenter.appointments.domain.Appointment;
import com.javateam.medicalcenter.users.domain.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;

@Table(name="TBL_PATIENTS")
@Entity
@DiscriminatorValue("Patient")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor

public class Patient extends User {

    @Column(name = "FIRST_NAME")
    private String name;
    @Column(name = "FAMILY_NAME")
    private String surname;
    @Column(name = "PESEL")
    private Long pesel;
    @Column(name = "DATE_OF_BIRTH")
    private Time dateOfBirth;
    @Column(name = "SEX")
    private boolean isMale;
    @Column(name = "MAIL")
    private String email;
    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;
}
