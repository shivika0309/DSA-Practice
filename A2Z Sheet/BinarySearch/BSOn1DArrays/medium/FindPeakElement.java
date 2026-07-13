/*
 * Find Peak Element (Binary Search)
 *
 * Approach:
 * - A peak element is greater than its adjacent elements.
 * - Compare mid with mid + 1:
 *   • If nums[mid] < nums[mid + 1], the peak must exist on the right,
 *     so move low = mid + 1.
 *   • Otherwise, the peak lies on the left (including mid),
 *     so move high = mid.
 * - Continue until low == high. That index is a valid peak.
 *
 * Pattern:
 * - Binary Search on Answer
 * - Use the slope (increasing/decreasing) to eliminate half of the search space.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int low=0;
        int high=nums.length-1;
       while(low<high){
        int mid=low+(high-low)/2;
        
        if(nums[mid]<nums[mid+1])
        low=mid+1;

        else 
        high=mid;
       }
       return low;
    }
}
