import java.io.*;
import java.util.*;

public class subsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        ArrayList<String> ans = gss(s);
        System.out.println(ans);
    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char first = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> recans = gss(ros);
        ArrayList<String> myans = new ArrayList<>();
        for (String ele : recans) {
            myans.add(ele);
        }
        for (String ele : recans) {
            myans.add(first + ele);
        }
        return myans;
    }
}