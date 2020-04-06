package com.company;
// solution of first Problem
public class Student {

    private String name;
    private int roll_no;

    // constructor initialize the student attributes
    Student(String name,int roll_no)
    {
        this.name = name;
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public static void main(String[] args) {
        Student std = new Student("John", 2);
        System.out.println("Name of Student is: "+std.name+"\n"+"Roll no of Student is: "+std.roll_no);

    }
}
