import java.io.*;
import java.util.*;

public class climbStairs {

    public static void display(int[] dp) {
        for (int e : dp)
            System.out.print(e + " ");
        System.out.println();
    }

    public static int climbStairR(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        if (n - 1 >= 0) {
            count += climbStairR(n - 1);
        }
        if (n - 2 >= 0) {
            count += climbStairR(n - 2);
        }
        if (n - 3 >= 0) {
            count += climbStairR(n - 3);
        }
        return count;

    }

    public static int climbStairM(int n, int[] dp) {
        if (n == 0) {
            return dp[n] = 1;
        }

        if (dp[n] != -1)
            return dp[n];

        int count = 0;

        if (n - 1 >= 0) {
            count += climbStairM(n - 1, dp);
        }
        if (n - 2 >= 0) {
            count += climbStairM(n - 2, dp);
        }
        if (n - 3 >= 0) {
            count += climbStairM(n - 3, dp);
        }
        return dp[n] = count;

    }
}