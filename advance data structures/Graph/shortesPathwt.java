import java.io.*;
import java.util.*;

public class Main {
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

    static class dij {
        int src;
        String psf;
        int wsf;

        dij(int src, String psf, int wsf) {
            this.src = src;
            this.psf = psf;
            this.wsf = wsf;
        }
    }

    public static void dijAlgo(ArrayList<Edge>[] graph, int src) {
        int n = graph.length;
        PriorityQueue<dij> pq = new PriorityQueue<>((a, b) -> {
            return a.wsf - b.wsf;
        });
        boolean[] vis = new boolean[n];
        pq.add(new dij(src, src + "", 0));
        while (pq.size() != 0) {
            dij rem = pq.remove();
            if (vis[rem.src]) {
                continue;
            }
            vis[rem.src] = true;
            System.out.println(rem.src + " via " + rem.psf + " @ " + rem.wsf);
            for (Edge e : graph[rem.src]) {
                int nbr = e.nbr;
                if (!vis[nbr]) {
                    pq.add(new dij(nbr, rem.psf + nbr, rem.wsf + e.wt));
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

        int src = Integer.parseInt(br.readLine());
        dijAlgo(graph, src);

    }
}