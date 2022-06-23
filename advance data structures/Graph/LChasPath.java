class Solution {
    public static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }

    public boolean haspath(ArrayList<Edge>[] graph, int src, int destn, boolean[] vis) {
        if (src == destn) {
            return true;
        }
        vis[src] = true;
        for (Edge e : graph[src]) {
            int nbr = e.nbr;
            if (!vis[nbr]) {
                boolean recans = haspath(graph, nbr, destn, vis);
                if (recans) {
                    return true;
                }
            }
        }
        return false;

    }

    public void addEdge(ArrayList<Edge>[] graph, int u, int v) {
        graph[u].add(new Edge(u, v));
        graph[v].add(new Edge(v, u));
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] vis = new boolean[n];
        ArrayList<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            addEdge(graph, edges[i][0], edges[i][1]);
        }
        boolean ans = haspath(graph, source, destination, vis);
        return ans;
    }
}