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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ls = new ArrayList<>();
        if(root==null)return ls;
        queue.add(root);
        while(!queue.isEmpty()){
            int size= queue.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode n = queue.poll();
                sublist.add(n.val);
                if(n.left!=null)queue.add(n.left);
                if(n.right!=null)queue.add(n.right);
                
            }
            ls.add(sublist);

        }
        for(int i=0; i<ls.size(); i++){
            if(i%2!=0){
                Collections.reverse(ls.get(i));
            }
        }
        return ls;
    }
}