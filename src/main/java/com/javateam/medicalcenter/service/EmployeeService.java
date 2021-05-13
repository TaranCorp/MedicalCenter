package com.javateam.medicalcenter.service;


import com.javateam.medicalcenter.Util;
import com.javateam.medicalcenter.entity.Employee;
import com.javateam.medicalcenter.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


@Service
public class EmployeeService extends Util {

    private Connection connection = getConnection();
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Trying out CRUD
    Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


    public void add(Employee employee) throws SQLException {

        Statement statement = connection.createStatement();

        PreparedStatement preparedStatement = null;
        statement.execute("CREATE TABLE TBL_EMPLOYEES IF NOT EXISTS {ID , FIRST_NAME, LAST_NAME, POSITION, HIRE_DATE, SALARY}");

        String sqlQuery = "INSERT INTO TBL_EMPLOYEES (ID , FIRST_NAME, LAST_NAME, POSITION, HIRE_DATE, SALARY) " + "VALUES (?,?,?,?,?,?)";


        try {
            preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setLong(1, employee.getId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setString(3, employee.getSurname());
            preparedStatement.setString(1, employee.getEmployeePosition());
            preparedStatement.setInt(2, employee.getHireDate());
            preparedStatement.setBigDecimal(3, employee.getSalary());

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new employee was added successfully!");
            }

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


    public void update(Employee employee) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sqlQuery = "UPDATE TBL_EMPLOYEES SET ID=?, FIRST_NAME=?, LAST_NAME=?, POSITION=?, HIRE_DATE=?, SALARY=? WHERE ID=?";

        try {
            preparedStatement = connection.prepareStatement(sqlQuery);

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

    public void remove(Employee employee) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sqlQuery = "DELETE FROM TBL_EMPLOYEES WHERE ID=?";

        try {
            preparedStatement = connection.prepareStatement(sqlQuery);

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



