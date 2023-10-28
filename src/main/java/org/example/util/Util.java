package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String BD_DRIVER = "com.mysql.jdbc.Driver";
    private static final String BD_URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String BD_USERNAME = "root";
    private static final String BD_PASSWORD = "root";


    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(BD_URL, BD_USERNAME, BD_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
