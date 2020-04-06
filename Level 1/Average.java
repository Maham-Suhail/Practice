package com.company;

import java.util.Scanner;
// solution of question 8
public class Average {
    private float num1,num2,num3;


    Average(float num1,float num2,float num3)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    //calculate average of numbers
    public float cal_avg()
    {
        float avg = (num1+num2+num3)/3;
        return avg;
    }
    //print the average
    public void print()
    {
        System.out.println("Average of given number is: "+cal_avg());
    }

    public static void main(String[] args) {
	Average average;
	float s1,s2,s3;
	//scanner class to take input from user
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter First number: ");
	s1 = sc.nextFloat();
	System.out.println("Enter Second number: ");
	s2 = sc.nextFloat();
	System.out.println("Enter Third number: ");
	s3 = sc.nextFloat();

	average = new Average(s1,s2,s3);
	average.print();

    }
}
