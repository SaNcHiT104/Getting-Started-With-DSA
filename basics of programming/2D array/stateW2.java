import java.io.*;
import java.util.*;

public class stateW2 {
    public static void stateofwakanda2(int[][] a) {
        for (int gap = 0; gap < a.length; gap++) {
            for (int i = 0, j = gap; j < a.length; i++, j++) {
                System.out.println(a[i][j]);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        stateofwakanda2(a);
    }

}