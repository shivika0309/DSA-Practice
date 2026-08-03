/*
Approach:

1. Traverse the list once to calculate its length (count).

2. Since rotating the list by its length gives the same list,
   reduce k using:
        k = k % count

3. The new tail of the rotated list will be the
   (count - k)th node.
   Traverse to this node using the 'previous' pointer.

4. The node after 'previous' becomes the new head.

5. Traverse to the last node of the list and connect it
   to the original head to form a circular list.

6. Break the circle by setting:
        previous.next = null

Mistake I made:

Initially, I computed:
        k = k % count
before checking whether the list was empty.

If head == null:
    count = 0

Then:
    k % count
becomes:
    k % 0

which throws an ArithmeticException (/ by zero)
before the null check is even executed.

Correct order:

1. Check:
        if(head == null || head.next == null || k == 0)
            return head;

2. Calculate the length.

3. Compute:
        k %= count;

4. If k == 0, return head because rotating by a multiple
   of the list length does not change the list.

Time Complexity: O(n)
Space Complexity: O(1)
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
class RotateList {
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || head.next==null || k==0){
            return head;
        }

        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }

        k=k%count;

        if(k==0)
        return head;

        ListNode previous=head;
        for(int i=1;i<count-k;i++){
            previous=previous.next;
        }

        ListNode curr=previous.next;
        ListNode newHead=curr;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=head;
        previous.next=null;
        return newHead;
    }
}
