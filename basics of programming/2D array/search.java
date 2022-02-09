import java.io.*;
import java.util.*;

public class search {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int x = scn.nextInt();

        int j = n - 1;
        int i = 0;
        while (i < n && j >= 0) {
            int m = arr[i][j];
            if (m == x) {
                System.out.println(i);
                System.out.println(j);
                return;
            } else if (m > x) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Not Found");
    }

}