/*
Approach:
1. Since every row is sorted, the median lies between the smallest and largest
   elements of the matrix.
2. Apply Binary Search on the answer (value range).
3. For each guessed value (mid), count how many elements are <= mid by performing
   Binary Search on every row.
4. If the count is greater than half of the total elements, the median lies on
   the left side; otherwise, search on the right.
5. The first value satisfying the condition is the median.

Time Complexity: O(m * log(n) * log(max - min))
Space Complexity: O(1)
*/
class MatrixMedian {
    public int findMedian(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
      
        for (int i = 0; i < m; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][n - 1]);
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int cnt = 0;

            // Count elements <= mid
            for (int i = 0; i < m; i++) {

                int l = 0;
                int h = n - 1;
                int ans = -1;

                while (l <= h) {

                    int md = l + (h - l) / 2;

                    if (matrix[i][md] > mid) {
                        h = md - 1;
                    } else {
                        ans=md;
                        l = md + 1;
                    }
                }

                cnt += ans+1;
            }

            if (cnt > (m * n) / 2)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low;
    }
}
