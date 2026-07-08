//no mistake 
//simple xor logic
//xor of two numbers doesn't always give sum   0 XOR 1=1 and 1 XOR 1 = 0

class SingleNumber {
    public int singleNumber(int[] nums) {
        int rem=0;
        for(int i:nums){
rem=rem^i;
        }
        return rem;
    }
}
