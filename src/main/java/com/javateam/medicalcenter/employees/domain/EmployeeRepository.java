package com.javateam.medicalcenter.employees.domain;

import com.javateam.medicalcenter.employees.domain.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeRepository {

    Employee save(Employee employee) throws SQLException;
    List<Employee> getById(Long id);
    List<Employee> getAll();
    void updateEmployee(Employee employee) throws SQLException;
    void removeById(Employee employee) throws SQLException;
}
