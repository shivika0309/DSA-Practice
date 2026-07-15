/*
 * Problem: Capacity to Ship Packages Within D Days (Binary Search on Answer)
 *
 * Approach:
 * - The minimum possible ship capacity is the maximum package weight,
 *   while the maximum possible capacity is the sum of all package weights.
 * - Use Binary Search on this range to find the minimum valid capacity.
 * - For each candidate capacity (mid), simulate loading the packages
 *   in order while ensuring the capacity is not exceeded.
 * - Count the number of days required:
 *      - If the required days exceed the given limit, the capacity is
 *        too small, so search the right half.
 *      - Otherwise, search the left half to find a smaller valid capacity.
 *
 * Key Insight:
 * - As the ship's capacity increases, the number of days required
 *   decreases or remains the same.
 * - This creates a monotonic (False → True) search space,
 *   making Binary Search applicable.
 *
 * Time Complexity: O(n * log(totalWeight - maxWeight + 1))
 * Space Complexity: O(1)
 */

// Pattern: Binary Search on Answer (Minimum Feasible Value)
class CapacityToShipPackagesWithinDDays {
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i:weights){
            low=Math.max(low,i);
            high+=i;
        }
        while(low<high){
            int mid=low+(high-low)/2;
            int count=0;
            int sum=0;
            for(int i:weights){
                sum+=i;
                if(sum>mid){
                    count++;
                    sum=0;
                    sum+=i;
                }
            }
            count++;
            if(count>days)
            low=mid+1;
            else
            high=mid;
        }
        return high;
    }
}
