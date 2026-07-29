/*
Algorithm:
1. Use Floyd's Cycle Detection Algorithm to find the meeting point of slow and fast.
2. If they never meet, return null (no cycle).
3. Move the slow pointer back to the head while keeping the fast pointer at the meeting point.
4. Move both pointers one step at a time.
5. The node where they meet is the starting node of the cycle.

Intuition:
- Suppose the distance from the head to the start of the cycle is L.
- By the time slow reaches the start of the cycle, fast has also reached there and has
  already traveled an extra L nodes inside the cycle.
- Let:
    C = length of the cycle
    D = distance from the start of the cycle to the meeting point.
- The extra L distance covered by fast is made up of:
      one full cycle + D
  Hence,
      C = L + D
- When slow and fast meet, the meeting point is D nodes ahead of the cycle's start.
  So, the remaining distance from the meeting point back to the cycle's start is:
      C - D = L
- Therefore:
    • Slow at the head is L nodes away from the cycle's start.
    • Fast at the meeting point is also L nodes away from the cycle's start.
- Moving both pointers one step at a time makes them meet exactly at the starting
  node of the cycle.

Time Complexity: O(n)
Space Complexity: O(1)
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
