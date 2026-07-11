class TimesArrayReversed {
    public int findKRotation(ArrayList<Integer> nums) {
        int low=0;
        int high=nums.size()-1;
        int min=Integer.MAX_VALUE;
        int ans=-1;
        while(low<=high){     
            if(nums.get(low)<=nums.get(high)){
                //entire array from low to high is already sorted so no need to apply binary search
                if(nums.get(low)<min){
                    min=nums.get(low);
                    ans=low;
                }
                break;
            }

 int mid=low+(high-low)/2;

            if(nums.get(low)<=nums.get(mid)){
                //left is def sorted 
                if(nums.get(low)<min){
                    min=nums.get(low);
                    ans=low;
                }
            low=mid+1;
            }
            else{
                //right is def sorted
                if(nums.get(mid)<min){
                    min=nums.get(mid);
                    ans=mid;
                }
                high=mid-1;
            }
        }
        return ans;
    }
}
