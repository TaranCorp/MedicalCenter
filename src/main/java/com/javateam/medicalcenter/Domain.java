package com.javateam.medicalcenter;

import com.javateam.medicalcenter.entity.Employee;
import com.javateam.medicalcenter.service.EmployeeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.sql.SQLException;

public class Domain {

    public static void main(String[] args) throws SQLException {


        Util util = new Util();
        util.getConnection();
        EmployeeService employeeService = new EmployeeService();

        Employee surgeon = new Employee("Surgeon", BigDecimal.valueOf(1200), 2020);
        employeeService.add(surgeon);
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee doctor = context.getBean("myEmployee", Employee.class);
        EmployeeService service = new EmployeeService();
        Employee newDoctor = new Employee ("Surgeon", BigDecimal.valueOf(1200), 2020);
        service.add(newDoctor);

        System.out.println(doctor.getEmployeePosition());


    }


}


