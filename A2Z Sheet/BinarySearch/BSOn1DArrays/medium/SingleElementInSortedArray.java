/*
Approach:
- Use Binary Search.
- Ensure mid is always even so that (mid, mid + 1) forms a valid pair.
- If the pair is valid, the single element lies on the right.
- Otherwise, the single element lies on the left (including mid).
- Continue until low == high.

Time Complexity: O(log n)
Space Complexity: O(1)
*/
class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(mid%2==1)
            mid--;
            if(nums[mid]==nums[mid+1]){
                low=mid+2;
            }
            else {
                high=mid;
            }
        }
        return nums[low];
    }
}
