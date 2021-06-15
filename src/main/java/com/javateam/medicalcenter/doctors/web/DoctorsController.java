package com.javateam.medicalcenter.doctors.web;

import com.javateam.medicalcenter.doctors.application.port.DoctorCatalogUseCase;
import com.javateam.medicalcenter.doctors.domain.Doctor;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/doctors")
@RestController
@AllArgsConstructor
public class DoctorsController {
    private final DoctorCatalogUseCase catalog;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Doctor> getAll(
            @RequestParam Optional<String> name,
            @RequestParam Optional<String> surname) {
        if(name.isPresent() && surname.isPresent()) {
            return catalog.findByNameAndSurname(name.get(), surname.get());
        } else if (name.isPresent()) {
            return catalog.findByName(name.get());
        } else if (surname.isPresent()) {
            return catalog.findBySurname(surname.get());
        } else {
            return catalog.findAll();
        }
    }
}
