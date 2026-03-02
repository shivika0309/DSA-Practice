class RotateKPlaces {
    public void rotate(int[] nums, int k){
        int n=nums.length;
         k=k%n;
          rot(nums,0,nums.length-1);
          rot(nums,0,k-1);
          rot(nums,k,nums.length-1);
          }

          public void rot(int[] nums,int s,int e){
          while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
          }
    }
}
