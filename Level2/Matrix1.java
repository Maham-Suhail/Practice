package com.company;

import java.util.Scanner;
// Calculate the sum and product of Matrices
public class Matrix {
    private int row,col;
    private int[][] elements;


    Matrix(int row, int col)
    {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void inputValues() {
        Scanner scanner = new Scanner(System.in);
        try {
            for (int i = 0; i < elements.length * col; i++) {
                System.out.print("Enter the position of row: ");
                int row = scanner.nextInt();
                System.out.print("Enter the position of column: ");
                int col = scanner.nextInt();
                System.out.print("Enter Value for above position: ");
                elements[row][col] = scanner.nextInt();
            }
            for (int k = 0; k < elements.length; k++) {
                for (int j = 0; j < elements[k].length; j++) {
                    System.out.print("\t" + elements[k][j]);
                }
                System.out.println("");
            }
        }
        catch (Exception e)
        {
            System.out.println("----------something went wrong!!!----------");
        }
    }

    public static void main(String[] args) {
         int[][] sum;
         int[][] product;

        Matrix matrix ;
        Matrix matrix1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the No of rows of the Matrix: ");
        int noOfRow = scanner.nextInt();
        System.out.print("Enter the No of columns of the Matrix: ");
        int noOfCol = scanner.nextInt();
        System.out.print("\n");

        matrix = new Matrix(noOfRow,noOfCol);
        matrix.elements =  new int[noOfRow][noOfCol];
        sum = new int[noOfRow][noOfCol];
        product = new int[noOfRow][noOfCol];

        System.out.print("Enter the No of rows of the Matrix: ");
        int noOfRow1 = scanner.nextInt();
        System.out.print("Enter the No of columns of the Matrix: ");
        int noOfCol1 = scanner.nextInt();
        System.out.print("\n");

        matrix1 = new Matrix(noOfRow1,noOfCol1);
        matrix1.elements =  new int[noOfRow1][noOfCol1];

        System.out.println("###### Position of Rows and Columns Should not be more than No of row and columns Entered ######");

        matrix.inputValues();
        matrix1.inputValues();

        if(matrix.elements.length == matrix1.elements.length) {
            System.out.println("-------------------Sum of given matrices is: ----------------");

            for (int i = 0; i < matrix.elements.length; i++) {
                for (int j = 0; j < matrix.elements[i].length; j++) {
                    sum[i][j] = matrix.elements[i][j] + matrix1.elements[i][j];
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("-----------------Product of Given matrices is: ---------------------");
            for (int i = 0; i < matrix.elements.length; i++) {
                for (int j = 0; j < matrix.elements[i].length; j++) {
                    product[i][j] = 0;
                    for (int k = 0; k < matrix.elements[j].length; k++) {
                        product[i][j] += matrix.elements[i][k] * matrix1.elements[k][j];
                    }//end of k loop
                    System.out.print(product[i][j] + " ");  //printing matrix element
                }//end of j loop
                System.out.println();//new line
            }
        }
         else
        {
            System.out.println("<<<<<<<<<<<<Given Matrices are not addable>>>>>>>>>>>>>>>");
        }
    }
        }



