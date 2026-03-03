//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//we subtract total sum of numbers from the sum of given array to find the missing number
//mistake in this code that i made was in the formula to find sum
//I did the bruteforce correctly wherein I made two loops and went through the array again and again to check which number is missing 

class FindMissingNumber_SumMethod {
    
    public int missingNumber(int[] nums) {
        int n=nums.length;
       int sum=(n*(n+1))/2;
       int temp=0;
       for(int i=0;i<n;i++){
        temp+=nums[i];
       }
       int ans=sum-temp;
       return ans;
}
}
