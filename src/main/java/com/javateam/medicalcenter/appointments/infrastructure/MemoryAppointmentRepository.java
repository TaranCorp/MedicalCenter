package com.javateam.medicalcenter.appointments.infrastructure;

import com.javateam.medicalcenter.appointments.domain.Appointment;
import com.javateam.medicalcenter.doctors.domain.Doctor;
import com.javateam.medicalcenter.patients.domain.Patient;
import com.javateam.medicalcenter.appointments.domain.AppointmentRepository;
import org.springframework.stereotype.Service;

@Service
public class MemoryAppointmentRepository {
    private final AppointmentRepository appointmentRepository;

    public MemoryAppointmentRepository(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public Appointment addAppointment(Appointment appointment) {
        //todo: check if exists
        return appointmentRepository.save(appointment);
    }

    public Iterable<Appointment> findAll() {
        return appointmentRepository.findAll();
    }

    public Appointment findById(Long id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    Iterable<Appointment> findByPatientId(Long patientId) {
        return appointmentRepository.findByPatientId(patientId);
    }

    Iterable<Appointment> findByDoctor(Doctor doctor) {
        return appointmentRepository.findByDoctor(doctor);
    }
}
