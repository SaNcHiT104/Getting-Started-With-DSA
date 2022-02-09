import java.io.*;
import java.util.*;

public class mazepath {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(getMazePaths(0, 0, n - 1, m - 1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myans = new ArrayList<>();
        if (sc + 1 <= dc) {
            ArrayList<String> hcol = getMazePaths(sr, sc + 1, dr, dc);
            for (String ele : hcol) {
                myans.add("h" + ele);
            }
        }
        if (sr + 1 <= dr) {
            ArrayList<String> vcol = getMazePaths(sr + 1, sc, dr, dc);
            for (String ele : vcol) {
                myans.add("v" + ele);
            }

        }
        return myans;
    }

}