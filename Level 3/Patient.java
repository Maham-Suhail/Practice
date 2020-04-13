package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Patient extends Database {

    Connection connection = getConnection();
            Statement statement;
            public void createTable(){
                    try {
                        statement = connection.createStatement();
                        String sql = "CREATE TABLE if not exists patient " +
                                "(patient_id INTEGER not NULL, " +
                                " patient_name VARCHAR(255), " +
                                " age INTEGER, " +
                                " address VARCHAR(255), " +
                                " PRIMARY KEY ( patient_id ))ENGINE=InnoDB DEFAULT CHARSET=latin1";
                        statement.executeUpdate(sql);
                        System.out.println("Table Created!!!!");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
            }
    public void Input()
    {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        try{
            System.out.println("----------- Patient -----------");
            System.out.print("Patient's Name: ");
            String name = scanner.next();
            System.out.print("Patient's Age: ");
            int age = scanner.nextInt();
            System.out.print("Patient's Address: ");
            String address = scanner.next();
            System.out.print("Patient ID: ");
            int id = scanner.nextInt();

            statement = connection.createStatement();
            String sql = "INSERT INTO patient " +
                    "(patient_id,patient_name,age,address)"+
                    "VALUES ('"+id+"','"+ name+"','"+ age+"','"+address+"')";
            statement.executeUpdate(sql);

        }
        catch (SQLException e)
        {
                    e.printStackTrace();
                }
            }

     public void display()
     {
         try {
             statement = connection.createStatement();
             String query;
             query = "SELECT pat.patient_id,pat.patient_name,pat.age,pat.address,doc.doc_id,doc.doc_name,doc.address,doc.specialization, patHis.desease,test.test " +
                     "FROM patient AS pat " +
                     "INNER JOIN doctor AS doc ON pat.patient_id = doc.patient_id " +
                     "INNER JOIN patienthistory AS patHis ON doc.patient_id = patHis.patient_id " +
                     "INNER JOIN madicaltest AS test ON patHis.patient_id = test.patient_id";
             ResultSet resultSet = statement.executeQuery(query);
             System.out.print("Patient ID"+"      "+"Patient Name"+"        "+"Age"+"     "+"Address"+"     "
                     +"Doctor ID"+"      "+"Doctor Name"+"        "+"Address"+"     "+"Specialization"+"      "+"Desease"+"     "
                     +"Test"+"\n");
             System.out.println("--------------------------------------------------------------------------------------------------------------");
             while (resultSet.next())
             {
                 int patient_id = resultSet.getInt("patient_id");
                 String patient_name = resultSet.getString("patient_name");
                 String pat_age  = resultSet.getString("age");
                 String pat_address = resultSet.getString("address");
                 int doc_id = resultSet.getInt("doc_id");
                 String doc_name = resultSet.getString("doc_name");
                 String doc_address = resultSet.getString("address");
                 String doc_specialization = resultSet.getString("specialization");
                 String desease = resultSet.getString("desease");
                 String test = resultSet.getString("test");
                 System.out.print("\n");
                 System.out.print(patient_id+"      "+patient_name+"        "+pat_age+"     "+pat_address+"     "
                 +doc_id+"      "+doc_name+"        "+doc_address+"     "+doc_specialization+"      "+desease+"     "
                 +test);
                 System.out.print("\n");

             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }
}

