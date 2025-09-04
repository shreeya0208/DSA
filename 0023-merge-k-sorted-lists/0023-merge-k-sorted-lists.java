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
    public ListNode mergeKLists(ListNode[] lists) {
         PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);
         for(int i=0; i<lists.length; i++){
            if(lists[i]!=null)heap.add(lists[i]);
         }
         ListNode dummy = new ListNode(-1);
         ListNode temp = dummy;
         while(!heap.isEmpty()){
            ListNode min = heap.poll();
            temp.next=min;
            temp=temp.next;

            if(min.next!=null)heap.add(min.next);
         }
         return dummy.next;
    }
}