

    /*Brute force myself*/
    class TwoSum{
public int[] twoSum(int[] nums, int target) {
 
        for(int i=0;i<nums.length-1;i++){
            
            for(int j=i+1;j<nums.length;j++){
                 if(nums[i]+nums[j]==target){
                      
                    return new int[]{i,j};
                 }
            }
        }
       return new int[]{};
    }
}


/*better solution understood*/
/*HashMap<Integer, Integer> map = new HashMap<>();

for(int i = 0; i < nums.length; i++){
    int need = target - nums[i];

    if(map.containsKey(need)){
        return new int[]{map.get(need), i};
    }

    map.put(nums[i], i);
}*/




/*best solution logic help code myself*/
//two pointer from opposite direction
//not appropriate here as when we sort the indices which are required to be returned are lost
//apt when sorted array 
/*import java.util.Arrays;
class Solution {
public int[] twoSum(int[] nums, int target) {
 
 Arrays.sort(nums);
        int left=0, right= nums.length-1, sum=0;
        while(left<right){
            sum=nums[left]+nums[right];

                if(sum>target){
                    right--;
                }
                else if(sum<target){
                    left++;
                }

                else{
                    return new int[]{left,right};
                }
        }
         return new int[]{};
    }
    }*/



