package com.company;

import java.util.Scanner;
// solution of quesion 4
public class Triangle {

    private int side1;
    private int side2;
    private int side3;
    // constructor with parameters
    public Triangle(int side1,int side2,int side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    // calculate area of triangle
    public double area()
    {
        double s = perimeter()/2;
        double x = s*(s-side1)*(s-side2)*(s-side3);
        double area = Math.sqrt(x);
        return area;
    }
    //calculate area of perimeter
    public double perimeter()
    {
        double per = side1+side2+side3;
        return per;
    }

    public static void main(String[] args) {

        Triangle tri = new Triangle(3,4,5);
        System.out.println("Area of triangle: "+tri.area());
        System.out.println("Perimeter of triangle: "+tri.perimeter());

    }
}