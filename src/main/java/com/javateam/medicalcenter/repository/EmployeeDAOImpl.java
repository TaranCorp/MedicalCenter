package com.javateam.medicalcenter.repository;

import com.javateam.medicalcenter.repository.EmployeeDAO;
import com.javateam.medicalcenter.Util;
import Employee;

import java.sql.*;
import java.util.Optional;

public class EmployeeDAOImpl extends Util implements EmployeeDAO {
    Employee employee;
    private Connection connection = getConnection();


    @Override
    public void add(Employee employee) throws SQLException {

    }

    @Override
    public void update(Employee employee) throws SQLException {

    }

    @Override
    public void remove(Employee employee) throws SQLException {

    }

    @Override
    public void select(Employee employee) throws SQLException {

    }
}



