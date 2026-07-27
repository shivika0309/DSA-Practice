
// class ListNode{
//     public int data;
//     public ListNode next;
//     ListNode() { data = 0; next = null; }
//     ListNode(int x) { data = x; next = null; }
//     ListNode(int x, ListNode next) { data = x; this.next = next; }
// }


class InsertionAtTheHeadOfLinkedList {
    public ListNode insertAtHead(ListNode head, int X) {
        ListNode temp=new ListNode(X);
        temp.next=head;
        head=temp;
         return head;
    }  
}
