import java.util.*;

public class p15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n / 2, nst = 1;

        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            int count = (r < n / 2 + 1) ? r : n - r + 1;
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(count + "\t");
                if (cst <= nst / 2) {
                    count++;
                } else {
                    count--;
                }
            }

            if (2 * r <= n) {

                nsp--;
                nst += 2;
            } else {

                nsp++;
                nst -= 2;
            }
            System.out.println();

        }

        // write ur code here

    }
}