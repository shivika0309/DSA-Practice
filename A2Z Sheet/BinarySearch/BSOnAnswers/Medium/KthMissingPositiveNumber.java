/*
Approach:
1. Brute Force:
   - Iterate through positive numbers while comparing with the array.
   - Count missing numbers until the kth missing number is found.
   - Time: O(n + k), Space: O(1)

2. Optimal (Binary Search):
   - Missing numbers before index i = arr[i] - (i + 1).
   - Binary search for the first index where missing >= k.
   - Answer = low + k.
   - Time: O(log n), Space: O(1)
*/
class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
  
//         int in=1;
//         int i=0;
//         int cnt=0;
//         while(i<arr.length){
//             if(arr[i]!=in){
//                 cnt++;
//                 if(k==cnt)
//                 return in;
//             }
//             else{
//                 i++;
//             }
//             in++;
//         }
//         if(k>cnt){
//             int add=k-cnt;
//             return arr[arr.length-1]+add;
//         }
// return 0;

//second brute force better
// for(int i:arr){
//     if(i<=k)
//     k++;
//     else
//     return k;
// }
// return k;
//         }
//         }

//optimised
int low=0;
int high=arr.length-1;
while(low<=high){
    int mid=low+(high-low)/2;
    int miss=arr[mid]-(mid+1);
    if(miss<k)
    low=mid+1;
    else
    high=mid-1;
}
return low+k;
    }
}

