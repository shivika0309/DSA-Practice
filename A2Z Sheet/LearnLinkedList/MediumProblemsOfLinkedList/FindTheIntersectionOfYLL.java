// Approach:
// - Find the length of both linked lists.
// - Move the pointer of the longer list ahead by the difference in lengths.
// - Traverse both lists simultaneously.
// - The first node where both pointers are equal is the intersection node.
//
// Time Complexity: O(n + m)
// Space Complexity: O(1)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class FindTheIntersectionOfYLL{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // better approach


//         HashSet<ListNode> set=new HashSet<>();
//         while(headA!=null){
//             set.add(headA);
//             headA=headA.next;
//         }

//         while(headB!=null){
//             if(set.contains(headB)){
//                 return headB;
//             }
//             headB=headB.next;
//         }
// return null;


//optimal approach using 2 pointers
ListNode tempA=headA;
ListNode tempB=headB;
int countA=0;
int countB=0;
while(tempA!=null){
    countA++;
    tempA=tempA.next;
}

while(tempB!=null){
    countB++;
    tempB=tempB.next;
}

tempA=headA;
tempB=headB;
if(countA>countB){
    int diff=countA-countB;
    for(int i=0;i<diff;i++){
        tempA=tempA.next;
    }
}

else if(countB>countA){
    int diff=countB-countA;
    for(int i=0;i<diff;i++){
        tempB=tempB.next;
    }
}

while(tempA!=null && tempB!=null){
    if(tempA==tempB)
    return tempA;

    tempA=tempA.next;
    tempB=tempB.next;
}
return null;
    }
}
