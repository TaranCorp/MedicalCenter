package com.javateam.medicalcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;


@SpringBootApplication
public class MedicalCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(MedicalCenterApplication.class, args);

        Util util = new Util();
        util.getConnection();
    }
}





