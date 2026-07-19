/*
Approach:
1. Binary Search on Answer:
   - The minimum possible answer is the maximum pages in a single book.
   - The maximum possible answer is the sum of all pages.
   - For each mid, greedily allocate consecutive books to a student until
     the page limit is exceeded, then assign the next student.
   - Count the total students required:
       • If students required <= m, try a smaller maximum.
       • Otherwise, increase the allowed maximum.
   - Time: O(n * log(sum - max + 1)), Space: O(1)
*/
class Solution {
    public int findPages(int[] nums, int m) {

        // Impossible if students are more than books
        if (m > nums.length)
            return -1;

        int max = Integer.MIN_VALUE;
        int numssum = 0;

        for (int num : nums) {
            max = Math.max(max, num);
            numssum += num;
        }

        int low = max;
        int high = numssum;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int totalStudents = 0;
            int sum = 0;

            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];

                if (sum > mid) {
                    totalStudents++;
                    sum = nums[i];
                }
            }

            // Count the last student
            totalStudents++;

            if (totalStudents <= m)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low;
    }
}
