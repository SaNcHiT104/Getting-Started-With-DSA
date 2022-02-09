import java.util.*;

public class allbinary {
    public static void decimaltobinary(int n) {
        int count = 0;
        int i = 1;
        while (n != 0) {
            int d = n % 2;
            n /= 2;

            count += d * i;
            i *= 10;
        }
        System.out.println(count);

    }

    public static void binarytodecimal(int n) {
        int ans = 0, i = 0;
        while (n != 0) {
            int d = n % 10;
            n /= 10;
            ans += d * (int) Math.pow(2, i);
            i++;
        }
        System.out.println(ans);
    }

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

    public static void anybasetoanybase(int n, int b, int c) {
        int x = anybasetodecimal(n, b);
        int y = decimaltoanybase(x, c);
        System.out.println(y);

    }

    public static int anybaseAddition(int n, int m, int b) {
        int ans = 0, pow = 1, carry = 0;
        while (n != 0 || m != 0 || carry != 0) {
            int sum = carry + (n % 10) + (m % 10);
            n /= 10;
            m /= 10;
            carry = sum / b;
            sum %= b;
            ans += sum * pow;
            pow *= 10;
        }
        return ans;
    }

    public static int anybasesubtraction(int n, int m, int b) {
        int ans = 0, borrow = 0, pow = 1;
        while (m != 0) {
            int sub = borrow + m % 10 - n % 10;
            if (sub < 0) {
                sub += b;
                borrow = -1;
            } else {
                borrow = 0;
                ans += sub * pow;
                pow *= 10;

            }

        }
        return ans;
    }

    public static int multiplication_digit(int n, int digit, int base) {
        int ans = 0, carry = 0, pow = 1;
        while (n != 0 || carry != 0) {
            int prod = carry + (n % 10) * digit;
            n /= 10;
            carry = prod / base;
            prod %= base;
            pow *= 10;
        }
        return ans;
    }

    public static int get_digit(int m, int n, int b) {
        int ans = 0, pow = 1;
        while (m != 0) {
            int x = multiplication_digit(n, m % 10, b);
            ans = anybaseAddition(ans, x * pow, b);
            pow *= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int b = scn.nextInt();
        // int c = scn.nextInt();

    }
}
