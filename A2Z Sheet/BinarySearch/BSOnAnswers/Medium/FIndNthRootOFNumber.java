/*
 * Find Nth Root of a Number (Binary Search)
 *
 * Approach:
 * - Search in the range [1, M] for an integer whose Nth power equals M.
 * - Compute mid^N carefully (with early stopping to avoid overflow):
 *   • If mid^N == M, return mid.
 *   • If mid^N < M, search on the right.
 *   • Otherwise, search on the left.
 * - If no such integer exists, return -1.
 *
 * Pattern:
 * - Binary Search on Answer
 * - Compare the computed Nth power of mid with the target to eliminate half of the search space.
 *
 * Time Complexity: O(log M × N)
 * Space Complexity: O(1)
 */
class FIndNthRootOFNumber {
    public int NthRoot(int N, int M) {
       int low=1;
       int high=M;
       while(low<=high){

        int mid=low+(high-low)/2;

        int val=check(mid,N,M);
        if(val==0)
        low=mid+1;

        else if (val==2)
        high=mid-1;

        else
        return mid;
       }
       return -1;
    }

    private int check(int mid,int N,int M){
        long ans=1;

        for(int i=1;i<=N;i++){
            ans*=mid;

            if(ans>M)
            return 2;
        }
        if(ans==M)
        return 1;

        else 
        return 0;
    }
}
