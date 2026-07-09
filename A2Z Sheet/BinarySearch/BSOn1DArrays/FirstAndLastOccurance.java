class FirstAndLastOccurance {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int left=-1;
        int right=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
            left=mid;
            high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            
            }
        }
low=0;
high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                right=mid;
                low=mid+1;
            }
            else if(nums[mid]<target)
            low=mid+1;
            else 
            high=mid-1;
        }
        return new int[]{left,right};
    }
}
