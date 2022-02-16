import java.io.*;
import java.util.*;

public class highestFreq {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)) {
                int val = hm.get(ch);
                hm.put(ch, val + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        char maxFreqChar = str.charAt(0);
        for (Character key : hm.keySet()) {
            if (hm.get(key) > hm.get(maxFreqChar)) {
                maxFreqChar = key;
            }
        }
        System.out.println(maxFreqChar);
    }

}