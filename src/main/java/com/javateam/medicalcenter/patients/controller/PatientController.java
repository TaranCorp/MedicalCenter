package com.javateam.medicalcenter.patients.controller;

import com.javateam.medicalcenter.patients.model.Patient;
import com.javateam.medicalcenter.patients.model.PatientRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private PatientRepository repository;

    public PatientController(PatientRepository repository) {
        this.repository = repository;
    }

    @GetMapping()
    public ResponseEntity<?> getAllPatients(){
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping()
    public ResponseEntity<?> savePatients(@RequestBody Patient patient){
        return ResponseEntity.ok(repository.save(patient));
    }
    @PatchMapping("/{id}")
    public ResponseEntity<?> patchUpdating(@PathVariable int id, @RequestBody  Patient source){
        if(!repository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        repository.findById(id).ifPresent(patient -> {
            patient.updatePatient(source);
            repository.save(patient);
        });
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updatePatient(@PathVariable int id, @RequestBody Patient patientToUpdate){
        if(!repository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        repository.findById(id).ifPresent(patient -> {
            patient.updatePatient(patientToUpdate);
            repository.save(patient);
        });
        return ResponseEntity.noContent().build();
    }
}
