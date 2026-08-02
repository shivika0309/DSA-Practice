/*
Approach:
1. Traverse the sorted doubly linked list using a current pointer.
2. For each node, move a second pointer forward until a node with a different value is found.
3. Link the current node directly to the next distinct node, thereby skipping all duplicate nodes.
4. If a next distinct node exists, update its previous pointer to maintain the doubly linked list.
5. Move the current pointer to the next distinct node and repeat until the end of the list.

Time Complexity: O(n)
- Each node is visited at most once while skipping duplicates.

Space Complexity: O(1)
- Only a constant amount of extra space is used.
*/
/*Definition of doubly linked list:
class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}
 */

class Solution {
    public ListNode removeDuplicates(ListNode head) {

        if (head == null) return null;

        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;

            // Skip all duplicate nodes
            while (next != null && curr.val == next.val) {
                next = next.next;
            }

            // Connect current node to the next distinct node
            curr.next = next;

            if (next != null) {
                next.prev = curr;
            }

            // Move to the next distinct node
            curr = next;
        }

        return head;
    }
}
