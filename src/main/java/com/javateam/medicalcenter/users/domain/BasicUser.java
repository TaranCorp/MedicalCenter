package com.javateam.medicalcenter.users.domain;

import com.javateam.medicalcenter.appointments.domain.Appointment;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public abstract class BasicUser extends User {

        private String name;
        private String surname;
        private Long pesel;
        private Time dateOfBirth;
        private boolean isMale;
        private String email;
        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        @JoinColumn(name = "appointment_id")
        private List<Appointment> appointments;

}
