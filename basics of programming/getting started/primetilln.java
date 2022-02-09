import java.util.*;

public class primetilln {
    public static void isPrime(int num) {
        boolean flag = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }

        }
        if (flag) {
            System.out.println(num);
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int lo = scn.nextInt();
        int hi = scn.nextInt();
        for (int i = lo; i <= hi; i++) {
            isPrime(i);
        }
    }

}