package com.company;
// solution of 2nd question
public class Student{

    private String name;
    private int roll_no;
    private String phone_no;
    private String address;

    Student(String name,int roll_no,String phone_no,String address)
    {
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {

	Student std1 = new Student("John",2,"03001234567","Lahore Pakistan");
	Student std2 = new Student("Sam",3,"03001234567","Lahore Pakistan");

	System.out.println("Name of Student: "+std1.name+"\n"+"Roll no: "+std1.roll_no+"\n"+
            "Phone no: "+std1.phone_no+"\n"+"Address: "+std1.address+"\n");

    System.out.println("Name of Student: "+std2.name+"\n"+"Roll no: "+std2.roll_no+"\n"+
             "Phone no: "+std2.phone_no+"\n"+"Address: "+std2.address+"\n");
    }
}
