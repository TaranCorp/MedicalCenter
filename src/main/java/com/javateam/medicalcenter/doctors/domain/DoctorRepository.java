package com.javateam.medicalcenter.doctors.domain;

import com.javateam.medicalcenter.employees.domain.Specialization;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {

    List<Doctor> findAll();

    List<Doctor> findByNameContainsIgnoreCase(String name);

    List<Doctor> findBySurnameContainsIgnoreCase(String surname);

    @Query(
            " SELECT d FROM Doctor d " +
                    " WHERE " +
                    " lower(d.name) LIKE lower(concat('%', :name, '%')) " +
                    " AND lower(d.surname) LIKE lower(concat('%', :surname, '%')) "
    )
    List<Doctor> findByNameAndSurname(@Param("name") String name, @Param("surname") String surname);

    List<Doctor> findBySpecialization(Specialization specialization);
}
