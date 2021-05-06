package com.javateam.medicalcenter.employees.infrastructure;

import com.javateam.medicalcenter.employees.domain.Employee;
import com.javateam.medicalcenter.users.domain.UserRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
@Primary
public class MemoryEmployeeRepository implements EmployeeRepository {
    UserRepository userRepository;
    @Override
    public Employee save(Employee employee) {
        return (Employee) userRepository.save(employee);
        }

    @Override
    public List<Employee> getById(Long id) {
        return null;
    }

    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public void removeById(Employee employee) {

    }
}
