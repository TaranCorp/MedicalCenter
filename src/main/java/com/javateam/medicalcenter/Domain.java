package com.javateam.medicalcenter;

import com.javateam.medicalcenter.employees.domain.Employee;
import com.javateam.medicalcenter.employees.infrastructure.EmployeeSQLRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class Domain {

    public static void main(String[] args) {


        Util util = new Util();
        util.getConnection();
        EmployeeSQLRepository employeeSQLRepository = new EmployeeSQLRepository();

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        Employee surgeon = new Employee("Surgeon", BigDecimal.valueOf(1200), 2020);
//        Employee asd = context.getBean(17, "Dorota", "Szeremet", 333444555, 12-07-1984,
//                "Nurse", 4500, Time.valueOf(123), "d.szeremet@medicalcenter.pl");
//        employeeService.add(surgeon);

        Employee doctor = context.getBean("myEmployee", Employee.class);


        System.out.println(doctor.getEmployeePosition());


    }


}


