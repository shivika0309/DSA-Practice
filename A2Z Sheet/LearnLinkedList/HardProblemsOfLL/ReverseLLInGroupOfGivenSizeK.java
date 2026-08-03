/*
Approach:

We reverse the linked list in groups of k nodes without breaking the list.

Pointers used:
1. start    -> First node of the current group.
2. end      -> Last node of the current group.
3. previous -> Tail of the previously reversed group.

Algorithm:

1. Find the first group of k nodes.
   - 'start' points to the first node.
   - Move 'end' to the kth node.
   - After reversing this group, 'end' becomes the new head of the entire list.

2. Reverse the group.
   - The reverse() function reverses the nodes from 'start' to 'end' (inclusive).
   - Instead of initializing prev as null, initialize it as end.next.
     This automatically connects the tail of the reversed group to the
     beginning of the next group, so no extra connection is required later.

3. Store:
   previous = start;
   Since after reversal, the original start becomes the tail of the reversed group.
   It will be used to connect the next reversed group.

4. Move to the next group.
   start = start.next;
   Since 'start' is now the tail of the reversed group and already points to
   the next group's first node, this moves us to the beginning of the next group.

5. Continue while start != null.
   - The loop condition only checks whether another group can start.
   - It does NOT guarantee that k nodes are available.

6. For every new group:
   - Move 'end' k-1 steps ahead.
   - If end becomes null before completing k nodes, the remaining nodes are
     fewer than k, so leave them unchanged and stop.

7. Reverse the current group and reconnect it.
   previous.next = end;
   previous = start;
   start = start.next;

Reverse Function:

- prev is initialized as end.next.
- stop is also end.next.
- Reverse every node from start up to (but not including) stop.
- Since stop = end.next, the loop naturally reverses the end node as well.
- The tail of the reversed group is automatically connected to the next group
  because prev initially points to end.next.

Time Complexity: O(n)
Each node is visited a constant number of times.

Space Complexity: O(1)
Only a few pointers are used.
*/



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class ReverseLLInGroupOfGivenSizeK {

    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1)
            return head;

        ListNode previous = null;
        ListNode start = head;
        ListNode end = head;

        // Find first group
        for (int i = 1; i < k; i++) {
            end = end.next;
        }

        ListNode newHead = end;

        reverse(start, end);
        previous = start;
        start = start.next;

        while (start != null) {

            end = start;

            for (int i = 1; i < k && end != null; i++) {
                end = end.next;
            }

            if (end == null)
                break;

            reverse(start, end);

            previous.next = end;
            previous = start;
            start = start.next;
        }

        return newHead;
    }

    private void reverse(ListNode start, ListNode end) {

        ListNode curr = start;
        ListNode prev = end.next;
        ListNode stop = end.next;

        while (curr != stop) {
            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
    }
}
