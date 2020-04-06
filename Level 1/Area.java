package com.company;

import java.util.Scanner;

//solution of question
public class Area {

    private float length;
    private float breadth;

    //takes the length and breadth of rectangle
    public void setDim(float length,float breadth)
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
	Area area = new Area();
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Length of rectangle: ");
	float length = sc.nextFloat();

	System.out.println("Enter the breadth of rectangle: ");
	float breadth = sc.nextFloat();
	//set the values of length and breadth
	area.setDim(length,breadth);

	System.out.println("Area of Rectangle is: "+area.getArea());

    }
}
