import java.util.*;

public class inversenumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 0, lastindex = 1;
        while (n != 0) {
            int x = n % 10;
            n /= 10;
            ans += lastindex * (int) Math.pow(10, x - 1);
            lastindex++;
        }
        System.out.println(ans);
    }
}