import java.io.*;
import java.util.*;

public class kpc {
    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(getKPC(str));
    }

    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> recans = getKPC(ros);
        ArrayList<String> myans = new ArrayList<>();
        int newch = ch - '0';
        String code = codes[newch];
        for (int i = 0; i < code.length(); i++) {
            char newchar = code.charAt(i);
            for (String ele : recans) {
                myans.add(newchar + ele);
            }
        }
        return myans;
    }

}