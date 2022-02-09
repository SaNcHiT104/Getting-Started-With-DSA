import java.util.*;

public class p11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 1, nst = 1;

        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(ans + "\t");
                ans++;
            }

            nst++;
            System.out.println();
        }

    }
}