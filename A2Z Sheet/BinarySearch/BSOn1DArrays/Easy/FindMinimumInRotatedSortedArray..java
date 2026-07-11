/*Problem: Find Minimum in Rotated Sorted Array
Approach:
- Use Binary Search.
- Identify the sorted half in each iteration.
- Update the minimum with the first element of the sorted half.
- Search in the unsorted half.
Time: O(log n)
Space: O(1)*/
class FindMiniumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(low<=high){
            if(nums[low]<=nums[high]){
                min=Math.min(min,nums[low]);
            }
            
            int mid=low+(high-low)/2;
            if(nums[low]<=nums[mid]){
                //left side is sorted
                min=Math.min(min,nums[low]);
                low=mid+1;
            }
            else{
                //right side is sorted
                min=Math.min(min,nums[mid]);
                high=mid-1;
            }
        }
        return min;
    }
}
