/*
SEARCH IN ROTATED SORTED ARRAY (WITHOUT DUPLICATES)

Idea:
1. Perform Binary Search.
2. In every iteration, at least one half (left or right) is always sorted.
3. Identify the sorted half.
4. Check if the target lies within that sorted half.
5. If yes, search that half; otherwise, search the other half.

Logic:
- Find mid.
- If nums[mid] == target, return mid.
- If nums[mid] >= nums[low]:
    -> Left half is sorted.
    -> If target lies between nums[low] and nums[mid],
       move to left half (high = mid - 1).
    -> Otherwise search right half (low = mid + 1).
- Else:
    -> Right half is sorted.
    -> If target lies between nums[mid] and nums[high],
       move to right half (low = mid + 1).
    -> Otherwise search left half (high = mid - 1).

Key Points:
- At least one half is always sorted.
- Equality (>=) is used to correctly handle the case when low == mid
  (a single-element left half is also sorted).
- Since nums[mid] == target is checked first, later comparisons use
  target < nums[mid] and target > nums[mid].

Time Complexity:
O(log n)

Space Complexity:
O(1)
*/
class SearchInRotatedSortedArray1 {
    public int search(int[] nums, int target) {
        // int left=0;
        // int right=nums.length-1;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>nums[(i+1)%nums.length]){
        //     left=(i+1)%nums.length;
        //     right=i;
        //     break;
        //     }
        // }
        // if(left>right){
        //     int low=0;
        //     int high=right;
        //     while(low<=high){
        //         int mid=low+(high-low)/2;
        //         if(nums[mid]==target)
        //         return mid;
        //         else if(nums[mid]<target)
        //         low=mid+1;
        //         else
        //         high=mid-1;
        //     }
        
        //      low=left;
        //      high=nums.length-1;
        
        //      while(low<=high){
        //         int mid=low+(high-low)/2;
        //         if(nums[mid]==target)
        //         return mid;
        //         else if(nums[mid]<target)
        //         low=mid+1;
        //         else
        //         high=mid-1;
        //     }
        //     }
        //     else{
        //         int low=left;
        //         int high=right;
        //     while(low<=high){
        //         int mid=low+(high-low)/2;
        //         if(nums[mid]==target)
        //         return mid;
        //         else if(target<nums[mid])
        //         high=mid-1;
        //         else 
        //         low=mid+1;
        //     }
        //     }
        //     return -1;

       int low=0;
       int high=nums.length-1;
       while(low<=high){
        int mid=low+(high-low)/2;
        
        if(nums[mid]==target)
        return mid;

        if(nums[mid]>=nums[low]){
            //array at left is def sorted
            if(target>=nums[low] && target<nums[mid]){
                high=mid-1;
            }
            else 
            low=mid+1;
        }
        else{
            //array at right is def sorted
            if(target>nums[mid] && target<=nums[high]){
                low=mid+1;
            }
            else
            high=mid-1;
        }
       }
       return -1;
        }
    }
