/*
Approach:
1. Reverse the linked list so that the least significant digit comes first.
2. Traverse the reversed list:
   - If the current digit is less than 9, increment it by 1 and stop.
   - If the current digit is 9, change it to 0 and continue carrying.
   - If all digits are 9, append a new node with value 1 at the end.
3. Reverse the list again to restore the original order and return the result.

Time Complexity: O(n)
- One traversal to reverse the list.
- One traversal to add one.
- One traversal to reverse the list back.

Space Complexity: O(1)
- No extra data structures are used.
*/

/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class AddOneToANoRepresentedByLL {
    public ListNode addOne(ListNode head) {
            ListNode revHead=reverse(head);
            ListNode curr=revHead;

            while(curr!=null){
                if(curr.val<9){
                    curr.val=curr.val+1;
                    return reverse(revHead);
                }

                 curr.val=0;

                if(curr.next==null){
                    ListNode add=new ListNode(1);
                    curr.next=add;
                    return reverse(revHead);
                }

                curr=curr.next;
            }
            return reverse(revHead);
        }
    
    
    private ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode front=null;

        while(curr!=null){
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }

        return prev;
    }
}
