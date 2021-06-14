package com.javateam.medicalcenter.appointments.domain;

import com.javateam.medicalcenter.doctors.domain.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
    Iterable<Appointment> findByPatientId(Long patientId);

    Iterable<Appointment> findByDoctor(Doctor doctor);
}


