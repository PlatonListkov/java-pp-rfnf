package org.example.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    private static final String BD_URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String BD_USERNAME = "root";
    private static final String BD_PASSWORD = "root";


    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(BD_URL, BD_USERNAME, BD_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Hibernate
     */
    
}
