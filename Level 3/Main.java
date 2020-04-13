package com.company;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main  {

    public static void main(String[] args) throws SQLException {

        Patient patient = new Patient();
        Doctor doctor = new Doctor();
        Patient_History patient_history = new Patient_History();
        Medical_Test medical_test = new Medical_Test();
        patient.createTable();
        doctor.createTable();
        patient_history.createTable();
        medical_test.createTable();
        //patient.Input();
        //doctor.Input();
        //patient_history.Input();
        //medical_test.Input();

        patient.display();



    }
}
