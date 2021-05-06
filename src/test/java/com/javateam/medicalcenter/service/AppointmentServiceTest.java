package com.javateam.medicalcenter.service;

import com.javateam.medicalcenter.entity.Appointment;
import com.javateam.medicalcenter.repository.AppointmentRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

class AppointmentServiceTest {
    AppointmentRepository appointmentRepository = mock(AppointmentRepository.class);
    AppointmentService service = new AppointmentService(appointmentRepository);

    @Test
    void add_whenNotNull_expectAdding() {
        Appointment app1 = new Appointment();
        service.addAppointment(app1);
        verify(appointmentRepository).save(app1);
    }

    @Test
    void findAll_always_expectInvokeFindAll() {
        service.findAll();
        verify(appointmentRepository).findAll();
    }

    @Test
    void findById_existingId_returnAppointment() {
        when(appointmentRepository.findById(anyLong())).thenReturn(java.util.Optional.of(new Appointment()));
        Appointment app1 = service.findById(1l);
        verify(appointmentRepository).findById(anyLong());
        assertThat(app1).isNotNull();
    }

    @Test
    void findByPatient() {
    }

    @Test
    void findByDoctor() {
    }
}