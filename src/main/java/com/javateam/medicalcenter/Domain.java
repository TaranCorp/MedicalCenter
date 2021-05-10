package com.javateam.medicalcenter;

import com.javateam.medicalcenter.service.EmployeeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import java.sql.SQLException;

@Service
public class Domain {

    public static void main(String[] args) throws SQLException {


        Util util = new Util();
        util.getConnection();

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


    }


}


