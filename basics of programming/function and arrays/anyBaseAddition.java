import java.util.*;

public class anyBaseAddition {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = anybaseAddition(n1, n2, b);
        System.out.println(d);
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

}
