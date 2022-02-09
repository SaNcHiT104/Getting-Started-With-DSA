import java.util.*;

public class p14 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        for (int r = 1; r <= 10; r++) {
            int n = r * x;
            System.out.println(x + " * " + r + " = " + n);
        }
        // write ur code here

    }
}