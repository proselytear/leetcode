package net.proselyte.leetcode.algorithms.linkedlists;

/**
 * Problem #2
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode1_1 = new ListNode(4);
        ListNode listNode1_2 = new ListNode(3);
        listNode1.next = listNode1_1;
        listNode1_1.next = listNode1_2;

        ListNode listNode2 = new ListNode(5);
        ListNode listNode2_1 = new ListNode(6);
        ListNode listNode2_2 = new ListNode(4);
        listNode2.next = listNode2_1;
        listNode2_1.next = listNode2_2;

        ListNode result = addTwoNumbers(listNode1, listNode2);

        System.out.println(result);
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode zeroHead = new ListNode(0);

        ListNode l1Pointer = l1;
        ListNode l2Pointer = l2;
        ListNode currentNode = zeroHead;

        int dozenCarrier = 0;
        while (l1Pointer != null || l2Pointer != null) {
            int l1PointerValue = (l1Pointer != null) ? l1Pointer.val : 0;
            int l2PointerValue = (l2Pointer != null) ? l2Pointer.val : 0;

            int sum = l1PointerValue + l2PointerValue + dozenCarrier;
            dozenCarrier = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;

            if (l1Pointer != null) {
                l1Pointer = l1Pointer.next;
            }

            if (l2Pointer != null) {
                l2Pointer = l2Pointer.next;
            }
        }

        if (dozenCarrier > 0) {
            currentNode.next = new ListNode(dozenCarrier);
        }

        return zeroHead.next;
    }
}
