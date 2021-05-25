package com.javateam.medicalcenter.service;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.sun.istack.NotNull;
import lombok.Getter;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;


@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
@Documented
@Component
public @interface UseCaseInterfaceAsAnnotation {

    @AliasFor(annotation = Component.class)
    String value() default "";

    @Getter
    final class RegisterPatientCommand {

        @NotNull
        private final String patientName;
        @NotNull
        private final String PatientLastName;

        @JsonCreator

        public RegisterPatientCommand(String patientName, String patientLastName) {
            this.patientName = patientName;
            PatientLastName = patientLastName;
        }


    }

}
