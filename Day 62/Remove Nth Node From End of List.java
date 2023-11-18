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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Create a dummy node for edge case where head itself needs to be removed.
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // using slow and fast pointers
        ListNode slow = dummy;
        ListNode fast = dummy;

        //Move the fast pointer n nodes ahead
         for(int i = 0; i <= n; i++){
             fast = fast.next;
         }

         while(fast != null) //Move both pointers untill fast reaches end
        { slow = slow.next;
         fast = fast.next;}

         //Remove the nth nodes from the end 

         slow.next = slow.next.next;
        
        return dummy.next; 
    }
}
