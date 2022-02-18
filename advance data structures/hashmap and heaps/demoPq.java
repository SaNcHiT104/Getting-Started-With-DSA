import java.util.*;

public class demoPq {
    public static void main(String[] args) {
        int[] arr = { 1, 22, 32, 11, 23, 33, 5, 5, 68 };
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // default min PQ
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder()); // max pq
        for (int ele : arr) {
            pq.add(ele);
        }
        while (pq.size() != 0) {
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}