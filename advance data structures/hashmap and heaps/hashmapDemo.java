import java.util.*;

public class hashmapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 128);
        hm.put("china", 345);
        hm.put("Asia", 787);
        System.out.println(hm);
        // can be printed in any order
        boolean isPresent = hm.containsKey("china"); // true or false
        boolean isnotPresent = hm.containsKey("brazil");
        System.out.println(isPresent);
        System.out.println(isnotPresent);
        for (String key : hm.keySet()) { // keyset-->get all the keys
            System.out.println(key);
        }
        System.out.println(hm.size()); // return size

    }
}