/*
Approach:
1. Use two pointers, fast and slow, both starting at the head.
2. Move the fast pointer n nodes ahead to maintain a gap of n nodes.
3. Move both pointers together until the fast pointer reaches the end.
4. The slow pointer will be just before the node to be removed.
5. Skip the target node by updating the next pointer.

Time Complexity: O(n)
- Traverse the linked list only once.

Space Complexity: O(1)
- Uses only two pointers without any extra data structure.
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


  
class RemoveNthNodeFromEndOfLinkedList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
//standard 2 pass soln
        // int count = 0;
        // ListNode temp = head;

        // while (temp != null) {
        //     count++;
        //     temp = temp.next;
        // }

        // if (n == count)
        //     return head.next;

        // temp = head;

        // for (int i = 1; i < count - n; i++) {
        //     temp = temp.next;
        // }

        // temp.next = temp.next.next;

        // return head;

        ListNode fast=head;
        ListNode slow=head;
        for( int i=0;i<n;i++){
            fast=fast.next;
        }
        
        while( fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

    if(fast==null){
        return head=head.next;
    }

    slow.next=slow.next.next;
    return head;
      // haretortoise method 
    }
}
