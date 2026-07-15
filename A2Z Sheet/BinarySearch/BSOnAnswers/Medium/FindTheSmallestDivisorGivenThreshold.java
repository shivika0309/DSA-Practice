/*
 * Problem: Find the Smallest Divisor Given a Threshold (Binary Search on Answer)
 *
 * Approach:
 * - The smallest possible divisor is 1, while the largest possible divisor
 *   is the maximum element in the array.
 * - Use Binary Search on this range to find the minimum valid divisor.
 * - For each candidate divisor (mid), compute the sum of
 *   ceil(nums[i] / mid) for all elements using integer arithmetic:
 *      (num + mid - 1) / mid
 * - If the sum exceeds the threshold, the divisor is too small,
 *   so search the right half.
 * - Otherwise, search the left half to find a smaller valid divisor.
 *
 * Key Insight:
 * - As the divisor increases, the computed sum decreases.
 * - This creates a monotonic (False → True) search space,
 *   making Binary Search applicable.
 *
 * Time Complexity: O(n * log(maxElement))
 * Space Complexity: O(1)
 */

// Pattern: Binary Search on Answer (Minimum Feasible Value)
class FindTheSmallestDivisorGivenThreshold {
    public int smallestDivisor(int[] nums, int threshold) {
       
       int high=Integer.MIN_VALUE;
       for(int i:nums){
        high=Math.max(i,high);
       }

       int low=1;
       while(low<high){
        int mid=low+(high-low)/2;
        int sum=0;
        for(int num:nums){
        sum+=(num+mid-1)/mid;
        }
        if(sum>threshold)
        low=mid+1;
        else
        high=mid;
       }
       return high;
    }
}
