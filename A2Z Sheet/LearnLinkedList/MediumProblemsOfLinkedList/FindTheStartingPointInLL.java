/*
Algorithm:
1. Use Floyd's Cycle Detection Algorithm to find the meeting point of the slow and fast pointers.
2. If they never meet, there is no cycle, so return null.
3. Once they meet, move one pointer back to the head while keeping the other at the meeting point.
4. Move both pointers one step at a time.
5. The node where they meet again is the starting node of the cycle.

Intuition:
- Let:
    x = distance from head to the start of the cycle
    y = distance from the cycle start to the meeting point
    L = length of the cycle

- When slow and fast meet:
    Slow has traveled: x + y
    Fast has traveled: 2(x + y)

- Since fast has traveled exactly one or more extra full cycles:
    2(x + y) = x + y + kL
    => x + y = kL
    => x = kL - y

- This means:
    • One pointer at the head is x steps away from the cycle start.
    • The other pointer at the meeting point is also x steps away from the cycle start
      (it first covers the remaining L - y distance, then completes (k - 1) full cycles).

- Therefore, moving both pointers one step at a time makes them meet exactly at the
  starting node of the cycle.

Time Complexity: O(n)
Space Complexity: O(1)
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
public class FindTheStartingPointInLL{
    public ListNode detectCycle(ListNode head) {
             ListNode slow=head;
             ListNode fast=head;
             while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    slow=head;
                    while(slow!=fast){
                        slow=slow.next;
                        fast=fast.next;
                    }
                    return slow;
                }
             }
             return null;
    }
}
