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
    public List<Integer> postorderTraversal(TreeNode root) {
       Stack<TreeNode> st= new Stack<>();
       List<Integer> ls = new ArrayList<>();
       if(root==null)return ls;
       TreeNode curr = root;
       while(!st.isEmpty() || curr!=null ){
        if(curr != null){
            st.push(curr);
            curr=curr.left;
        }
        else{
           TreeNode temp=st.peek().right;
            if(temp==null){
                temp=st.peek();
                st.pop();
                ls.add(temp.val);
                while(!st.isEmpty() && temp==st.peek().right){
                    temp=st.peek();
                    st.pop();
                    ls.add(temp.val);
                }
            }
            else{
                curr=temp;
            }
        }

       }
       return ls;
}
}