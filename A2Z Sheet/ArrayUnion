//Union of two sorted arrays
import java.util.*;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {

        int i = 0, j = 0;
        int n = nums1.length, m = nums2.length;

        int[] ans = new int[n + m];
        int k = 0; // index for ans

        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                if (k == 0 || ans[k - 1] != nums1[i]) {
                    ans[k++] = nums1[i];
                }
                i++;
            } 
            else if (nums1[i] > nums2[j]) {
                if (k == 0 || ans[k - 1] != nums2[j]) {
                    ans[k++] = nums2[j];
                }
                j++;
            } 
            else { // nums1[i] == nums2[j]
                if (k == 0 || ans[k - 1] != nums1[i]) {
                    ans[k++] = nums1[i];
                }
                i++;
                j++;
            }
        }

        // remaining elements in nums1
        while (i < n) {
            if (k == 0 || ans[k - 1] != nums1[i]) {
                ans[k++] = nums1[i];
            }
            i++;
        }

        // remaining elements in nums2
        while (j < m) {
            if (k == 0 || ans[k - 1] != nums2[j]) {
                ans[k++] = nums2[j];
            }
            j++;
        }

        return Arrays.copyOf(ans, k);
    }
}//help++
