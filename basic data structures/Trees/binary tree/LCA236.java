/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public ArrayList<TreeNode> nodeToRoot(TreeNode root, int data) {
        if (root == null) {
            return new ArrayList<>();
        }
        if (root.val == data) {
            ArrayList<TreeNode> base = new ArrayList<>();
            base.add(root);
            return base;
        }
        ArrayList<TreeNode> la = nodeToRoot(root.left, data);
        if (la.size() > 0) {
            la.add(root);
            return la;
        }
        ArrayList<TreeNode> ra = nodeToRoot(root.right, data);
        if (ra.size() > 0) {
            ra.add(root);
            return ra;
        }
        return new ArrayList<>();
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> pn2r = nodeToRoot(root, p.val);
        ArrayList<TreeNode> qn2r = nodeToRoot(root, q.val);
        int i = pn2r.size() - 1;
        int j = qn2r.size() - 1;
        TreeNode LCA = null;
        while (i >= 0 && j >= 0) {
            if (pn2r.get(i).val != qn2r.get(j).val) {
                break;
            }
            LCA = pn2r.get(i);
            i--;
            j--;
        }
        return LCA;
    }

}