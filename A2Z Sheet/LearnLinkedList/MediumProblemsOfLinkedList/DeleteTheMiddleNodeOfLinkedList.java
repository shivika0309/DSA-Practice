/*
Approach:
1. Use slow and fast pointers to find the middle node of the linked list.
2. Maintain a previous pointer to keep track of the node before the middle.
3. Move fast by two nodes and slow by one node until fast reaches the end.
4. Delete the middle node by linking the previous node directly to the node after the middle.

Time Complexity: O(n)
- Traverse the linked list once.

Space Complexity: O(1)
- Uses only a few pointers without any extra data structure.
*/


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

class DeleteTheMiddleNodeOfLinkedList {
    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;

        return head;
    }
}
