package net.proselyte.leetcode.algorithms.linkedlists;

/**
 * Problem #21
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l1_1 = new ListNode(2);
        ListNode l1_2 = new ListNode(4);

        l1.next = l1_1;
        l1_1.next = l1_2;

        ListNode l2 = new ListNode(1);
        ListNode l2_1 = new ListNode(3);
        ListNode l2_2 = new ListNode(4);

        l2.next = l2_1;
        l2_1.next = l2_2;

        ListNode result = mergeTwoLists(l1, l2);

        System.out.println("result: " + result);
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(Integer.MIN_VALUE);
        ListNode result = head;
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                head.next = l1;
                l1 = l1.next;
                head = head.next;
            } else {
                head.next = l2;
                l2 = l2.next;
                head = head.next;
            }
            if (l1 == null)
                head.next = l2;
            if (l2 == null)
                head.next = l1;
        }
        return result.next;
    }
}
