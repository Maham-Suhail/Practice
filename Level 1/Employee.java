package com.company;
// solution of question 10
public class Employee {

    private String name;
    private int year_of_joining;
    private String address;

    Employee(String name,int year_of_joining,String address)
    {
        this.name = name;
        this.year_of_joining = year_of_joining;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getYear_of_joining() {
        return year_of_joining;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Robert",1994,"64C-WallsStreet");
        Employee emp2 = new Employee("Sam",2000,"64D-WallsStreet");
        Employee emp3 = new Employee("John",1999,"64B-WallsStreet");
        // print the output in a specific format
        System.out.printf("%10s %20s %30s ","Name","Year of joining","Address");
        System.out.println();
        System.out.format("%10s %20d %30s ",emp1.name,emp1.year_of_joining,emp1.address);
        System.out.println();
        System.out.format("%10s %20d %30s ",emp2.name,emp2.year_of_joining,emp2.address);
        System.out.println();
        System.out.format("%10s %20d %30s ",emp3.name,emp3.year_of_joining,emp3.address);
        System.out.println();

    }
}
