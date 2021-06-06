package com.javateam.medicalcenter.patients.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SqlPatientRepository extends JpaRepository<Patient, Integer>, PatientRepository {
}
