/*
-----------------------------------------------
Middle of the Linked List (Tortoise and Hare Algorithm)
Time Complexity: O(n)
Space Complexity: O(1)

Uses two pointers: a slow pointer and a fast pointer.
The slow pointer moves one node at a time, while the
fast pointer moves two nodes at a time. When the fast
pointer reaches the end of the list, the slow pointer
points to the middle node.
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
class MiddleOFALinkedList{
    public ListNode middleNode(ListNode head) {
      //brute force
        // int count=0;
        // ListNode temp=head;
        // while(temp!=null){
        //     count++;
        //     temp=temp.next;
        // }

        // int mid=0;
        // mid=(count/2)+1;
        // ListNode curr=head;
        // for(int i=1;i<mid;i++){
        //     curr=curr.next;
        // }
        // return curr;

        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
