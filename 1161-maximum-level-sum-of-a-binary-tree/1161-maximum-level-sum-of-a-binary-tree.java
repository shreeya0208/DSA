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
    public int maxLevelSum(TreeNode root) {
        if(root==null)return 0;
        Queue<TreeNode> queue = new LinkedList<>();
      
        queue.add(root);
        int currentLevel=1;
        int maxLevel=0;
        int maxSum=Integer.MIN_VALUE;
        while(!queue.isEmpty()){
            int size = queue.size();
             int sum =0;
            for(int i=0; i<size; i++){
                TreeNode current = queue.poll();
                sum=sum+current.val;
                if(current.left!=null)queue.add(current.left);
                if(current.right!=null)queue.add(current.right);
            }
            if(sum>maxSum){
               maxSum=sum;
                maxLevel=currentLevel;
            }
            currentLevel++;
          
        }
        return maxLevel;

       
    
        
    }
}