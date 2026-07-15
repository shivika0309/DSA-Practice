/*
 * Problem: Minimum Number of Days to Make m Bouquets (Binary Search on Answer)
 *
 * Approach:
 * - The answer lies between the minimum and maximum bloom day.
 * - Use Binary Search on this range to find the earliest day on which
 *   it is possible to make at least 'm' bouquets.
 * - For each candidate day (mid), traverse the array and count
 *   consecutive bloomed flowers (bloomDay[i] <= mid).
 * - Every consecutive block contributes (count / k) bouquets.
 * - If at least 'm' bouquets can be formed, search the left half
 *   for an earlier valid day; otherwise, search the right half.
 *
 * Key Insight:
 * - If it is possible to make 'm' bouquets on day D,
 *   then it is also possible on every day after D.
 * - This creates a monotonic (False → True) search space,
 *   making Binary Search applicable.
 *
 * Time Complexity: O(n * log(maxBloomDay - minBloomDay + 1))
 * Space Complexity: O(1)
 */

// Pattern: Binary Search on Answer (Minimum Feasible Value)
class MinNoOfDaysToMakeMBouquets {
    public int minDays(int[] bloomDay, int m, int k) {

//brute Force
        if((long)m*k>bloomDay.length)
         return -1;

       int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

for(int day:bloomDay){
     min=Math.min(min,day);
     max=Math.max(max,day);
}

//        for(int i=min;i<=max;i++){
//         int total=0;
//         int count=0;
//             for(int day:bloomDay){

//                 if(day<=i){
//                     ++count;
//                 }
//                 else{
//                     total+=count/k;
//                     count=0;
//                 }
//             }
//             total+=count/k;
//             if(total>=m)
//             return i;
//        }
//        return -1;
//     }
// }
int low=min;
int high=max;

while(low<high){
    int mid=low+(high-low)/2;

    int total=0;
    int count=0;
    for(int day:bloomDay){
        if(day<=mid){
            count++;
        }
        else{
            total+=count/k;
            count=0;
        }
    }
    total+=count/k;
    if(total<m)
    low=mid+1;
    else
        high=mid;
    
}
return high;
    }
}
