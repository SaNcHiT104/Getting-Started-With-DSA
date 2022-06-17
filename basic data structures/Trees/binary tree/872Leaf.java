class Solution {
    public void dfs(TreeNode root, ArrayList<Integer> v) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            v.add(root.val);
            return;
        }
        dfs(root.left, v);
        dfs(root.right, v);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> v1 = new ArrayList<>();
        ArrayList<Integer> v2 = new ArrayList<>();
        dfs(root1, v1);
        dfs(root2, v2);
        if (v1.size() == v2.size()) {
            for (int i = 0; i < v1.size(); i++) {
                if (v1.get(i) != v2.get(i))
                    return false;
            }
            return true;
        }
        return false;
    }
}