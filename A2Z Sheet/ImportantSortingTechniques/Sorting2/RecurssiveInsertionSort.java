class RecurssiveInsertionSort {
    public int[] bubbleSort(int[] nums) {
        bubbleSort(nums,nums.length-1);
        return nums;
    }

   private void bubbleSort(int[] nums,int n){
    if(n<=0)
    return;
    for(int i=0;i<n;i++){
        if(nums[i]>nums[i+1]){
            int temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
        }
        
    }
    bubbleSort(nums,n-1);
   }
}
