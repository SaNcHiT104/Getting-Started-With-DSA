import java.util.*;
class Solution {
    public class pair {
        int vtx;
        int clr;

        pair(int vtx, int clr) {
            this.vtx = vtx;
            this.clr = clr;
        }
    }

    // -1-> unvisited
    // 1--.blue
    // 0--> red
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] vis = new int[n];
        Arrays.fill(vis, -1);
        for (int i = 0; i < n; i++) { // if graph has components
            if (vis[i] == -1) {
                Queue<pair> qu = new LinkedList<>();
                qu.add(new pair(i, 0));
                while (qu.size() != 0) {
                    int size = qu.size();
                    while (size-- > 0) {
                        pair rem = qu.remove();
                        if (vis[rem.vtx] != -1) {
                            if (vis[rem.vtx] == rem.clr) { // same clr ke hai
                                continue;
                            } else {
                                return false;
                            }
                        }
                        vis[rem.vtx] = rem.clr;
                        int src = rem.vtx;
                        for (int e : graph[src]) {
                            if (vis[e] == -1) {
                                qu.add(new pair(e, 1 - rem.clr));
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}