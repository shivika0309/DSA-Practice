/*
Approach:
- Use recursion with two pointers: prev and curr.
- Save the next node (front) before reversing the current link.
- Reverse the current node by pointing curr.next to prev.
- Recursively process the remaining list using (curr, front).
- When curr becomes null, prev points to the new head of the reversed list.

Time Complexity: O(n)
- Each node is visited exactly once.

Space Complexity: O(n)
- Recursive call stack stores one call for each node.
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
class ReverseALinkedListRecurssive {
    public ListNode reverseList(ListNode head) {
       
        return reverse(head,null);
    }
    
    private ListNode reverse(ListNode curr, ListNode prev){
        if(curr==null){
            return prev;
        }

        ListNode front=curr.next;
        curr.next=prev;
       return reverse(front,curr);
    }
}
