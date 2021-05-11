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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Repository
@Primary
@AllArgsConstructor
public class MemoryEmployeeRepository implements EmployeeRepository {
    private final UserRepository userRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(MemoryEmployeeRepository.class);

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
                .orElseGet(() -> new UpdateEmployeeResponse(false,
                        Collections.singletonList("Employee not found with id: " + command.getId())));
    }

    @Override
    public void removeById(Employee employee) {
        //
    }

    @Override
    public <S extends Employee> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Employee> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Employee> findAll() {
        return null;
    }

    @Override
    public Iterable<Employee> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Employee entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Employee> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
