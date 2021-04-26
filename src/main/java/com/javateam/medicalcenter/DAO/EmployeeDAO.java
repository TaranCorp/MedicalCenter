package com.javateam.medicalcenter.DAO;

import com.javateam.medicalcenter.entity.Employee;
import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

//    List<Employee> getAll();
//    Employee getById(long id);
    void add(Employee employee) throws SQLException;
    void update(Employee employee) throws SQLException;
    void remove(Employee employee) throws SQLException;

}
