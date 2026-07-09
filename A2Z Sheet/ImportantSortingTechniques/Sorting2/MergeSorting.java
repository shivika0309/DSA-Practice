class MergeSorting {
    public int[] mergeSort(int[] nums) {
        int low=0;
        int high=nums.length-1;
      mergeSort(nums,low,high);
      return nums;
    }

    private void mergeSort(int[] nums,int low,int high){
        if(low>=high)
        return;
        int mid=low+(high-low)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }

    private void merge(int[]nums,int low,int mid,int high){
        ArrayList<Integer> list=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                list.add(nums[left]);
                left++;
            }
            else{
                list.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(nums[left]);
            left++;
        }
        while(right<=high){
            list.add(nums[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            nums[i]=list.get(i-low);
        }

    }
}
