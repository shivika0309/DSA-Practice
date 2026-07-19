/*
Approach:
1. Binary Search on Answer:
   - Sort the stall positions.
   - Minimum possible distance = 1.
   - Maximum possible distance = last stall - first stall.
   - For each mid, greedily place cows while maintaining at least
     mid distance between consecutive cows.
   - If all cows can be placed, try a larger minimum distance;
     otherwise, reduce the distance.
   - Time: O(n log(maxDistance)), Space: O(1)
*/
class AggressiveCows {
    public int aggressiveCows(int[] nums, int k) {

//         Arrays.sort(nums);

//         int maxDistance = nums[nums.length - 1] - nums[0];
//         int ans = 0;

//         for (int dist = 1; dist <= maxDistance; dist++) {

//             int cowsPlaced = 1;
//             int lastPlaced = 0;

//             for (int i = 1; i < nums.length; i++) {

//                 if (nums[i] - nums[lastPlaced] >= dist) {
//                     lastPlaced = i;
//                     cowsPlaced++;
//                 }

//                 if (cowsPlaced == k) {
//                     ans = dist;
//                     break;
//                 }
//             }

//             if (cowsPlaced != k)
//                 return ans;
//         }

//         return ans;
//     }
// }

Arrays.sort(nums);
int maxDist=nums[nums.length-1]-nums[0];
int low=1;
int high=maxDist;
while(low<=high){
    int mid=low+(high-low)/2;
     int cowsPlaced=1;
    int lastPlaced=0;
    for(int i=1;i<nums.length;i++){

    if(nums[i]-nums[lastPlaced]>=mid){
    cowsPlaced++;
    lastPlaced=i;
    }
    if(cowsPlaced==k)
    break;
    }
    if(cowsPlaced==k)
        low=mid+1;
    else{
        high=mid-1;
    }
}
return high;
    }
}
