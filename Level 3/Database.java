package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    Connection connection;

    protected final Connection getConnection() {
        try {
            final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://localhost:3306/patient_db";
            //database credentials
            final String user = "root";
            final String password = "";
            //load driver
            Class.forName(JDBC_DRIVER);
            // establish the connection
            connection = DriverManager.getConnection(DB_URL, user, password);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;

    }
}
