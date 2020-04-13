package com.company;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Doctor extends Database {

    Connection connection = getConnection();
    Statement statement;

            public void createTable(){
                try {
                    statement = connection.createStatement();
                    String sql = "CREATE TABLE if not exists doctor " +
                            "(doc_id INTEGER not NULL, " +
                            " doc_name VARCHAR(255), " +
                            " address VARCHAR(255), " +
                            " specialization VARCHAR(255), " +
                            "patient_id INTEGER (11), " +
                            "FOREIGN KEY(patient_id) REFERENCES patient(patient_id),"+
                            "PRIMARY KEY ( doc_id )"+
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
                    System.out.println("------------Doctor------------");
                    System.out.print("Doctor's Name: ");
                    String docName = scanner.nextLine();
                    System.out.print("Doctor's Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Doctor's Specialization: ");
                    String specialization = scanner.nextLine();
                    System.out.print("Doctor ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Patient ID: ");
                    int patient_id = scanner.nextInt();

                    Statement statement = connection.createStatement();
                    String sql = "INSERT INTO doctor " +
                            "VALUES ('"+id+"','"+ docName+"','"+ address+"','"+specialization+"','"+patient_id+"')";

                    statement.executeUpdate(sql);
                    System.out.println("Data Recorded");
                } catch (SQLException e) {
                    e.printStackTrace();
                }


            }
}
