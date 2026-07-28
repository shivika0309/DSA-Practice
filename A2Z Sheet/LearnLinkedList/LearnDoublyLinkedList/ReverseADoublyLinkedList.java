/*
-----------------------------------------------
Reverse a Doubly Linked List
Time Complexity: O(n)
Space Complexity: O(1)

Traverses the doubly linked list and reverses it
by swapping the prev and next pointers of every node.
The last processed node becomes the new head of the list.
-----------------------------------------------
*/
/*
class ListNode {
    int data;
    ListNode prev, next;
    ListNode(int val) {
        this.data = val;
        this.prev = null;
        this.next = null;
    }
}
*/

class ReverseADoublyLinkedList {
    public ListNode reverseDLL(ListNode head) {
        // Your code goes here
        ListNode newHead=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;

            newHead=curr;
            
            curr=curr.prev;
           
        }
        return newHead;
    }
}
