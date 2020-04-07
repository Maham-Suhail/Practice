package com.company;

import java.util.Scanner;

public class Employee {

    private int salary;
    private int hourOfwork;
    private int netSalary ;

    // takes salary and hour of work as parameters

    public void getinfo(int salary,int hourOfwork) {
        this.salary = salary;
        this.hourOfwork = hourOfwork;
    }

    // add 10$ in salary if salary is less than 500$

    public int addSalary(int salary) {
        if(salary < 500)
        {
             netSalary = salary+10;
             return netSalary ;
        }
        else
            netSalary = salary;
            return netSalary;
    }

    // add 5$ in salary if hour of work is more than 6

    public int addWork(int hourOfwork)
    {
        if(hourOfwork > 6 )
        {
            netSalary = netSalary+5;
            return netSalary;
        }
        else
            return salary;
    }

    public static void main(String[] args) {

        Employee employee = new Employee();
        // takes input from user
        Scanner sc = new Scanner(System.in);
        int salary , hourOfwork;

        System.out.println("Enter salary of Employee: ");
        salary = sc.nextInt();
        System.out.println("Enter Hour of Work of Employee: ");
        hourOfwork = sc.nextInt();

        //calling Employee methods
        employee.getinfo(salary,hourOfwork);
        employee.addSalary(salary);
        employee.addWork(hourOfwork);

        System.out.println("Net Salary = "+employee.netSalary+"$");

    }
}
