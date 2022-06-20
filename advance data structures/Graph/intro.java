import java.util.ArrayList;

public class intro {
    public static class edge {
        int s; // source
        int n; // neighbour
        int w; // weight

        edge(int s, int n, int w) {
            this.s = s;
            this.n = n;
            this.w = w;
        }
    }

    public static void addEdge(ArrayList<edge>[] graph, int u, int v, int w) {
        graph[u].add(new edge(u, v, w));
        graph[v].add(new edge(v, u, w));
    }

    public static void construction() {
        int N = 7;
        ArrayList<edge>[] graph = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }
        addEdge(graph, 0, 3, 10);
        addEdge(graph, 0, 1, 10);
        addEdge(graph, 1, 2, 10);
        addEdge(graph, 2, 3, 40);
        addEdge(graph, 3, 4, 2);
        addEdge(graph, 4, 5, 2);
        addEdge(graph, 5, 6, 3);
        addEdge(graph, 4, 6, 8);
        display(graph, N);
    }

    public static void display(ArrayList<edge>[] graph, int N) {
        // N is number of vertex
        // 0-> 0->3@10 (array ka index--> (u-->v@w))
        for (int i = 0; i < N; i++) {
            System.out.print(i + "->");
            for (edge e : graph[i]) {
                int u = e.s;
                int v = e.n;
                int wt = e.w;
                System.out.print(u + "--" + v + "@" + wt + ",");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        construction();
    }
}
