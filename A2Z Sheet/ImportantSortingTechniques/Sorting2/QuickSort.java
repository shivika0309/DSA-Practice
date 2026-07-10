/*
QUICK SORT

Idea:
1. Choose a pivot element.
2. Place the pivot at its correct sorted position (partition).
3. Elements smaller than the pivot go to the left.
4. Elements greater than the pivot go to the right.
5. Recursively apply Quick Sort on the left and right subarrays.

Steps:
- Select pivot (first/last/random/middle).
- Count elements smaller than pivot to find its correct index.
- Swap pivot to its correct position.
- Use two pointers (i, j) to swap misplaced elements.
- Recursively sort left and right parts.

Time Complexity:
Best Case    : O(n log n)
Average Case : O(n log n)
Worst Case   : O(n²)  // when pivot is always smallest/largest

Space Complexity:
Average : O(log n) (recursion stack)
Worst   : O(n)
*/
class Solution {
    public int[] quickSort(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }

    private void quickSort(int[] nums,int low,int high){
        if(low>=high)
        return;
        
        int i=low;
        int j=high;
        int pivot=nums[high];
        while(i<j){
        
        while(i<=high && nums[i]<pivot)
        i++;
        while(j>low && nums[j]>=pivot)
        j--;
        if(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        }
        int temp=nums[i];
        nums[i]=nums[high];
        nums[high]=temp;
       
        quickSort(nums,low,i-1);
        quickSort(nums,i+1,high);
    }
}
