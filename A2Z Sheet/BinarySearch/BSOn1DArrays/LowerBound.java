// LOWER BOUND (Binary Search)
//
// Finds the first index where arr[i] >= target.
//
// Cases:
// 1. Target exists -> returns its first occurrence.
// 2. Target doesn't exist -> returns the index where it should be inserted
//    to keep the array sorted.
// 3. If all elements are smaller than the target -> returns arr.length.
//
// Logic:
// - If arr[mid] >= target:
//     -> mid can be the answer.
//     -> Store it and search on the left for an earlier valid index.
// - If arr[mid] < target:
//     -> Lower bound must be on the right.
//
// Time Complexity: O(log n)
// Space Complexity: O(1)
class LowerBound {
    public int lowerBound(int[] nums, int x) {
        int low=0;
        int high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=low+(high-low)/2;
        
        if(nums[mid]>=x){
            ans=mid;
            high=mid-1;
        }
        if(nums[mid]<x){
            low=mid+1;
        }
        }
        return ans;
     }
}
