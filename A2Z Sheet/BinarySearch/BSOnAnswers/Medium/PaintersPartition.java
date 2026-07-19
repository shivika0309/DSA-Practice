/*
Approach:
1. Binary Search on Answer:
   - The minimum possible time is the time taken to paint the largest board.
   - The maximum possible time is the total time to paint all boards.
   - For each mid, greedily assign consecutive boards to a painter until
     the time limit is exceeded, then assign the next painter.
   - Count the total painters required:
       • If painters required <= A, try a smaller maximum time.
       • Otherwise, increase the allowed maximum time.
   - Return the minimum time modulo 10000003.
   - Time: O(n * log(sum - max + 1)), Space: O(1)
*/
class PaintersPartition {
    public int paint(int A, int B, int[] C) {

        long low = Long.MIN_VALUE;
        long high = 0;

        for (int num : C) {
            low = Math.max(low, 1L * num * B);
            high += 1L * num * B;
        }

        while (low <= high) {
            long mid = low + (high - low) / 2;

            int painters = 0;
            long sum = 0;

            for (int num : C) {
                sum += 1L * num * B;

                if (sum > mid) {
                    painters++;
                    sum = 1L * num * B;
                }
            }

            painters++;

            if (painters > A)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return (int)(low % 10000003);
    }
}
