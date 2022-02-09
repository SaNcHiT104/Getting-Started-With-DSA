import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();

            boolean isPrime = true;
            for (int num = 2; num * num <= n; num++) {
                if (n % num == 0) {
                    isPrime = false;
                    break;
                }

            }

            if (isPrime) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }

}