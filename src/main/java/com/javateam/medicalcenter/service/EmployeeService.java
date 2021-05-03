package com.javateam.medicalcenter.service;

import com.javateam.medicalcenter.repository.EmployeeDAO;
import com.javateam.medicalcenter.Util;
import com.javateam.medicalcenter.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.*;

public class EmployeeService extends Util implements EmployeeDAO {

    private Connection connection = getConnection();

    @Override
    public void add(Employee employee) throws SQLException {

        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO TBL_EMPLOYEES (ID , FIRST_NAME, LAST_NAME, POSITION, HIRE_DATE, SALARY) " + "VALUES (?,?,?,?,?,?)";


        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, employee.getId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setString(3, employee.getSurname());
            preparedStatement.setString(1, employee.getEmployeePosition());
            preparedStatement.setInt(2, employee.getHireDate());
            preparedStatement.setBigDecimal(3, employee.getSalary());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }


    @Override
    public void update(Employee employee) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE TBL_EMPLOYEES SET ID=?, FIRST_NAME=?, LAST_NAME=?, POSITION=?, HIRE_DATE=?, SALARY=? WHERE ID=?";

        try {
            preparedStatement = connection.prepareStatement(sql);

//
            preparedStatement.setLong(1, employee.getId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setString(3, employee.getSurname());
            preparedStatement.setString(4, employee.getEmployeePosition());
            preparedStatement.setInt(5, employee.getHireDate());
            preparedStatement.setBigDecimal(6, employee.getSalary());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }


    }

    @Override
    public void remove(Employee employee) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM TBL_EMPLOYEES WHERE ID=?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, employee.getId());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

    }
}
