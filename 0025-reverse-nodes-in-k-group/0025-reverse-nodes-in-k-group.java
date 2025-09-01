/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode current = head;
        ListNode prev=dummy;
        ListNode nex= dummy;
        int count=0;
        while(current!=null){
            current=current.next;
            count++;
        }
        while(count>=k){
            current=prev.next;
             nex=current.next;
        
        for(int i=1; i<k; i++){
            current.next=nex.next;
            nex.next=prev.next;
                prev.next=nex;
                nex=current.next;
        }
         prev=current;
        count=count-k;
        }
       
        return dummy.next;

        
    }
}