package com.javateam.medicalcenter.patients.model;

import java.util.List;
import java.util.Optional;

public interface PatientRepository {
    List<Patient> findAll();

    Optional<Patient> findById(Integer id);

    Patient save(Patient patient);

    boolean existsById(Integer id);
}
