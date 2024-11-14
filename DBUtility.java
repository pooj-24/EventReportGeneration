package com.eventreport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
    private static final String URL = "jdbc:mysql://localhost:3306/event_report_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Pooja@2406";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
