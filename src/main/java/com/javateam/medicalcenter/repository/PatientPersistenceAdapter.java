package com.javateam.medicalcenter.repository;

import Patient;

class PatientPersistenceAdapter implements findPatientByNamePort {
    private final PatientRepository;

    @Override
    public Patient savePatient(Patient patient) {
        //Mapping
        return patientRepository.save(patient);
    }


}
