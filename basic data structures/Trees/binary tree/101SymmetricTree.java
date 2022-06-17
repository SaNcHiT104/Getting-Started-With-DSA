class Solution {
    public boolean isMirror(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        }
        if (n1 != null && n2 != null && n1.val == n2.val) {
            return isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);
        }
        return false;
    }

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
}