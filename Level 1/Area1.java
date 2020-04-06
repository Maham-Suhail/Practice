package com.company;

import java.util.Scanner;

//solution of question 7
public class Area {

    private float length;
    private float breadth;

    //parameterized consttructor
    Area (float length,float breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    // calculate the area of Rectangle
    public float getArea()
    {
        float area = length*breadth;
        return area;
    }

    public static void main(String[] args) {
        Area area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of rectangle: ");
        float length = sc.nextFloat();

        System.out.println("Enter the breadth of rectangle: ");
        float breadth = sc.nextFloat();
        //passing values of length and breadth to constructor
        area = new Area(length,breadth);

        System.out.println("Area of Rectangle is: "+area.getArea());

    }
}