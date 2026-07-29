/*
Approach:
- Use Floyd's Cycle Detection (Tortoise and Hare) algorithm.
- Maintain two pointers: slow moves one step, fast moves two steps.
- If a cycle exists, the fast pointer will eventually meet the slow pointer.
- If the fast pointer or its next becomes null, the list has no cycle.

Time Complexity: O(n)
- Each pointer traverses the list at most once.

Space Complexity: O(1)
- Uses only two pointers without any extra space.
*/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
            return true;
            
        }
        return false;
    }
}
