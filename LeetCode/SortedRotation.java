// 1752. Check if array is sorted
class SortedRotation {
    public boolean check(int[] nums) {
        
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
            count++;
}
   }

            if(count>1){
                return false;
            }
        
        return true;
    }
}//self but modified
/*Whenever you see:

Circular arrays

Rotations

Clock problems

Round table problems

You’ll often see:

(index + something) % n */
