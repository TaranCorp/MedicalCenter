package com.javateam.medicalcenter.service;

import com.javateam.medicalcenter.entity.Appointment;
import com.javateam.medicalcenter.entity.Doctor;
import com.javateam.medicalcenter.entity.Patient;
import com.javateam.medicalcenter.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    Iterable<Appointment> findByPatient(Patient patient) {
        return appointmentRepository.findByPatient(patient);
    }

    Iterable<Appointment> findByDoctor(Doctor doctor) {
        return appointmentRepository.findByDoctor(doctor);
    }
}
