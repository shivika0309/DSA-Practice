/*
Approach:
1. Traverse the doubly linked list using a current pointer.
2. For each node, store its previous and next pointers before making any changes.
3. If the current node's value matches the target:
   - Update the head if the current node is the first node.
   - Connect the previous node to the next node.
   - Connect the next node back to the previous node.
4. Move to the saved next node and continue until the end of the list.
5. Return the updated head.

Time Complexity: O(n)
- Each node is visited exactly once.

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

class DeleteAllOccurancesOfAKeyInDLL{
    public ListNode deleteAllOccurrences(ListNode head, int target) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=head;
        
        while(curr!=null){
            next=curr.next;
            prev=curr.prev;

            if(curr.val==target){
                if(curr==head){
                    head=head.next;
                }
                if(next!=null){
                next.prev=curr.prev;
                }
                if(prev!=null){
                prev.next=curr.next;  
                }      
            }

            curr=curr.next;
        }

        return head;
    }
}
