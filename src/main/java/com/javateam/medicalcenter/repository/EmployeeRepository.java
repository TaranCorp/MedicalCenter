package com.javateam.medicalcenter.repository;

import com.javateam.medicalcenter.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{


    void add(Employee employee) throws SQLException;
    void update(Employee employee) throws SQLException;
    void remove(Employee employee) throws SQLException;

    Iterable<Employee> getById(long id);
    Iterable<Employee> getAll(Employee employee);

}
