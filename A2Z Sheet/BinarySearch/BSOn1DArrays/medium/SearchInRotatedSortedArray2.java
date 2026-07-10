/*
SEARCH IN ROTATED SORTED ARRAY II (WITH DUPLICATES)

Idea:
1. Perform Binary Search.
2. Due to duplicates, it may not always be possible to determine
   which half is sorted.
3. If duplicates are present at both ends, shrink the search space.
4. Otherwise, identify the sorted half and continue like normal
   rotated binary search.

Logic:
- Find mid.
- If nums[mid] == target, return true.
- If nums[low] == nums[mid] && nums[mid] == nums[high]:
    -> Cannot determine the sorted half.
    -> Increment low and decrement high.
- Else if nums[mid] >= nums[low]:
    -> Left half is sorted.
    -> If target lies between nums[low] and nums[mid],
       search left (high = mid - 1).
    -> Otherwise search right (low = mid + 1).
- Else:
    -> Right half is sorted.
    -> If target lies between nums[mid] and nums[high],
       search right (low = mid + 1).
    -> Otherwise search left (high = mid - 1).

Key Points:
- Duplicates can make both halves appear sorted.
- When nums[low] == nums[mid] == nums[high], simply shrink the
  search space by moving both pointers inward.
- After removing duplicates, apply the normal rotated binary
  search logic.

Time Complexity:
Average Case : O(log n)
Worst Case   : O(n)   // when many duplicates force linear shrinking

Space Complexity:
O(1)
*/
class SearchInRotatedSortedArray2 {
    public boolean search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            return true;
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
            }

            else if(nums[mid]>=nums[low]){
                //left half is def sorted
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;
                    while(high>=0 && nums[high]==nums[mid])
                    high--;
                }
                else{
                    low=mid+1;
                    while(low<nums.length && nums[low]==nums[mid])
                    low++;
                }
            }
            else if(nums[mid]<nums[low]){
                //right half is def sorted
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                    while(low<nums.length && nums[low]==nums[mid])
                    low++;
                }
                else {
                high=mid-1;
                while(high>=0 && nums[high]==nums[mid])
                high--;
                }
            }
        }
        return false;
    }
}
