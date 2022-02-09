import java.util.*;

public class p12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        int nsp = 0, nst = 1;

        for (int r = 1; r <= n; r++) {

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(a + "\t");
                int c = a + b;
                a = b;
                b = c;

            }
            nst++;
            System.out.println();

        }

    }
}