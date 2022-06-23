import java.util.*;

public class intro {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(20);
        hs.add(50);
        hs.add(70);
        hs.add(90);
        System.out.println(hs.size()); // return size;
        System.out.println(hs.contains(50)); //return true or false if data is in the hashset or not
        hs.remove(20);
        System.out.println(hs.size());
        
    }
}