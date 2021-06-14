package com.javateam.medicalcenter.patients.domain;
import com.javateam.medicalcenter.appointments.domain.Appointment;
import com.javateam.medicalcenter.users.domain.BasicUser;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="PATIENTS")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Patient extends BasicUser {

    @Id
    @GeneratedValue
    private Long patientId;
    @OneToMany(mappedBy="patient")
    private List<Appointment> appointments;
}
