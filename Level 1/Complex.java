package com.company;

import java.util.Scanner;
//solution of question 9
public class Complex {

    //calculate sum of numbers
    public void sum(double r1,double c1,double r2, double c2)
    {
        double sum_of_real = r1+r2;
        double sum_of_imaginary = c1+c2;
        System.out.println("Sum of First and Second Number is: "+sum_of_real+" + "+sum_of_imaginary+"i");

    }
    //calculate difference of numbers
    public void diff(double r1,double c1,double r2, double c2)
    {
        double diff_of_real = r1-r2;
        double diff_of_imaginary = c1-c2;
        System.out.println("Difference of First and Second Number is: "+diff_of_real+" + "+diff_of_imaginary+"i");
    }
    // calculate the product of number
    public void product(double r1,double c1,double r2, double c2)
    {
        double pro_of_real = (r1*r2)-(c1*c2);
        double pro_of_imaginary = (r1*c2)+(c1*r2);
        System.out.println("Product of First and Second Number is: "+pro_of_real+" + "+pro_of_imaginary+"i");
    }

    public void Input_Values()
    {
        double r1,c1,r2,c2;
        // Enter the real and imaginary parts of numbers
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Real part of First Number: ");
        r1 = sc.nextDouble();
        System.out.print("Enter the imaginary part of First Number: ");
        c1 = sc.nextDouble();

        System.out.print("\n"+"Enter the Real part of Second Number: ");
        r2 = sc.nextDouble();
        System.out.print("Enter the imaginary part of Second Number: ");
        c2 = sc.nextDouble();
        // calling methods to calculate sum, diff and product of numbers
        System.out.println("------------------------------------");
        sum(r1,c1,r2,c2);
        diff(r1,c1,r2,c2);
        product(r1,c1,r2,c2);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Complex c = new Complex();
        c.Input_Values();
    }
}
