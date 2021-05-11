package com.javateam.medicalcenter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MedicalCenterApplication {
    private final Logger log = LoggerFactory.getLogger(MedicalCenterApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MedicalCenterApplication.class, args);

        Util util = new Util();
        util.getConnection();


    }

    public void process(String input) {
        if (log.isDebugEnabled()) {
            log.debug("Processing appointment: {}", input);
        }
    }


}
