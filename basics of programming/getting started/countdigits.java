import java.util.*;

public class countdigits {
    public static int Countdigit() {
        Scanner scn = new Scanner(System.in);
        int count = 0;
        int n = scn.nextInt();
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int x = Countdigit();
        System.out.println(x);
    }
}