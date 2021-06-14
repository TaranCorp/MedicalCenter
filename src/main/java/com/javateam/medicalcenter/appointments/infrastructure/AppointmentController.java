package com.javateam.medicalcenter.appointments.infrastructure;

import com.javateam.medicalcenter.appointments.application.AppointmentService;
import com.javateam.medicalcenter.appointments.domain.Appointment;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentService appointmentService;

    @GetMapping(value = "/api/appointments")
    Iterable<Appointment> getAppointmentsForDoctor() {
        return appointmentService.findAll();
    }
}
