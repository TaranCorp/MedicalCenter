package com.javateam.medicalcenter.employees.application;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javateam.medicalcenter.employees.application.port.EmployeeCatalogUseCase;
import com.javateam.medicalcenter.employees.domain.Employee;
import com.javateam.medicalcenter.employees.domain.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Slf4j
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

    public List<Employee> mockEmployees() {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            return objectMapper.readValue(getClass().getClassLoader()
                            .getResourceAsStream("mockedEmployees.json"),
                    new TypeReference<List<Employee>>() {
                    });
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
        return null;

    }


}

