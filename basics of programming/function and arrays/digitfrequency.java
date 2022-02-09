import java.util.*;

public class digitfrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int count = 0;
        while (n != 0) {
            int x = n % 10;
            n /= 10;
            if (x == d) {
                count++;
            }
        }
        return count;

    }
}