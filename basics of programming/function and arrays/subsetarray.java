import java.io.*;
import java.util.*;

public class subsetarray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int total = (int) Math.pow(2, n);
        for (int i = 0; i < total; i++) {
            String str = "";
            int temp = i; // important
            for (int j = n - 1; j >= 0; j--) { // ulta print krne ke liye ulta loop
                int r = temp % 2;
                temp = temp / 2;
                if (r == 0) {
                    str = "-\t" + str;
                } else {
                    str = arr[j] + "\t" + str;
                }
            }
            System.out.println(str);

        }

    }
}