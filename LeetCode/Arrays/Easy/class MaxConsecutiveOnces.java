//did myself at first go
//can also be solved through sliding window method 

class MaxConsecutiveOnces {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=nums.length;
        int cnt=0;
        int max=0;
        for(int i=0;i<l;i++){
            if(nums[i]==1){
                cnt++;

                if(cnt>max){
                    max=cnt;
                }
            }
                else {
                   cnt=0;
                }
            
        }
        return max;
    }
}
