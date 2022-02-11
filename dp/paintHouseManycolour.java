import java.io.*;
import java.util.*;

public class Main {
    // public static long min(long...arr){
    // long minn =(long)1e15;
    // for(long x:arr){
    // minn = Math.min(x,minn)
    // }
    // return minn;
    // }
    public static long paintHouseManyColour(int[][] arr) {
        int n = arr.length;
        int k = arr[0].length;
        long[][] dp = new long[n][k];
        for (int j = 0; j < k; j++) {
            dp[0][j] = arr[0][j];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < k; j++) {
                long min = Integer.MAX_VALUE;
                for (int m = 0; m < k; m++) {
                    if (m != j) {
                        if (dp[i - 1][m] < min) {
                            min = dp[i - 1][m];
                        }
                    }
                }
                dp[i][j] = arr[i][j] + min;

            }
        }
        long minn = Integer.MAX_VALUE;

        for (int j = 0; j < k; j++) {

            if (dp[n - 1][j] < minn) {
                minn = dp[n - 1][j];
            }
        }

        return minn;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[][] arr = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        long ans = paintHouseManyColour(arr);
        System.out.println(ans);
    }
}