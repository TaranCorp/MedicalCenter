package com.javateam.medicalcenter.doctors.application;

import com.javateam.medicalcenter.doctors.application.port.DoctorCatalogUseCase;
import com.javateam.medicalcenter.doctors.domain.Doctor;
import com.javateam.medicalcenter.doctors.domain.DoctorRepository;
import com.javateam.medicalcenter.employees.domain.Specialization;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
class DoctorService implements DoctorCatalogUseCase {
    private final DoctorRepository repository;


    @Override
    public List<Doctor> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Doctor> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Doctor> findBySurname(String surname) {
        return repository.findBySurnameContainsIgnoreCase(surname);
    }

    @Override
    public List<Doctor> findByNameAndSurname(String name, String surname) {
        return repository.findByNameAndSurname(name, surname);
    }

    @Override
    public List<Doctor> findBySpecialization(String specialization) {
        return repository
                .findBySpecialization(Specialization
                        .parseString(specialization)
                        .orElseThrow(() -> new IllegalArgumentException("No such specialization!")));
    }

    @Override
    public Doctor addDoctor(CreateDoctorCommand command) {
        Doctor doctor = toDoctor(command);
        return repository.save(doctor);
    }
    private Doctor toDoctor(CreateDoctorCommand command) {
        return new Doctor(command.getSpecialization(), command.getEmail(), command.getName(), command.getSurname(),
                command.getDateOfBirth(), command.getPesel(),  command.getHireDate(), command.getSalary());
    }

    @Override
    public void removeById(Long id){
        repository.deleteById(id);
    }

    @Override
    public UpdateDoctorResponse updateDoctor(UpdateDoctorCommand command) {
        return repository
                .findById(command.getId())
                .map(doctor -> {
                    updateFields(command, doctor);
                    return UpdateDoctorResponse.SUCCESS;
                })
                .orElseGet(() -> new UpdateDoctorResponse(false, Collections.singletonList("Doctor not found with id: " + command.getId())));
    }
    private Doctor updateFields(UpdateDoctorCommand command, Doctor doctor) {
        if (command.getSpecialization() != null) {
            doctor.setSpecialization(command.getSpecialization());
        }
        if (command.getName() != null) {
            doctor.setName(command.getName());
        }
        if (command.getSurname() != null) {
            doctor.setSurname(command.getSurname());
        }
        if (command.getEmail() != null) {
            doctor.setEmail(command.getEmail());
        }
        if (command.getDateOfBirth() != null) {
            doctor.setDateOfBirth(command.getDateOfBirth());
        }
        if (command.getPesel() != null) {
            doctor.setPesel(command.getPesel());
        }
        if (command.getHireDate() != 0) {
            doctor.setHireDate(command.getHireDate());
        }
        if (command.getSalary() != null) {
            doctor.setSalary(command.getSalary());
        }
        return doctor;
    }
}
