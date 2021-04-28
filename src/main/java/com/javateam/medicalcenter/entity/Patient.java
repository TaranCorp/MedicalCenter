package com.javateam.medicalcenter.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Patient extends User {
    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;
}
