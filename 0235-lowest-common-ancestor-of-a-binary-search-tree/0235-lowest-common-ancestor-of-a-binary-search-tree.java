/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return null;
        int current = root.val;
        if(current<p.val && current<q.val){
           return lowestCommonAncestor(root.right,p,q);
        }
        else if (current>p.val && current>q.val){
           return lowestCommonAncestor(root.left,p,q);
        }
        return root;
        
    }
}