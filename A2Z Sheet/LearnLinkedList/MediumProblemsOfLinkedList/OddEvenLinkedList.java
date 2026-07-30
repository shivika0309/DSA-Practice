/*
Approach:
1. Maintain two pointers for odd and even positioned nodes.
2. Store the head of the even list before rearranging.
3. Traverse the list and connect all odd nodes together, then all even nodes together.
4. Finally, attach the even list after the last odd node.

Time Complexity: O(n)
- Traverse the linked list once.

Space Complexity: O(1)
- Rearranges the existing nodes in-place without using any extra data structure.
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

class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {

            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}
