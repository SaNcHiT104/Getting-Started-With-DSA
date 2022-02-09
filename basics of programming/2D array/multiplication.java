import java.io.*;
import java.util.*;

public class multiplication {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) { // rows
            for (int j = 0; j < arr[0].length; j++) { // columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] matrixmultiply(int[][] A, int[][] B) {
        int n1 = A.length;
        int m1 = A[0].length;
        int n2 = B.length;
        int m2 = B[0].length;
        int[][] C = new int[n1][m2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                int sum = 0;
                for (int k = 0; k < m1; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }
        return C;

    }

    public static void main(String[] args) throws Exception {

        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] A = new int[n1][m1];
        input(A);

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] B = new int[n2][m2];
        input(B);

        if (m1 != n2) {
            System.out.println("Invalid input");

        } else {
            int[][] C = matrixmultiply(A, B);
            display(C);
        }

    }

}