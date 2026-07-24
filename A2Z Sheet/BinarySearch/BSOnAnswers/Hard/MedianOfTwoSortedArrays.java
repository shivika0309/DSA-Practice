// 🔴 Median of Two Sorted Arrays (Binary Search)

// Today's challenge was one of the most famous hard binary search problems. The key idea is to binary search on the smaller array and find a partition such that:
// • Left half contains exactly half of the total elements.
// • Every element on the left ≤ every element on the right.

// Once the valid partition is found:
// • Odd total length → median = max(left1, left2)
// • Even total length → median = (max(left1, left2) + min(right1, right2)) / 2

// Time Complexity: O(log(min(m, n)))
// Space Complexity: O(1)

// A great problem for understanding binary search on partitions rather than on values. 🚀
class MedianOfTwoSortedArays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double l1=0.0,r1=0.0;
        double l2=0.0,r2=0.0;
        double median=0.0;

        if(nums2.length<nums1.length){
            int[] temp=nums1;
            nums1=nums2;
            nums2=temp;
        }

        int low=0;
        int high=nums1.length;
        while(low<=high){
            
            int cut1=low+(high-low)/2;
            if(cut1==0){
                l1=Integer.MIN_VALUE;
            }
            else
            l1=nums1[cut1-1];

            if(cut1==nums1.length)
            r1=Integer.MAX_VALUE;
            else
            r1=nums1[cut1];

           
            int cut2=(nums1.length+nums2.length+1)/2 - cut1;
            if(cut2==0)
            l2=Integer.MIN_VALUE;
            else 
            l2=nums2[cut2-1];

            if(cut2==nums2.length)
            r2=Integer.MAX_VALUE;
            else
            r2=nums2[cut2];

            if(l1>r2)
            high=cut1-1;

            else if(l2>r1)
            low=cut1+1;

            if(l1<=r2 && l2<=r1){
            if((nums1.length+nums2.length) % 2!=0)
            return Math.max(l1,l2);

            else 
            return ((Math.max(l1,l2)+Math.min(r1,r2))/2);
            }
        }
        return 0;
    }
}
