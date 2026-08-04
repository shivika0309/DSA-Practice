/*
Approach:
- Use a HashMap to maintain a one-to-one mapping between each
  original node and its copied node.
- In the first traversal, create a copy of every node.
- In the second traversal, assign the 'next' and 'random'
  pointers of each copied node using the HashMap.
- This ensures a correct deep copy where no pointer references
  the original list.

Time Complexity: O(n)
Space Complexity: O(n)
*/

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if(head==null)
        return null;

        HashMap<Node,Node> map=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            map.put(temp,new Node(temp.val));
            temp=temp.next;
        }

        temp=head;
        while(temp!=null){
            Node copy=map.get(temp);
            copy.next=map.get(temp.next);
            copy.random=map.get(temp.random);
            temp=temp.next;
        }
        return map.get(head);
    }
}
