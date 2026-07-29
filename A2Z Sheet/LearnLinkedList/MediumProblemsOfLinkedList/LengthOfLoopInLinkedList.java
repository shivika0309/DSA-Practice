/*
Mistake I Made:
- I initially counted the number of iterations until slow and fast met, assuming it would always
  be equal to the length of the cycle.
- This is incorrect because Floyd's Algorithm only guarantees that the pointers will meet
  somewhere inside the cycle, not after exactly one complete loop.
- The slow pointer may travel multiple cycle lengths before the first meeting
  (i.e., L + D = k * C, where k >= 1).
- Therefore, the number of steps taken until the meeting is not necessarily the cycle length.
- The correct approach is to start from the meeting point and traverse the cycle once,
  counting the nodes until reaching the same node again.
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

 class LengthOfLoopInLinkedList{
     public int findLengthOfLoop(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int count=1;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=slow.next;
                while(slow!=fast){
                count++;
                slow=slow.next;
                }
                return count;
            }
        }
        return 0;
     }
 }
