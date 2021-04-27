package com.javateam.medicalcenter.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="APPOINTMENT")
@Data
@NoArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue
    @Column(name = "APPOINTMENT_ID")
    private Long appointment_id;

}
