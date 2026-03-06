 

class LongestSubArrayWithSumK{
    public int longestSubarray(int[] nums, int k) {
        //brute force
       /* int l=nums.length;
        int sum=0;
        int max=0;
      
       for (int j=0;j<l;j++){
        sum=0;
        if(max>=l-j){
            break;
        }
        for(int i=j;i<l;i++){
            sum+=nums[i];
      

            if(sum==k){
                max=Math.max(max,i-j+1);
            }
        }
    
       }
       return max;*/



//better approach for all positives using hashmap and optimal for negative+positive+0
     /*int sum=0;
     int max=0;
     HashMap <Integer,Integer> map= new HashMap<>();
     for(int i=0;i<nums.length;i++){
        map.put(0,-1);//for subarrays starting from index 0 where sum-k==0 so it should be present already to give true in map.containsKey(x).
        sum+=nums[i];
        int x=sum-k;

        if(map.containsKey(x)){
           max=Math.max(max,i-map.get(x));
        }

        if(!map.containsKey(sum)){//so that if a sum appears again in case of negative numbers also being present or when 0's present so that longest subset is not lost
        map.put(sum,i);
        }
     }
     return max;*/

//optimal approach for all positive
     //sliding window

int left = 0;
int sum = 0;
int max = 0;

for(int right = 0; right < n; right++){

    sum += arr[right];

    while(sum > k){
        sum -= arr[left];
        left++;
    }

    if(sum == k){
        max = Math.max(max, right - left + 1);
    }
}

return max;
    }
    }

