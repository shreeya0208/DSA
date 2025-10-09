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
    public List<Integer> rightSideView(TreeNode root) {
         Queue<TreeNode> queue= new LinkedList<TreeNode>();
        List<Integer>ls = new ArrayList<>();
        if(root==null)return ls;
        TreeNode node = root;
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode temp = queue.peek();
                if(temp.left!=null)queue.add(temp.left);
                if(temp.right!=null)queue.add(temp.right);
                queue.poll();
                if(i==size-1){
                    ls.add(temp.val);
                }
                
            }
           
        }
        return ls;
       
    
        
    }
}