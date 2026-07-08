/*
Insertion Sort

Idea:
- Assume the first element is already sorted.
- Pick the next element (key) and insert it into its correct position
  in the sorted part by shifting larger elements one position to the right.
- Repeat until the entire array is sorted.

Time Complexity:
Best Case: O(n)     // Already sorted
Average Case: O(n²)
Worst Case: O(n²)   // Reverse sorted

Space Complexity:
O(1)
*/
class SelectionSort {
    public int[] insertionSort(int[] nums) {
            for(int i=1;i<nums.length;i++){
                for(int j=i;j>0;j--){
                    if(nums[j]<nums[j-1]){
                        int temp=nums[j];
                        nums[j]=nums[j-1];
                        nums[j-1]=temp;
                    }
                    else{ 
                        break;
                    }
                }
            }
        return nums;
    }
}
