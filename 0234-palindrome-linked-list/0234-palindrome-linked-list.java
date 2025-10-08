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
        if(head==null)return false;
        if(head.next==null)return true;
        ListNode mid =middle(head);
        ListNode reverseHead=reverse(mid.next);
        ListNode first = head;
        ListNode second = reverseHead;
        while(second!=null){
            if(first.val != second.val){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
        
    }
    public static ListNode middle(ListNode head){
        ListNode fast = head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public static ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}