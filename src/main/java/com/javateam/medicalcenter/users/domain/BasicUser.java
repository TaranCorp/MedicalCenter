package com.javateam.medicalcenter.users.domain;

import com.javateam.medicalcenter.appointments.domain.Appointment;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;

@MappedSuperclass
@Data
@NoArgsConstructor
public abstract class BasicUser extends User {

        private String name;
        private String surname;
        private Long pesel;
        private Time dateOfBirth;
        private boolean isMale;
        private String email;

}
