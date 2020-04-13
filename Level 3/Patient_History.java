package com.company;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Patient_History extends Database {

    Connection connection = getConnection();
    Statement statement;

    public void createTable() {
        try {
            statement = connection.createStatement();
            String sql = "CREATE TABLE if not exists patientHistory \n" +
                    "(" +
                    "id INTEGER not NULL  AUTO_INCREMENT,\n" +
                    "patient_id INTEGER (11), \n" +
                    "desease VARCHAR(255), \n" +
                    "doc_id INTEGER(11), \n" +
                    "INDEX (patient_id,doc_id),\n" +
                    "FOREIGN KEY(patient_id) REFERENCES patient(patient_id),\n" +
                    "FOREIGN KEY (doc_id) REFERENCES doctor(doc_id),\n" +
                    "PRIMARY KEY ( id )\n"+
                    ")ENGINE=InnoDB DEFAULT CHARSET=latin1\n";
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
            System.out.println("-------- Patient History ----------");
            System.out.print("Desease: ");
            String desease = scanner.nextLine();
            System.out.print("Doctor ID: ");
            int doc_id = scanner.nextInt();
            System.out.print("Patient ID: ");
            int patient_id = scanner.nextInt();
            System.out.print("Record ID: ");
            int id = scanner.nextInt();
            statement = connection.createStatement();
            String sql = "INSERT INTO patienthistory " +
                    "VALUES('"+id+"','"+ patient_id+"','"+ desease+"','"+doc_id+"')";
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}


