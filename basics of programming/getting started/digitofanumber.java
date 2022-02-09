import java.util.*;

public class digitofanumber {

    public static int countDigit(int n) {

        int count = 0;

        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int len = countDigit(n) - 1;
        while (len >= 0) {
            int x = n / (int) Math.pow(10, len);
            n = n % (int) Math.pow(10, len);
            System.out.println(x);
            len--;
        }
    }
}