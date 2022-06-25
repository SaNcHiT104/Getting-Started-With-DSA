import java.io.*;
import java.util.*;

//PriorityQueue se BFS
public class Main {
    static class prims {
        int s; // src
        int p;// parent
        int cost;

        prims() {
        }

        prims(int s, int p, int cost) {
            this.s = s;
            this.p = p;
            this.cost = cost;
        }
    }

    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void primsAlgo(ArrayList<Edge>[] graph) {
        int n = graph.length;
        boolean[] vis = new boolean[n];
        PriorityQueue<prims> pq = new PriorityQueue<>((a, b) -> {
            return a.cost - b.cost;
        });
        pq.add(new prims(0, -1, 0));
        while (pq.size() != 0) {

            prims rem = pq.remove();

            if (rem.p != -1 && vis[rem.s] == false) {
                System.out.println("[" + rem.s + "-" + rem.p + "@" + rem.cost + "]");
            }
            vis[rem.s] = true;
            for (Edge e : graph[rem.s]) {
                int nbr = e.nbr;
                if (!vis[nbr]) {
                    pq.add(new prims(nbr, rem.s, e.wt));
                }
            }

        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        primsAlgo(graph);
    }

}