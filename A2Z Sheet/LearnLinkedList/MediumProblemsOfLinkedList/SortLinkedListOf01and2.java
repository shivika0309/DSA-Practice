// Approach:
// - Create three dummy nodes for 0s, 1s, and 2s.
// - Traverse the list once and detach each node.
// - Append each node to its respective list using tail pointers.
// - Connect the three lists while handling empty lists.
// - Return dummyZero.next as the head of the sorted list.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

class SortLinkedListOf01and2 {
    public ListNode sortList(ListNode head) {

        ListNode dummyZero = new ListNode(-1);
        ListNode dummyOne = new ListNode(-1);
        ListNode dummyTwo = new ListNode(-1);

        ListNode zero = dummyZero;
        ListNode one = dummyOne;
        ListNode two = dummyTwo;

        ListNode temp = head;

        while (temp != null) {

            ListNode front = temp.next;
            temp.next = null;

            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            }
            else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            }
            else {
                two.next = temp;
                two = two.next;
            }

            temp = front;
        }

        zero.next = (dummyOne.next != null) ? dummyOne.next : dummyTwo.next;
        one.next = dummyTwo.next;

        return dummyZero.next;
    }
}
