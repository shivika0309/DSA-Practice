/*
 * Find Square Root (Binary Search)
 *
 * Approach:
 * - Search for the largest integer whose square is less than or equal to the given number.
 * - Calculate mid and compare mid * mid with the target:
 *   • If mid² <= n, store mid as a possible answer and search on the right.
 *   • Otherwise, search on the left.
 * - The stored answer is the integer square root (floor value).
 *
 * Pattern:
 * - Binary Search on Answer
 * - Keep track of the last valid answer while searching.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
class FindSqrtOFNumber {
    public int floorSqrt(int n) {
      int low=1;
      int high=n;
      long val=0L;
      int ans=0;
      while(low<=high){
        int mid=low+(high-low)/2;
        val=(long)mid*mid;
       
        if(val<=n){
            
            low=mid+1;
        }

        else {
            high=mid-1;
        }
      }
      return high;
    }
}
