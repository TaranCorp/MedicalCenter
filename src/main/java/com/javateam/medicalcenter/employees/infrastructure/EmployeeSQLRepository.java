package com.javateam.medicalcenter.employees.infrastructure;

import com.javateam.medicalcenter.Util;
import com.javateam.medicalcenter.employees.domain.Employee;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.List;

@Repository
public class EmployeeSQLRepository extends Util implements EmployeeRepository {

    private Connection connection = getConnection();

    @Override
    public List<Employee> getById(Long id) {
        return null;
        // IMPLEMENT   !!!
    }

    @Override
    public List<Employee> getAll() {
        return null;
        //IMPLEMENT   !!!
    }

    @Override
    public Employee save(Employee employee) throws SQLException {

        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO TBL_EMPLOYEES (FIRST_NAME, FAMILY_NAME, POSITION, HIRE_DATE, SALARY) " + "VALUES (?,?,?,?,?,?)";


        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getSurname());
            preparedStatement.setString(3, employee.getEmployeePosition());
            preparedStatement.setInt(4, employee.getHireDate());
            preparedStatement.setBigDecimal(5, employee.getSalary());

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
        return employee;
    }


    @Override
    public void updateEmployee(Employee employee) throws SQLException {
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
    public void removeById(Employee employee) throws SQLException {
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



