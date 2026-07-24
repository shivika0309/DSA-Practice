// 🔴 K-th Element of Two Sorted Arrays (Binary Search)

// Solved the K-th Element problem using binary search on the smaller array. The goal is to partition both arrays so that the left side contains exactly k elements while ensuring every element on the left is less than or equal to every element on the right.

// If the partition is invalid:
// • left1 > right2 → move left.
// • left2 > right1 → move right.

// Once the correct partition is found, the answer is simply max(left1, left2).

// Time Complexity: O(log(min(n, m)))
// Space Complexity: O(1)

// A nice extension of the Median of Two Sorted Arrays problem that reinforces the partition-based binary search approach. 🚀
class KthElementOfTwoSortedArrays {
    public int kthElement(int[] a, int[] b, int k) {
        
        int l1=0,r1=0,l2=0,r2=0;
        if(b.length<a.length){
            int[] temp=a;
            a=b;
            b=temp;
        }

        int low=0;
        int high=a.length;
        while(low<=high){
            int cut1=low+(high-low)/2;
            if(cut1==0)
            l1=Integer.MIN_VALUE;
            else
            l1=a[cut1-1];

            if(cut1==a.length)
            r1=Integer.MAX_VALUE;
            else
            r1=a[cut1];

            int cut2=k-cut1;
            if(cut2==0)
            l2=Integer.MIN_VALUE;
            else 
            l2=b[cut2-1];

            if(cut2==b.length)
            r2=Integer.MAX_VALUE;
            else
            r2=b[cut2];

            if(l1<=r2 && l2<=r1)
            return Math.max(l1,l2);

            else if(l1>r2)
            high=cut1-1;

            else if(l2>r1)
            low=cut1+1;
            
        }
        return 0; 
    }
}
