/*
Approach:
1. Binary Search on Answer:
   - The minimum possible largest sum is the maximum element in the array.
   - The maximum possible largest sum is the sum of all elements.
   - For each mid, greedily form subarrays while keeping their sum <= mid.
   - Count the number of subarrays required:
       • If subarrays required <= k, try a smaller largest sum.
       • Otherwise, increase the allowed largest sum.
   - Time: O(n * log(sum - max + 1)), Space: O(1)
*/
class SplitArrayLargestSum{
    public int splitArray(int[] nums, int k) {

        int low=Integer.MIN_VALUE;
        int high=0;
        for(int num:nums){
            low=Math.max(low,num);
            high+=num;
        }

        while(low<=high){
            int mid=low+(high-low)/2;
            int sum=0;
            int count=0;
            for(int num:nums){
                sum+=num;
                if(sum>mid){
                    count++;
                    sum=num;
                }
            }
            count++;
            if(count>k)
            low=mid+1;
            else 
            high=mid-1;
        }
        return low;
    }
}
