//classic Moore's method

class MajorityElement1 {
    public int majorityElement(int[] nums) {
       
       //brute force
      
        
       /* for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count>nums.length/2){
return arr[i];
    }
        }
        }
        return -1;*/


//better solution by sorting and then finding max tc:O(nlogn)    sc:O(1)
    /*    Arrays.sort(nums);
        int ans=0;
        int max=0;
        int count=1;
        for(int i=1;i<nums.length;i++){
           if(nums[i]==nums[i-1]){
            count++;
           
          max= Math.max(max,count);
          
          if(max>nums.length/2){
            ans=i;
            break;
          }
           }
            else{
                count=1;
            }
        }
        return nums[ans];*/


//better than sorting solution
//Hash map method   tc:O(n)   sc:O(n)
 /*int ans=0;
HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<nums.length;i++){
    if(map.containsKey(nums[i])){
        map.put(nums[i],map.get(nums[i])+1);
    }
    else{
        map.put(nums[i],1);
    }

    if(map.get(nums[i])>(nums.length/2)){
        ans=i;
    }
}
return nums[ans];*/


//optimal solution
//Moore's method
//ideal when a no appears more than n/2 times ...will give correct ans when an array necessarily has a no appearing more than n/2 times
int el=nums[0];
int cnt=0;
for(int i=0;i<nums.length;i++){
    if(cnt==0){
        el=nums[i];
    }
    if(nums[i]==el){
        ++cnt;
    }
    else{
        --cnt;
    }
    
    }
    return el;
}
    }
