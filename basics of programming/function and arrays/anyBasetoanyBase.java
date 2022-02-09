import java.util.*;

public class anyBasetoanyBase {
    public static int decimaltoanybase(int n, int b) {
        int ans = 0, pow = 1;
        while (n != 0) {
            int d = n % b;
            n /= b;
            ans += d * pow;
            pow *= 10;
        }
        return ans;
    }

    public static int anybasetodecimal(int n, int b) {
        int ans = 0;
        int i = 0;
        while (n != 0) {
            int d = n % 10;
            n /= 10;
            ans += d * (int) Math.pow(b, i);
            i++;

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int x = anybasetodecimal(n, sourceBase);
        int y = decimaltoanybase(x, destBase);
        System.out.print(y);

    }
}