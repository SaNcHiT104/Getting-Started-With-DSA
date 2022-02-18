import java.io.*;
import java.util.*;

public class longestConsEle {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // Creating hashmap
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int ele : arr) {
            hm.put(ele, true);
        }
        // checking potential starting
        for (int ele : arr) {
            if (hm.containsKey(ele - 1)) {
                hm.put(ele, false);
            }
        }
        // checking for longest chain
        int maxLen = 0;
        int maxStr = 0;
        for (int ele : arr) {
            if (hm.get(ele) == true) {
                int tempLen = 1;
                int tempStr = ele;
                while (hm.containsKey(tempStr + tempLen)) { // checking if next number is present or not
                    tempLen++;
                }
                if (tempLen > maxLen) {
                    maxLen = tempLen;
                    maxStr = tempStr;
                }
            }
        }
        for (int i = maxStr; i < maxStr + maxLen; i++) { // humare pass starting aagaya aur
            // length aagaye to normal add krkke loop chla diya
            System.out.println(i);
        }
    }

}