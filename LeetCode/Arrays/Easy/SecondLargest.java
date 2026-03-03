//to find second largest element//fails for case(5,Integer.MIN_VALUE)

class SecondLargest {
    public int secondLargestElement(int[] nums) {
   int max=Integer.MIN_VALUE;
   int second=Integer.MIN_VALUE;
 
   for(int i=0;i<n;i++){
    if(nums[i]>max){
        second=max;
        max=nums[i];
       
    }

    else if(nums[i]<max&&nums[i]>second){
        second=nums[i];
    }
   }

   if(max==second){
    return -1;
   }

   return second;
    
   
    }
}
