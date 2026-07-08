/*
Selection Sort

Idea:
- Divide the array into sorted and unsorted parts.
- In each iteration, find the minimum element from the unsorted part.
- Swap it with the first element of the unsorted part.
- Repeat until the entire array is sorted.

Time Complexity:
Best Case: O(n²)
Average Case: O(n²)
Worst Case: O(n²)

Space Complexity:
O(1)
*/

class SelectionSort {
    public int[] selectionSort(int[] nums) {
         for(int i=0;i<nums.length-1;i++){
            int min=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[min])
                min=j;
            }
            int temp=nums[i];
            nums[i]=nums[min];
            nums[min]=temp;
         }
         return nums;
    }
}
