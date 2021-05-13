package com.javateam.medicalcenter.repository;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.sun.istack.NotNull;
import lombok.Getter;

public interface RegisterPatientUseCase {

    void registerPatient();


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
