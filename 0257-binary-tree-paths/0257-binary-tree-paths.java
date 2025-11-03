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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ls = new ArrayList<>();
        if(root==null)return ls;
        helper(root,"",ls);
        return ls;
        
        
    }
    public void helper(TreeNode root, String path,List<String> ls){
        if(root==null)return;
        if(path.length()>0)path+="->";
        path+=root.val;
        if(root.left==null && root.right==null){
            ls.add(path);
            return;
        }
        helper(root.left,path,ls);
        helper(root.right,path,ls);
    }
    
}