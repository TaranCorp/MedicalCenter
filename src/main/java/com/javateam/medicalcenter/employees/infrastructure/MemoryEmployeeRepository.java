package com.javateam.medicalcenter.employees.infrastructure;

import com.javateam.medicalcenter.employees.application.port.EmployeeCatalogUseCase.UpdateEmployeeCommand;
import com.javateam.medicalcenter.employees.application.port.EmployeeCatalogUseCase.UpdateEmployeeResponse;
import com.javateam.medicalcenter.employees.domain.Employee;
import com.javateam.medicalcenter.employees.domain.EmployeeRepository;
import com.javateam.medicalcenter.users.domain.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
@Primary
@AllArgsConstructor
public class MemoryEmployeeRepository implements EmployeeRepository {
    private final UserRepository userRepository;

    @Override
    public Employee save(Employee employee) {
        return (Employee) userRepository.save(employee);
        }

    @Override
    public Optional<Employee> getById(Long id) {
        return userRepository.getById(id)
                .filter(Employee.class::isInstance)
                .map(Employee.class::cast);
    }

    @Override
    public List<Employee> getAll() {
        return userRepository.getAll().stream()
                .filter(Employee.class::isInstance)
                .map(Employee.class::cast)
                .collect(Collectors.toList());
    }

    @Override
    public UpdateEmployeeResponse updateEmployee(UpdateEmployeeCommand command) {
        return userRepository.getById(command.getId())
                .filter(Employee.class::isInstance)
                .map(Employee.class::cast)
                .map(employee -> {
                    userRepository.save(employee);
                    return UpdateEmployeeResponse.SUCCESS;
                })
                .orElseGet(() -> new UpdateEmployeeResponse(false, Collections.singletonList("Employee not found with id: " + command.getId())));
    }

    @Override
    public void removeById(Employee employee) {
        //
    }
}
