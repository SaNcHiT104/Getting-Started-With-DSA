class Solution {
    static int totaltilt = 0;

    public int sum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = sum(root.left);
        int right = sum(root.right);
        int tilt = Math.abs(left - right);
        totaltilt += tilt;
        return root.val + left + right;
    }

    public int findTilt(TreeNode root) {
        totaltilt = 0;
        sum(root);
        return totaltilt;
    }
}