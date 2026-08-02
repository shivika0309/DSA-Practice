/*
Approach:
1. Create a dummy node to simplify building the answer linked list.
2. Traverse both linked lists simultaneously:
   - Add the corresponding digits along with the carry.
   - Create a new node with (sum % 10) and append it to the answer list.
   - Update the carry as (sum / 10).
3. If one list is longer, continue processing its remaining nodes along with the carry.
4. After traversing both lists, if a carry still remains, add it as a new node.
5. Return the answer list by skipping the dummy node.

Time Complexity: O(max(n, m))
- Each node of both linked lists is visited exactly once.

Space Complexity: O(max(n, m))
- A new linked list is created to store the result.
- (Auxiliary space excluding the output list is O(1).)
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

class AddTwoNosInLinkedList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
       ListNode ansHead=new ListNode(-1);
       ListNode ans=ansHead;
       int carry =0;

       while(l1!=null && l2!=null){

            int add=carry+l1.val+l2.val;
            carry=add/10;
            ans.next=new ListNode(add%10);
            ans=ans.next;

            l1=l1.next;
            l2=l2.next;
       }

       while(l1!=null){
        int add=carry+l1.val;
        ans.next=new ListNode(add%10);
        ans=ans.next;
        carry=add/10;

        l1=l1.next;
       }

       while(l2!=null){
        int add=carry+l2.val;
        ans.next=new ListNode(add%10);
        ans=ans.next;
        carry=add/10;

        l2=l2.next;
       }

       if(carry!=0){
        ans.next=new ListNode(carry);
       }
       return ansHead.next;
    }
}
