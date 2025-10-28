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
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parent = new HashMap<>();
        function(root,parent);
        Map<TreeNode,Boolean> visited = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(target);
        visited.put(target,true);
        int distance =0;
        while(!queue.isEmpty()){
            int size = queue.size();
            if(distance==k)break;
            distance++;
            for(int i=0; i<size; i++){
                TreeNode current = queue.poll();
                if(current.left != null && visited.get(current.left)==null){
                    queue.offer(current.left);
                    visited.put(current.left,true);
                }
                 if(current.right != null && visited.get(current.right)==null){
                    queue.offer(current.right);
                    visited.put(current.right,true);
                }
                if(parent.get(current)!=null && visited.get(parent.get(current))==null){
                    queue.offer(parent.get(current));
                    visited.put(parent.get(current),true);
                }  
              
            }
            

        }
        List<Integer> ls = new ArrayList<>();
        while(!queue.isEmpty()){
            ls.add(queue.poll().val);
        }
        return ls;


  }
  public void function(TreeNode root, Map<TreeNode,TreeNode> parent){
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
        TreeNode node = queue.poll();
        if(node.left!=null){
            queue.offer(node.left);
            parent.put(node.left,node);
        }
        if(node.right!=null){
            queue.offer(node.right);
            parent.put(node.right,node);
        }
    }
  }


}