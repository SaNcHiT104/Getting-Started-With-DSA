import java.util.*;

public class intro {
    public static class pair {
        int val1;
        int val2;

        pair(int val1, int val2) {
            this.val1 = val1;
            this.val2 = val2;
        }
    }

    public static void main(String[] args) { // remove element in increasing order
        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> {
            return a.val1 - b.val1; //lambda function
        });
        pq.add(new pair(1, 3));
        pq.add(new pair(12, 33));
        pq.add(new pair(13, 31));
        pq.add(new pair(7, 32));
        pq.add(new pair(-1, 3));
        pq.add(new pair(12, -3));
        pq.add(new pair(19, -333));
        while (pq.size() != 0) {
            pair rem = pq.remove();
            System.out.print(rem.val1);
            System.out.println(rem.val2);
        }
    }
}