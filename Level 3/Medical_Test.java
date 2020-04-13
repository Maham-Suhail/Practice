package com.company;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Medical_Test extends Database {
    Connection connection = getConnection();
    Statement statement;

    public void createTable(){
        try {
            statement = connection.createStatement();
            String sql = "CREATE TABLE if not exists madicalTest " +
                    "(\n" +
                    "id INTEGER not NULL AUTO_INCREMENT, \n" +
                    "patient_id INTEGER (11),\n" +
                    "test VARCHAR(255), \n" +
                    "FOREIGN KEY(patient_id) REFERENCES patient(patient_id),\n"+
                    "PRIMARY KEY(id)\n"+
                    ")ENGINE=InnoDB DEFAULT CHARSET=latin1";
            statement.executeUpdate(sql);
            System.out.println("Table Created!!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void Input()
    {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        try {
            Statement statement = connection.createStatement();
            System.out.println("------------ Medical Test -------------");
            System.out.print("Test ID: ");
            int id = scanner.nextInt();
            System.out.print("Patient ID: ");
            int patient_id = scanner.nextInt();
            System.out.print("Test Recommanded: ");
            String test = scanner.next();

            String sql = "INSERT INTO madicalTest "+
                    "VALUES('"+id+"','"+patient_id+"','"+test+"')";
            statement.executeUpdate(sql);
            System.out.println("Data Recorded");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
