package com.javateam.medicalcenter;

import com.javateam.medicalcenter.entity.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MedicalCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(MedicalCenterApplication.class, args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee = context.getBean("myEmployee", Employee.class);

        System.out.println(employee.getEmployeePosition());


    }
}
