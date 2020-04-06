package com.company;

import java.util.Scanner;

public class Triangle {

    private int side1 = 3;
    private int side2 = 4;
    private int side3 = 5;


    public double area()
    {
        double s = perimeter()/2;
        double x = s*(s-side1)*(s-side2)*(s-side3);
        double area = Math.sqrt(x);
        return area;
    }
    public double perimeter()
    {
        double per = side1+side2+side3;
        return per;
    }


    public static void main(String[] args) {

        Triangle tri = new Triangle();
        System.out.println("Area of triangle: "+tri.area());
        System.out.println("Perimeter of triangle: "+tri.perimeter());
        


    }
}
