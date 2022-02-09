import java.util.*;

public class pythogorantriplet {
    public static boolean pythagorus(int a, int b, int c) {
        if (a * a == b * b + c * c)
            return true;
        else if (b * b == a * a + c * c)
            return true;
        else if (c * c == a * a + b * b)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        boolean x = pythagorus(a, b, c);
        System.out.println(x);

    }
}