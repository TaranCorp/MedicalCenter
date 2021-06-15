package com.javateam.medicalcenter.appointments.web;

import com.javateam.medicalcenter.appointments.application.AppointmentService;
import com.javateam.medicalcenter.appointments.domain.Appointment;
import com.javateam.medicalcenter.doctors.application.port.DoctorCatalogUseCase;
import com.javateam.medicalcenter.doctors.domain.Doctor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentService appointmentService;
    private final DoctorCatalogUseCase doctorCatalog;


    @GetMapping(value = "/api/appointments")
    Iterable<Appointment> getAppointmentsForDoctor(@RequestParam(required = false) Long doctorId) {
        if (doctorId != null) {
            Optional<Doctor> doctor = doctorCatalog.findById(doctorId);
            return doctor.map(appointmentService::findByDoctor).orElse(Collections.emptyList());
        }
        return appointmentService.findAll();
    }

}
