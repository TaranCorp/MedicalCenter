package com.javateam.medicalcenter;

import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Service
public class Util {

    private static final String DB_URL = "jdbc:h2:mem:;DB_CLOSE_DELAY=-1";
    private static final String DB_USERNAME = "";
    private static final String DB_PASSWORD = "";
    Connection connection;

    public Connection getConnection() {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            System.out.println("Connected");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection ERROR: " + e.getMessage());
        }
        return connection;

    }



}
