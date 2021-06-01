package com.javateam.medicalcenter.doctors.application.port;

import com.javateam.medicalcenter.doctors.domain.Doctor;
import com.javateam.medicalcenter.employees.domain.Specialization;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public interface DoctorCatalogUseCase {

    List<Doctor> findAll();

    Optional<Doctor> findById(Long id);

    List<Doctor> findBySurname(String surname);

    List<Doctor> findByNameAndSurname(String name, String surname);

    List<Doctor> findBySpecialization(String specialization);

    Doctor addDoctor(CreateDoctorCommand command);

    void removeById(Long id);

    UpdateDoctorResponse updateDoctor(UpdateDoctorCommand command);


    @Value
    class CreateDoctorCommand {
        Specialization specialization;
        int hireDate;
        BigDecimal salary;
        String name;
        String surname;
        Long pesel;
        Time dateOfBirth;
        boolean isMale;
        String email;
    }

    @Value
    @Builder
    @AllArgsConstructor
    class UpdateDoctorCommand {
        Long id;
        Specialization specialization;
        int hireDate;
        BigDecimal salary;
        String name;
        String surname;
        Long pesel;
        Time dateOfBirth;
        String email;
    }

    @Value
    class UpdateDoctorResponse {
        boolean success;
        List<String> errors;

        public static UpdateDoctorResponse SUCCESS = new UpdateDoctorResponse(true, Collections.emptyList());
    }
}
