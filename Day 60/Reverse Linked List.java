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
    public ListNode reverseList(ListNode head) {
        //by recursion
        // if(head == null || head.next == null){
        //     return head;
        // }
        // ListNode newHead = reverseList(head.next);
        // ListNode headNext = head.next;
        // headNext.next = head;
        // head.next = null;
        // return newHead;

        //iteratively
        
        ListNode current = head;
        ListNode prev = null;
        while(current != null){
            ListNode temp = current.next;
            current.next =prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}
