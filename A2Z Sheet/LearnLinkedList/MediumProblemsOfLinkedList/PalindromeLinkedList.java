/*
Approach:
1. Use slow and fast pointers to find the end of the first half of the linked list.
2. Reverse the second half of the list in-place.
3. Compare the first half with the reversed second half node by node.
4. If all corresponding values match, the linked list is a palindrome; otherwise, it is not.

Time Complexity: O(n)
- One traversal to find the middle.
- One traversal to reverse the second half.
- One traversal to compare both halves.

Space Complexity: O(1)
- The reversal is done in-place without using any extra data structure.
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
class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode curr=slow.next;
        ListNode front=null;
        ListNode prev=null;
        while(curr!=null){
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        slow.next=prev;
        slow=slow.next;
        while(slow!=null){
            if(slow.val!=head.val)
            return false;

            slow=slow.next;
            head=head.next;
        }
        return true;
    }
}
