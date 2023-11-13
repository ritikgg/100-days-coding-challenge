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
    public ListNode partition(ListNode head, int x) {
        ListNode lessThanX = new ListNode(0);
        ListNode greaterThanOrEqualX = new ListNode(0);
        
        
        ListNode lessThanXPointer = lessThanX;
        ListNode greaterThanOrEqualXPointer = greaterThanOrEqualX;
        
        while (head != null) {
            if (head.val < x) {
                lessThanXPointer.next = head;
                lessThanXPointer = lessThanXPointer.next;
            } else {
                greaterThanOrEqualXPointer.next = head;
                greaterThanOrEqualXPointer = greaterThanOrEqualXPointer.next;
            }
            head = head.next;
        }

        lessThanXPointer.next = greaterThanOrEqualX.next;
        greaterThanOrEqualXPointer.next = null;
        return lessThanX.next;
    }
}
