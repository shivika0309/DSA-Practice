// Pattern: HashMap / Two Pointers
//
// HashMap (Unsorted Array):
// - Traverse once while storing (value -> index) in a HashMap.
// - For each element, check if (target - current) already exists.
// - If yes, we've found the pair; otherwise, store the current element.
//
// Two Pointers (Sorted Array):
// - Keep one pointer at the start and one at the end.
// - If sum < target, move left pointer right.
// - If sum > target, move right pointer left.
// - If sum == target, return the answer.
//
// Time Complexity:
// - HashMap: O(n), Space: O(n)
// - Two Pointers: O(n), Space: O(1)
import java.util.Arrays;

    class TwoSum {
public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> set=new HashMap<>();
    int ans[]=new int[2];

for(int i=0;i<nums.length;i++){
      if(set.containsKey(target-nums[i])){
           ans[0]=set.get(target-nums[i]);
           ans[1]=i;
           return ans;
      }
      else{
        set.put(nums[i],i);
      }
}
     return ans; 
}
    }
