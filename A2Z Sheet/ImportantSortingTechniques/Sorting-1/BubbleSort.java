/*
Bubble Sort (Optimized)

Idea:
- Compare adjacent elements.
- Swap them if they are in the wrong order.
- After each pass, the largest element moves to its correct position.
- If no swaps occur in a pass, the array is already sorted, so stop early.

Time Complexity:
Best Case: O(n)     // Already sorted (no swaps)
Average Case: O(n²)
Worst Case: O(n²)

Space Complexity:
O(1)
*/
class BubbleSort {
    public int[] bubbleSort(int[] nums) {

        int swap=0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap=1;
                }
            }
            if(swap==0){
                break;
            }
        }
        return nums;
    }
}
    
