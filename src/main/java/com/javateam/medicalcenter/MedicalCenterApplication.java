package com.javateam.medicalcenter;

import com.javateam.medicalcenter.appointments.domain.Appointment;
import com.javateam.medicalcenter.patients.domain.Patient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MedicalCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(MedicalCenterApplication.class, args);

        Patient patient = new Patient();
        Appointment appointment = new Appointment();

        Util util = new Util();
        util.getConnection("ss","ss");




    }
}





