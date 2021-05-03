package com.javateam.medicalcenter.repository;

import com.javateam.medicalcenter.entity.Employee;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public interface EmployeeDAO {

//    List<Employee> getAll();
//    Employee getById(long id);
    void add(Employee employee) throws SQLException;
    void update(Employee employee) throws SQLException;
    void remove(Employee employee) throws SQLException;

}
