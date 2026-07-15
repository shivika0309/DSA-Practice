/*
* Approach:
 * - The minimum eating speed lies between 1 and the maximum pile size.
 * - Use Binary Search on this range to find the smallest valid speed.
 * - For each candidate speed (mid), calculate the total hours required
 *   using ceil(pile / mid).
 * - If the total hours are within the allowed limit (h), try a smaller
 *   speed by searching the left half.
 * - Otherwise, search the right half for a larger speed.
 *
 * Key Insight:
 * - As the eating speed increases, the required hours decrease.
 * - This creates a monotonic (False → True) search space, making
 *   Binary Search applicable.
 *
 * Time Complexity: O(n * log(maxPile))
 * Space Complexity: O(1)
 */
class KokoEatingBananas{
    public int minEatingSpeed(int[] piles, int h) {
        
    //     //brute force O(n*maxpile)
    //     int max=piles[0];
    //     for(int i=0;i<piles.length;i++){
    //         max=Math.max(max,piles[i]);
    //     }

    //     for(int k=1;k<=max;k++){
    //         long hours=0;
    //         for(int pile:piles){
    //             int ceil=(pile+k-1)/k;
    //              hours+=ceil;
    //             }
    //             if(hours<=h)
    //             return k;
    //         }
    //         return 0;
    //     }
      
    // }

    //optimal soln 
   // O(n*log(maxpile))
    int max=0;
   for(int pile:piles){
    max=Math.max(max,pile);
   }

   int low=1;
   int high=max;
   while(low<high){
    int mid=low+(high-low)/2;
    long hours= findHours(piles,mid);
    if(hours<=h)
    high=mid;
    else
    low=mid+1;
   }
   return low;
    }

    private long findHours(int[] piles,int mid){
    long hours=0;
    for(int pile:piles){
        hours+=(pile+mid-1)/mid;
    }
    return hours;
    }

}
