/*
 * Introduction to Singly Linked List
 *
 * This program demonstrates the basic operations on a singly linked list:
 * 1. Convert an array into a linked list.
 * 2. Traverse and print the linked list.
 * 3. Find the length of the linked list.
 * 4. Search for an element in the linked list.
 *
 * Time Complexity:
 * - Conversion : O(n)
 * - Traversal  : O(n)
 * - Length     : O(n)
 * - Search     : O(n)
 *
 * Space Complexity:
 * - O(n) for storing the linked list.
 * - O(1) extra space.
 */

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class IntroductionToSinglyLinkedList {

    // Converts an array into a singly linked list
    static Node convertArr2LL(int[] arr) {
        if (arr.length == 0)
            return null;

        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    // Traverses and prints the linked list
    static void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // Returns the number of nodes in the linked list
    static int length(Node head) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // Searches for a given key in the linked list
    static boolean search(Node head, int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key)
                return true;

            temp = temp.next;
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 7};

        Node head = convertArr2LL(arr);

        System.out.print("Linked List: ");
        printLL(head);

        System.out.println("Length: " + length(head));

        System.out.println("Is 8 present? " + search(head, 8));

        System.out.println("Is 10 present? " + search(head, 10));
    }
}
