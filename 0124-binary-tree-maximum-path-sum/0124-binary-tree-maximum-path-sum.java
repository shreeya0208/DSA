/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxPathSum(TreeNode root) {
        int[] x =new int[1];
        x[0]=Integer.MIN_VALUE;
        Path(root,x);
        return x[0];
        
    }
    public int Path(TreeNode root, int[] x){
        if(root==null)return 0;
        int left = Math.max(0,Path(root.left,x));
        int right=Math.max(0,Path(root.right,x));
        x[0]=Math.max(x[0],left+right+root.val);
        return root.val+Math.max(left,right);

    }
}