import java.io.*;
import java.util.*;

public class findElement {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == d) {
                System.out.print(i);
                flag = true;

            }

        }
        if (flag == false) {
            System.out.print("-1");
        }

    }

}