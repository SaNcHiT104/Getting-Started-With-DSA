import java.io.*;
import java.util.*;

public class barchart {
    public static int max(int arr[]) {
        int n = arr.length;
        int maxele = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            maxele = Math.max(maxele, arr[i]);
        }
        return maxele;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();

        }
        int x = max(arr);

        for (int height = x; height >= 1; height--) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= height) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }

    }

}