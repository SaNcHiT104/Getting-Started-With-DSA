class Solution {
    public int height(TreeNode root) {
        if (root == null) {
            return -1;
        }
        return Math.max(height(root.left) + 1, height(root.right) + 1);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int diameterThroughNode = lh + rh + 2;
        return Math.max(ld, Math.max(diameterThroughNode, rd));
    }
}

// 2nd soln
class Solution {
    public class pair {
        int h;
        int d;

        pair() {
        }

        pair(int h, int d) {
            this.h = h;
            this.d = d;
        }
    }

    public pair diameter(TreeNode node) {
        if (node == null) {
            return new pair(-1, 0);
        }
        pair la = diameter(node.left);
        pair ra = diameter(node.right);
        pair my = new pair();
        my.h = Math.max(la.h, ra.h) + 1;
        int across = la.h + ra.h + 2;
        my.d = Math.max(across, Math.max(la.d, ra.d));
        return my;

    }

    public int diameterOfBinaryTree(TreeNode root) {
        pair ans = diameter(root);
        return ans.d;
    }
}