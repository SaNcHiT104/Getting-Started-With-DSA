import java.util.*;

public class gcdlcm {
    public static void gcd(int n1, int n2) {
        int t1 = n1;
        int t2 = n2;
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        System.out.println(n2);
        int lcm = (t1 * t2) / n2;
        System.out.println(lcm);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        gcd(num1, num2);

    }
}