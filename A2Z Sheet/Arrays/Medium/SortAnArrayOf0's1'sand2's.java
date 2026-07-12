// Pattern: Dutch National Flag (Three Pointers)
//
// Idea:
// - Keep three pointers: low, mid, and high.
// - [0 ... low-1]   -> 0s
// - [low ... mid-1] -> 1s
// - [mid ... high]  -> Unprocessed
// - [high+1 ... n-1]-> 2s
//
// Rules:
// - nums[mid] == 0 -> swap(low, mid), low++, mid++
// - nums[mid] == 1 -> mid++
// - nums[mid] == 2 -> swap(mid, high), high-- (don't move mid)
//
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.Arrays;
class SortAnArrayOf0's1'sand2's {
   public void sortColors(int[] nums){
         int low=0,mid=0,high=nums.length-1;
         while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
         }
 }
}
//Dutch National Flag Algo
