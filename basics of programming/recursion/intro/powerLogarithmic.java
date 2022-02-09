import java.io.*;
import java.util.*;

public class powerLogarithmic {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int y = power(x, n);
        System.out.println(y);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int recans = power(x, n / 2);
        int myans = recans * recans;
        if (n % 2 != 0) {
            myans *= x;
        }
        return myans;
    }

}