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
        Queue <TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ls = new ArrayList<>();
        if(root==null)return ls;
        TreeNode node = root;
        queue.add(root);
        while(!queue.isEmpty()){
            int size= queue.size();
            ArrayList<Integer> sublist = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode n = queue.poll();
                if(n.left!=null)queue.add(n.left);
                if(n.right!=null)queue.add(n.right);
                sublist.add(n.val);
            }
            ls.add(sublist);
           

        }
        for(int i=0; i<ls.size(); i++){
            if(i%2==1){
                Collections.reverse(ls.get(i));
            }
        }
        return ls;

    }
}