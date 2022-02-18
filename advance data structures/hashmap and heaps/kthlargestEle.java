import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            if (i < k) {
                pq.add(arr[i]);
            } else {
                if (pq.peek() < arr[i]) {
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        while (pq.size() != 0) {
            System.out.println(pq.remove());
        }
    }

}