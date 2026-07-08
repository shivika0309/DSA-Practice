/*
Brute Force:
- For every element, traverse the entire array and count its frequency.
- Keep track of the element having the maximum frequency.

Time Complexity: O(n²)
Space Complexity: O(1)

-------------------------------------------------------

Better:
- Use a HashMap to store the frequency of each element.
- Traverse the HashMap to find the element with the highest frequency.

Time Complexity: O(n)
Space Complexity: O(n)

-------------------------------------------------------

Optimal:
- Use a frequency array if the range of elements is small and known.
- Count frequencies using the array and find the maximum frequency.

Time Complexity: O(n + k)
Space Complexity: O(k)

(k = range of elements)
*/

class HighestOccuringElementInArray {
    public int maxFrequency(int[] nums, int k) {
//         Arrays.sort(nums);
//         int max=1;
//         for(int i=nums.length-1;i>=1;i--){
//             int cnt=1;
//             int j=i-1;
//             int temp=k;
//             while(j>=0 && nums[i]-nums[j]<=temp){
//                 cnt++;
//                 temp=temp-(nums[i]-nums[j]);
//                 j--;
//             }
//             max=Math.max(max,cnt);
//         }
//         return max; 
//     }
// }

Arrays.sort(nums);
int max=1;
long sum=0;
int left=0;
for(int right=0;right<nums.length;right++){
    sum+=nums[right];
    
    while(1L*nums[right]*(right-left+1)>sum+k){
        sum-=nums[left];
        left++;
    }

    max=Math.max(max,right-left+1);
    }
return max;
}

}
