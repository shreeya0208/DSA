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
    public int countNodes(TreeNode root) {
        int left=leftHeight(root);
        int right=rightHeight(root);
        if(left==right)return (1<<left)-1;
        else{
            return 1+countNodes(root.left)+countNodes(root.right);
        }
    }
    static int leftHeight(TreeNode node){
        int height=0;
        while(node != null){
            height++;
            node=node.left;
        }
        return height;
    }
    static int rightHeight(TreeNode node){
        int height=0;
        while(node!=null){
            height++;
            node=node.right;
        }
        return height;
    }

}