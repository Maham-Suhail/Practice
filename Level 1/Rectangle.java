package com.company;
// solution of question 5
public class Rectangle {

    private int length;
    private int breadth;

    // parameterized constructor
    Rectangle(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    //calculate area of rectangle
    public int Area()
    {
        int area = length*breadth;
        return area;
    }


    public static void main(String[] args) {
	Rectangle rectangle1 = new Rectangle(4,5);
	Rectangle rectangle2 = new Rectangle(5,8);
	System.out.println("Area of Rectangle-1: "+rectangle1.Area()+"\n"+
            "Length of Rectangle: "+rectangle1.length+"\n"+ "Breadth of Rectangle: "+rectangle1.breadth);

	System.out.println("\n"+"Area of Rectangle-2: "+rectangle2.Area()+"\n"+
            "Length of Rectangle: "+rectangle2.length+"\n"+ "Breadth of Rectangle: "+rectangle2.breadth);
    }
}
