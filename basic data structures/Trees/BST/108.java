class Solution {
    public TreeNode help(int [] nums,int i,int j){
        if(i>j){
            return null;
        }
        int m = (i+j)/2;
        TreeNode node = new TreeNode(nums[m]);
        node.left=help(nums,i,m-1);
        node.right =help(nums,m+1,j);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
     if(nums.length==0){
         return null;
     }   
        return help(nums,0,nums.length-1);
    }
}public class 108 {
    
}
