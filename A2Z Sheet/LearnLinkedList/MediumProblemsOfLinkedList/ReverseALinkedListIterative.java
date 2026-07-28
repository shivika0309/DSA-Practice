/*
-----------------------------------------------
Reverse a Singly Linked List
Time Complexity: O(n)
Space Complexity: O(1)

Traverses the linked list once and reverses the
direction of each link using three pointers:
prev, curr, and front. The prev pointer keeps
track of the reversed part, curr processes the
current node, and front stores the next node
before reversing the link. At the end, prev
points to the new head of the reversed list.
-----------------------------------------------
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
class ReverseALinkedListIterative {
    public ListNode reverseList(ListNode head) {
        if(head==null)
        return head; 

        ListNode front=null;
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
}
