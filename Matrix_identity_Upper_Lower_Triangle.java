package myjavaprojects;

import java.util.Scanner;

public class Matrix_identity_Upper_Lower_Triangle {
    //Create a matrix automatically with random Number

    public int[][] CM(int n) {
        int max = 9, min = 1;

        int matx[][] = new int[n][n];

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                matx[a][b] = (int) (Math.random() * (max - min + 1) + min);
            }
        }
        return matx;
    }

    //Create a matrix with User Input Number
    public int[][] CM2(int n) {
        Scanner sc = new Scanner(System.in);

        int matx[][] = new int[n][n];

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                matx[a][b] = sc.nextInt();
            }
        }
        return matx;
    }

    //Show a matrix 
    public void showData(int mat[][]) {
        for (int a = 0; a < mat.length; a++) {
            for (int b = 0; b < mat.length; b++) {
                System.out.print("" + mat[a][b] + " ");
            }
            System.out.println("");
        }
    }

    //Show an UpperTriangular matrix 
    public void showUpperTriangular(int mat[][]) {
        int row, col;
        for (row = 0; row < mat.length; row++) {
            for (col = 0; col < mat.length; col++) {
                if (col > row) {
                    System.out.print("0" + " ");
                } else {
                    System.out.print(mat[row][col] + " ");
                }
            }
            System.out.println("");
        }
    }

    //Show an LowerTriangular matrix 
    public void showLowerTriangular(int mat[][]) {
        int row, col;
        for (row = 0; row < mat.length; row++) {
            for (col = 0; col < mat.length; col++) {
                if (col < row) {
                    System.out.print("0" + " ");
                } else {
                    System.out.print(mat[row][col] + " ");
                }
            }
            System.out.println("");
        }
    }
    //Is Identity

    public void isIdentity(int mat[][]) {
        boolean d = false;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat.length; col++) {
                if (row == col && mat[row][col] != 1) {
                    d = false;
                } else if (row != col && mat[row][col] != 0) {
                    d = false;
                }
                else{
                    d = true;
                }
            }
        }

        if (d == false) {
            System.out.println("Not Identity!");
        } else {
            System.out.println("Identity!");
        }

    }

    public static void main(String args[]) {

        Matrix_identity_Upper_Lower_Triangle x = new Matrix_identity_Upper_Lower_Triangle();

        int mat[][] = {
        {1, 0, 0, 0},
        {0, 1, 0, 0},
        {0, 0, 1, 0},
        {0, 0, 0, 1}};

        int mat1[][] = x.CM(3);
        //int mat1[][] = x.CM2(3);

        System.out.println("Random Matrix");
        System.out.println("--------------------------");
        x.showData(mat1);

        System.out.println("");
        System.out.println("Upper Triangular: ");

        x.showUpperTriangular(mat1);
        System.out.println("");

        System.out.println("Lower Triangular: ");
        x.showLowerTriangular(mat1);
        System.out.println("--------------------------");
        
        System.out.println("");
        System.out.println("Matrix 1");
        System.out.println("--------------------------");
        x.showData(mat);
        System.out.print("is Matrix1 Identity ?");
        x.isIdentity(mat);
    }
}
