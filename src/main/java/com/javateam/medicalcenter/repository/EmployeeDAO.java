package com.javateam.medicalcenter.repository;

import Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Repository
public interface EmployeeDAO {


    void add(Employee employee) throws SQLException;
    void update(Employee employee) throws SQLException;
    void remove(Employee employee) throws SQLException;
    void select(Employee employee) throws SQLException;

//    Iterable<Employee> getById(long id);
//    Iterable<Employee> getAll(Employee employee);

}

