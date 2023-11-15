public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        // Finding length of list
        int length = 1; // Start with 1 to account for the head node
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // rotation formula  to avoid unnecessary rotations
        k = k % length;
        if (k == 0) {
            return head; // No rotation needed
        }

        // Traverse to the (length - k)th node
        ListNode newTail = head;
        for (int i = 1; i < length - k; i++) {
            newTail = newTail.next;
        }

        //  Update pointers for rotation
        ListNode newHead = newTail.next;
        newTail.next = null; // Set the new tail's next to null
        tail.next = head; // Connect the original tail to the original head

        return newHead;
    }
}
