import java.util.*;

public class p4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = 0, nst = n;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }

            nsp++;
            nst--;
            System.out.println();
        }

        // write ur code here

    }
}