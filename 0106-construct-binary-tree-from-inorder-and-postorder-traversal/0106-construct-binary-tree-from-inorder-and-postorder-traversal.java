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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null || inorder.length!=postorder.length)return null;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i],i);
        }
        return buildPost(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
        
    }
    public TreeNode buildPost(int[] inorder, int inorderstart, int inorderend, int[] postorder, int postorderstart, int postorderend, HashMap<Integer,Integer>map){
        if(postorderstart>postorderend || inorderstart>inorderend)return null;
        TreeNode root = new TreeNode(postorder[postorderend]);
        int inroot = map.get(postorder[postorderend]);
        int numsleft=inroot-inorderstart;
        root.left=buildPost(inorder,inorderstart,inroot-1,postorder,postorderstart,postorderstart+numsleft-1,map);
        root.right=buildPost(inorder,inroot+1,inorderend,postorder,postorderstart+numsleft,postorderend-1,map);
        return root;
    }
}