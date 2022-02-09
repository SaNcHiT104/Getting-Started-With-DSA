import java.io.*;
import java.util.*;

public class saddle {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        int min = a[0][0];
        int max = a[0][0];

        for (int j = 0; j < n; j++) {
            if (a[0][j] < min) {
                min = a[0][j];
            }
        }
        int x = 0;
        for (int j = 0; j < n; j++) {
            if (a[0][j] == min) {
                x = j;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i][x] > max) {
                max = a[i][x];
            }
        }
        System.out.println(max);

    }

}