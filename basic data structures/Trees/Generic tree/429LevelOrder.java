//LC levelorder
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> qu = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        qu.add(root);
        while (qu.size() > 0) {
            int size = qu.size();
            List<Integer> ans1 = new ArrayList<>();
            while (size-- > 0) {
                Node rem = qu.remove();
                ans1.add(rem.val);
                for (Node child : rem.children) {
                    qu.add(child);
                }
            }
            ans.add(ans1);
        }
        return ans;
    }
}