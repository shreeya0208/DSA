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
    public boolean isPalindrome(ListNode head) {
        ListNode fast= head;
        ListNode slow= head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode reverseHead = reverese(slow);
        ListNode p1 = head;
        ListNode p2= reverseHead;
        while(p2!=null){
            if(p1.val != p2.val)return false;
            p1=p1.next;
            p2=p2.next;

        }
        return true;
    }
    public ListNode reverese(ListNode head){
        ListNode current= head;
        ListNode next1= null;
        ListNode prev = null;
        while(current!=null){
            next1=current.next;
            current.next=prev;
            prev=current;
            current=next1;
        }
        return prev;
    }
}