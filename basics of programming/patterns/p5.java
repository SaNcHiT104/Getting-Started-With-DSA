import java.util.*;

public class p5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n / 2, nst = 1;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");

            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            if (2 * r < n) {
                nsp--;
                nst = nst + 2;
            } else {
                nsp++;
                nst -= 2;
            }
            System.out.println();

        }

    }
}