/*
Approach:
1. Since the doubly linked list is sorted, use the two-pointer technique.
2. Place one pointer at the head and the other at the tail of the list.
3. Continue while the pointers have not met or crossed:
   - head != tail      -> Handles odd-length lists (stop when both pointers meet).
   - head.prev != tail -> Handles even-length lists (stop when the pointers cross).
4. Calculate the sum of the two pointer values:
   - If the sum equals the target, store the pair and move both pointers inward.
   - If the sum is smaller than the target, move the left pointer forward.
   - If the sum is greater than the target, move the right pointer backward.
5. Return the list of all valid pairs.

Time Complexity: O(n)
- One traversal to find the tail and one traversal using two pointers.

Space Complexity: O(1)
- Constant extra space is used (excluding the output list).
*/
/*
class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
*/

class FindPairsWithGivenSumInDDL{
    public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        if (head == null) {
            return ans;
        }

        // Find the tail of the doubly linked list
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        // Two-pointer approach
        while (head != tail && head.prev != tail) {

            int sum = head.val + tail.val;

            if (sum == target) {
                List<Integer> pair = new ArrayList<>();
                pair.add(head.val);
                pair.add(tail.val);
                ans.add(pair);

                head = head.next;
                tail = tail.prev;
            }
            else if (sum < target) {
                head = head.next;
            }
            else {
                tail = tail.prev;
            }
        }

        return ans;
    }
}
