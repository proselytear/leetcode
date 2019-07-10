package net.proselyte.leetcode.algorithms.linkedlists;

/**
 * Problem #83
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p>
 * Example 1:
 * <p>
 * Input: 1->1->2
 * Output: 1->2
 * Example 2:
 * <p>
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 */

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(1);
        ListNode l2 = new ListNode(2);

        l1.next = l11;
        l11.next = l2;

        System.out.println("init: " + l1);

        ListNode result = deleteDuplicates(l1);

        System.out.println("result: " + result);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}


