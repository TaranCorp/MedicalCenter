package com.javateam.medicalcenter;

import com.javateam.medicalcenter.appointments.domain.Appointment;
import com.javateam.medicalcenter.appointments.domain.AppointmentRepository;
import com.javateam.medicalcenter.employees.domain.Employee;
import com.javateam.medicalcenter.employees.infrastructure.MemoryEmployeeRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AppointmentRepository appointmentRepository;
    private MemoryEmployeeRepository memoryEmployeeRepository;

    public DevBootstrap(AppointmentRepository appointmentRepository, MemoryEmployeeRepository memoryEmployeeRepository) {
        this.appointmentRepository = appointmentRepository;
        this.memoryEmployeeRepository = memoryEmployeeRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        Employee test = new Employee();
        Appointment testAppointment = new Appointment();
        testAppointment.getId();

        memoryEmployeeRepository.save(test);
        appointmentRepository.save(testAppointment);



    }
}
