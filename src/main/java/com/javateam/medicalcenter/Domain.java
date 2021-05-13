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


    }


}


