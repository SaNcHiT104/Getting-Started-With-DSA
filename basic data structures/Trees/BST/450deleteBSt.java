class Solution {
    public int max(TreeNode node) {
        TreeNode curr = node;
        while (curr.right != null) {
            curr = curr.right;
        }
        return curr.val;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            // 0 and 1 child
            if (root.right == null || root.left == null) {
                return root.left != null ? root.left : root.right;
            }
            int maxele = max(root.left);
            root.val = maxele;
            root.left = deleteNode(root.left, maxele);
        }
        return root;
    }
}