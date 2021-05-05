package com.javateam.medicalcenter.repository;

import com.javateam.medicalcenter.entity.Appointment;
import com.javateam.medicalcenter.entity.Doctor;
import com.javateam.medicalcenter.entity.Patient;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
    Iterable<Appointment> findByPatient(Patient patient);

    Iterable<Appointment> findByDoctor(Doctor doctor);
}


