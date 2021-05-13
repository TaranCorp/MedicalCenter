package com.javateam.medicalcenter.employees.domain;

import com.javateam.medicalcenter.employees.application.port.EmployeeCatalogUseCase.UpdateEmployeeCommand;
import com.javateam.medicalcenter.employees.application.port.EmployeeCatalogUseCase.UpdateEmployeeResponse;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {

    Employee save(Employee employee) throws SQLException;
    Optional<Employee> getById(Long id);
    List<Employee> getAll();
    UpdateEmployeeResponse updateEmployee(UpdateEmployeeCommand command) throws SQLException;
    void removeById(Employee employee) throws SQLException;
}
