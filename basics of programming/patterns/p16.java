import java.util.*;

public class p16 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = 2 * n - 3, nst = 1;

        for (int r = 1; r <= n; r++) {
            int count = 1;
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(count + "\t");
                count++;

            }
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            if (r == n) {
                nst--;
                count = count - 2;
            } else {
                count = count - 1;
            }

            for (int cst = 1; cst <= nst; cst++) {

                System.out.print(count + "\t");
                count--;

            }

            nst++;
            nsp -= 2;
            System.out.println();
        }

    }
}