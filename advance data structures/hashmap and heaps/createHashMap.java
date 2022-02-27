import java.io.*;
import java.util.*;

public class createHashMap {

    public static class HashMap<K, V> {
        private class HMNode {
            K key; // generic- mtlb apne aap dekh lega kya hai , aur apne aap uska type decide
            V value;

            HMNode(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // n
        private LinkedList<HMNode>[] buckets; // N = buckets.length

        public HashMap() {
            initbuckets(4); // N(total bi)
            size = 0; // n-size(total keys)
        }

        private void initbuckets(int N) {
            buckets = new LinkedList[N];
            for (int bi = 0; bi < buckets.length; bi++) {
                buckets[bi] = new LinkedList<>();
            }
        }

        public void put(K key, V value) throws Exception {
            int bi = findBucketIdx(key); // get the bucket index
            int di = findLinkedListidx(key, bi); // get linked list idx from that certain bi;
            if (di == -1) {
                // insert
                LinkedList<HMNode> tmp = buckets[bi]; // getting on that bi;
                HMNode node = new HMNode(key, value); // foorming new HMNode
                tmp.add(node); // adding on last
                size++;
            } else {
                // update
                LinkedList<HMNode> tmp = buckets[bi];
                HMNode node = tmp.get(di); // getting on that node(bi-->on that node using di)
                node.value = value; // updating the value
            }
            double lambda = (size * 1.0) / buckets.length; // (n/N)
            if (lambda > 2) {
                rehashing();
            }
        }

        private int findBucketIdx(K key) {

            int hc = key.hashCode(); // vo hi hashcode jadugar // -infi to + infi
            int bi = Math.abs(hc) % buckets.length; // ye idx dega kyuki hc kuch bhi lakr dega
            return bi;
        }

        private int findLinkedListidx(K key, int bi) {
            LinkedList<HMNode> tmp = buckets[bi]; // getting on that linked list in certain bi
            for (int i = 0; i < tmp.size(); i++) {
                HMNode curr = tmp.get(i);
                if (key.equals(curr.key)) { // checking for the key on every index
                    return i; // di
                }

            }
            return -1;

        }

        private void rehashing() throws Exception {
            LinkedList<HMNode>[] prevBuckets = buckets; // gettiong the bucket
            initbuckets(2 * prevBuckets.length); // reinitialising bucket with double size
            size = 0;
            for (int bi = 0; bi < prevBuckets.length; bi++) { // loop in bucket arr
                for (int p = 0; p < prevBuckets[bi].size(); p++) { // loop in each bucket to get HMnode
                    HMNode curr = prevBuckets[bi].get(p);
                    put(curr.key, curr.value);
                }
            }
        }

        public V get(K key) throws Exception {
            int bi = findBucketIdx(key); // get the bucket index
            int di = findLinkedListidx(key, bi); // get linked list idx from that certain bi;
            if (di == -1) {
                return null;
            } else {
                LinkedList<HMNode> tmp = buckets[bi];
                HMNode curr = tmp.get(di);
                return curr.value;
            }
        }

        public boolean containsKey(K key) {
            int bi = findBucketIdx(key); // get the bucket index
            int di = findLinkedListidx(key, bi); // get linked list idx from that certain bi;
            if (di == -1) { // data milla ya nahi milla
                return false;
            } else {
                return true;
            }
        }

        public V remove(K key) throws Exception {
            int bi = findBucketIdx(key); // get the bucket index
            int di = findLinkedListidx(key, bi); // get linked list idx from that certain bi;
            if (di == -1) { // value hai hi nhi udayega kya
                return null;
            } else {
                LinkedList<HMNode> tmp = buckets[bi];
                HMNode curr = tmp.get(di);
                V val = curr.value; // jb delete krte hai to ek value bhi milti hai
                tmp.remove(di); // inbuilt hai
                size--;
                return val;
            }
        }

        public ArrayList<K> keyset() throws Exception {
            ArrayList<K> ks = new ArrayList<K>();
            for (int bi = 0; bi < buckets.length; bi++) {
                for (int di = 0; di < buckets[bi].size(); di++) {
                    HMNode curr = buckets[bi].get(di);
                    ks.add(curr.key);
                }
            }
            return ks;
        }

        public int size() {
            return this.size;
        }

        public void display() {
            System.out.println("Display Begins");
            for (int bi = 0; bi < buckets.length; bi++) {
                System.out.print("Bucket" + bi + " ");
                for (HMNode node : buckets[bi]) {
                    System.out.print(node.key + "@" + node.value + " ");
                }
                System.out.println(".");
            }
            System.out.println("Display Ends");
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("put")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                Integer val = Integer.parseInt(parts[2]);
                map.put(key, val);
            } else if (str.startsWith("get")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.get(key));
            } else if (str.startsWith("containsKey")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.containsKey(key));
            } else if (str.startsWith("remove")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.remove(key));
            } else if (str.startsWith("size")) {
                System.out.println(map.size());
            } else if (str.startsWith("keyset")) {
                System.out.println(map.keyset());
            } else if (str.startsWith("display")) {
                map.display();
            }
            str = br.readLine();
        }
    }
}