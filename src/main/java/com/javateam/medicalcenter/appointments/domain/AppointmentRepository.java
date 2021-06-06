package com.javateam.medicalcenter.appointments.domain;

import com.javateam.medicalcenter.doctors.domain.Doctor;
import com.javateam.medicalcenter.patients.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
    Iterable<Appointment> findByPatient(Patient patient);

    Iterable<Appointment> findByDoctor(Doctor doctor);
}


