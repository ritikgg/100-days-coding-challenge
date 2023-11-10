public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode mid = findMiddle(head), rev = reverseList(mid.next);
        mid.next = null;
        mergeLists(head, rev);
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private void mergeLists(ListNode list1, ListNode list2) {
        while (list2 != null) {
            ListNode next1 = list1.next, next2 = list2.next;
            list1.next = list2;
            list2.next = next1;
            list1 = next1;
            list2 = next2;
        }
    }
}
