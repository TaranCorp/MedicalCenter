package com.javateam.medicalcenter.employees.application;

import com.javateam.medicalcenter.employees.application.port.EmployeeCatalogUseCase;
import com.javateam.medicalcenter.employees.domain.Employee;
import com.javateam.medicalcenter.employees.domain.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeService implements EmployeeCatalogUseCase {
    private final EmployeeRepository repository;

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Employee> findBySurname(String surname) {
        return null;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }
}

