class FindMissingNumberXORMethod {
    
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int XORALL=0;
      for(int i=0;i<=n;i++){
         XORALL=XORALL^i;
      }

      for(int j:nums){
        XORALL=XORALL^j;
      }
      return XORALL;
}
}
