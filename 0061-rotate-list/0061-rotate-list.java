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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0)return null;
        ListNode tail=head;
        int len=1;
        while(tail.next != null){
            len++;
            tail=tail.next;
        }
        if(k%len==0)return head;
        k=k%len;
        ListNode last = lastNode(head,len-k);
        tail.next=head;
        ListNode newhead = last.next;
        last.next=null;
        return newhead;
    }
    public ListNode lastNode(ListNode head, int k){
        ListNode temp=head;
        int count=1;
        while(temp.next != null){
            if(count==k){
                return temp;
            }
            count++;
            temp=temp.next;

        }
        return head;
    }
}