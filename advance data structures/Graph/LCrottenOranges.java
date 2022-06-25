class Solution {
    public class pair {
        int i;
        int j;

        pair() {
        }

        pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public int init(Queue<pair> qu, int[][] grid) {
        int freshOrange = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) { // rotten orange
                    qu.add(new pair(i, j));
                } else if (grid[i][j] == 1) {
                    freshOrange++;
                }
            }
        }
        return freshOrange;
    }

    static int[][] dir = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

    public int orangesRotting(int[][] grid) {
        Queue<pair> qu = new LinkedList<>();
        int freshOrange = init(qu, grid);
        // adding all the rotten orranges in the qu + counting freshOranges
        if (freshOrange == 0) {
            return 0;
        }
        int n = grid.length;
        int m = grid[0].length;
        int time = 0;
        while (qu.size() != 0) {
            int size = qu.size();
            while (size-- > 0) {
                pair rem = qu.remove();
                int i = rem.i;
                int j = rem.j;
                if (grid[i][j] == 1) { // theek orange ko rot bhi to krna hai
                    grid[i][j] = 2;
                    freshOrange--;
                }
                if (freshOrange == 0) {
                    return time; 
                }
                for (int[] d : dir) {
                    int r = i + d[0];
                    int c = j + d[1];
                    if (r >= 0 && c >= 0 && r < n && c < m && grid[r][c] == 1) {
                        qu.add(new pair(r, c));
                    }
                }
            }
            time++;
        }
        return freshOrange != 0 ? -1 : time;
    }

}
