package com.javateam.medicalcenter.employees.application.port;

import com.javateam.medicalcenter.employees.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeCatalogUseCase {

    List<Employee> findAll();

    Optional<Employee> findById(Long id);

    List<Employee> findBySurname(String surname);

    Employee addEmployee(Employee employee);

    void removeById(Long id);

}
