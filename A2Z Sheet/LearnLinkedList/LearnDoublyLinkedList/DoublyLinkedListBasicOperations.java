/*
-----------------------------------------------
Doubly Linked List Basic Operations in Java
-----------------------------------------------

1. Insert Before Head
Time Complexity: O(1)
Space Complexity: O(1)

Adds a new node before the head of the doubly linked list.
If the list is empty, the new node becomes the head.
*/

class InsertBeforeHead {
    public ListNode insertBeforeHead(ListNode head, int data) {

        ListNode add = new ListNode(data);

        if (head == null) {
            return add;
        }

        add.next = head;
        head.prev = add;

        return add;
    }
}

/*
-----------------------------------------------
2. Delete Head
Time Complexity: O(1)
Space Complexity: O(1)

Deletes the first node of the doubly linked list.
Returns the new head after deletion.
*/

class DeleteHead {
    public ListNode deleteHead(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        head = head.next;
        head.prev = null;

        return head;
    }
}

/*
-----------------------------------------------
3. Insert Before Tail
Time Complexity: O(n)
Space Complexity: O(1)

Traverses to the last node and inserts a new node
just before the tail.
*/

class InsertBeforeTail {
    public ListNode insertBeforeTail(ListNode head, int data) {

        if (head == null) {
            return new ListNode(data);
        }

        if (head.next == null) {
            ListNode add = new ListNode(data);
            add.next = head;
            head.prev = add;
            return add;
        }

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        ListNode before = temp.prev;
        ListNode add = new ListNode(data);

        before.next = add;
        add.prev = before;
        add.next = temp;
        temp.prev = add;

        return head;
    }
}

/*
-----------------------------------------------
4. Delete Tail
Time Complexity: O(n)
Space Complexity: O(1)

Traverses to the last node and removes it from
the doubly linked list.
*/

class DeleteTail {
    public ListNode deleteTail(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        ListNode before = temp.prev;

        before.next = null;
        temp.prev = null;

        return head;
    }
}

/*
-----------------------------------------------
5. Insert Before Kth Node
Time Complexity: O(n)
Space Complexity: O(1)

Traverses to the kth node and inserts a new node
before it. If k is invalid, the original list
is returned unchanged.
*/

class InsertBeforeKthNode {
    public ListNode insertBeforeKthNode(ListNode head, int k, int data) {

        if (k == 1) {
            ListNode add = new ListNode(data);

            if (head != null) {
                add.next = head;
                head.prev = add;
            }

            return add;
        }

        ListNode temp = head;

        for (int i = 1; i < k && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            return head;
        }

        ListNode before = temp.prev;
        ListNode add = new ListNode(data);

        before.next = add;
        add.prev = before;
        add.next = temp;
        temp.prev = add;

        return head;
    }
}
