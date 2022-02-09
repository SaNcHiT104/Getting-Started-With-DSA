import java.util.*;

public class p1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = 0, nst = 1;
        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }

            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            nsp += 0;
            nst++;
            System.out.println();
        }
    }
}