/*
 * Approach:
 * - Perform Binary Search on the columns.
 * - For the middle column, find the row containing the maximum element.
 * - Since it is the maximum in its column, only the left and right neighbors
 *   need to be checked to determine if it is a peak.
 * - If the current element is greater than both neighbors, return its position.
 * - If the left neighbor is greater, search the left half of the columns.
 * - Otherwise, search the right half.
 *
 * Time Complexity: O(m * log n)
 *   - Finding the maximum in a column takes O(m).
 *   - Binary search is performed over n columns.
 *
 * Space Complexity: O(1)
 */
class FindAPeakElement2 {
    public int[] findPeakGrid(int[][] mat) {
       int m=mat.length;
       int n=mat[0].length;
       int low=0;
       int high=n-1;
       while(low<=high){
        int max=0;
        int mid=low+(high-low)/2;

        for(int i=0;i<m;i++){
            if(mat[i][mid]>mat[max][mid])
            max=i;
        }

        int left=mid-1>=0?mat[max][mid-1]:-1;
        int right=mid+1<n?mat[max][mid+1]:-1;
        if(mat[max][mid]>left && mat[max][mid]>right)
        return new int[] {max,mid};

        else if(mat[max][mid]<left)
        high=mid-1;

        else if(mat[max][mid]<right)
        low=mid+1;
       }
       return new int[] {-1,-1};
    }
}
