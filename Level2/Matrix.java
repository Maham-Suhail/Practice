package com.company;

import java.util.Scanner;

public class Matrix {

    private int numOfrows;
    private int numOfcol;
    private int[][] elements = {
            {2,4,5},
            {3,8,6}
    };
    //parameterized constructor
    Matrix(int numOfrows,int numOfcol)
    {
        this.numOfrows = numOfrows;
        this.numOfcol = numOfcol;
    }

    public int getNumOfrows() {
        return numOfrows;
    }

    public int getNumOfcol() {
        return numOfcol;
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix(2,3);
        // shows the elements of 2d array in matrix form
        for(int i = 0; i < matrix.elements.length; i++)
        {
            for(int j = 0; j<matrix.elements[i].length; j++)
            {
               System.out.print("\t"+matrix.elements[i][j]);
            }
            System.out.println("");
        }

    }
}
