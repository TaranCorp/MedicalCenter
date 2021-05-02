package com.javateam.medicalcenter.service;

import com.javateam.medicalcenter.DAO.EmployeeDAO;
import com.javateam.medicalcenter.Util;
import com.javateam.medicalcenter.entity.Employee;

import java.sql.*;

public class EmployeeService extends Util implements EmployeeDAO {

    private Connection connection = getConnection();

    @Override
    public void add(Employee employee) throws SQLException {

        PreparedStatement preparedStatement = null;
//        String sql = "INSERT INTO TBL_EMPLOYEES (ID,FIRST_NAME, LAST_NAME, POSITION) " + "VALUES (?,?,?,?,?)";
        String sql = "INSERT INTO TBL_EMPLOYEES (POSITION, HIRE_DATE, SALARY) " + "VALUES (?,?,?)";


        try {
            preparedStatement = connection.prepareStatement(sql);

//            preparedStatement.setLong(1, employee.getId());
//            preparedStatement.setString(2, employee.getFirstName());
//            preparedStatement.setString(3, employee.getLastName());
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
    public void update(Employee employee) {
        System.out.println("inside update method");
    }
//    public void update(Employee employee) throws SQLException {
//        PreparedStatement preparedStatement = null;
//
////        String sql = "UPDATE TBL_EMPLOYEES SET ID=?, FIRST_NAME=?, LAST_NAME=?, POSITION=? WHERE ID=?";
//
//        try {
//            preparedStatement = connection.prepareStatement(sql);
//
////
////            preparedStatement.setLong(1, employee.getId());
////            preparedStatement.setString(2, employee.getFirstName());
////            preparedStatement.setString(3, employee.getLastName());
//            preparedStatement.setString(4, employee.getEmployeePosition());
//            preparedStatement.setInt(5, employee.getHireDate());
//            preparedStatement.setBigDecimal(6, employee.getSalary());
//
//            preparedStatement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if (preparedStatement != null) {
//                preparedStatement.close();
//            }
//            if (connection != null) {
//                connection.close();
//            }
//        }
//
//
//    }

    @Override
    public void remove(Employee employee) {
        System.out.println("inside remove method");
    }
//    public void remove(Employee employee) throws SQLException {
//        PreparedStatement preparedStatement = null;
//
//        String sql = "DELETE FROM TBL_EMPLOYEES WHERE ID=?";
//
//        try {
//            preparedStatement = connection.prepareStatement(sql);
//
//            preparedStatement.setLong(1, employee.getId());
//
//            preparedStatement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if (preparedStatement != null) {
//                preparedStatement.close();
//            }
//            if (connection != null) {
//                connection.close();
//            }
//        }
//
//    }
}
