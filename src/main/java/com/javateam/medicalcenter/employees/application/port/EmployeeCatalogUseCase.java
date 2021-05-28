package com.javateam.medicalcenter.employees.application.port;

import com.javateam.medicalcenter.employees.domain.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public interface EmployeeCatalogUseCase {

    List<Employee> findAll();

    Optional<Employee> findById(Long id);

    List<Employee> findBySurname(String surname);

    Employee addEmployee(Employee employee);

    void removeById(Long id);

    @Value
    @Builder
    @AllArgsConstructor
    class UpdateEmployeeCommand {
        Long id;
        String name;
        String surname;
        int hireDate;
        BigDecimal salary;
        Long pesel;
        Time dateOfBirth;
        String email;

        public Employee updateFields(Employee employee) {
            if (name != null) {
                employee.setName(name);
            }
            if (surname != null) {
                employee.setSurname(surname);
            }
            if (hireDate != 0) {
                employee.setHireDate(hireDate);
            }
            if (salary != null) {
                employee.setSalary(salary);
            }
            if (pesel != null) {
                employee.setPesel(pesel);
            }
            if (dateOfBirth != null) {
                employee.setDateOfBirth(dateOfBirth);
            }
            if (email != null) {
                employee.setEmail(email);
            }
            return employee;
        }
    }

        @Value
        class UpdateEmployeeResponse {
            public static UpdateEmployeeResponse SUCCESS = new UpdateEmployeeResponse(true, Collections.emptyList());

            boolean success;
            List<String> errors;
        }
}
