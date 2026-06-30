class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        /*
4Sum

Brute:
- Generate all possible quadruplets using four nested loops.
- Store unique quadruplets in a Set.
- Time: O(N^4 * log M), Space: O(M)

Better:
- Fix the first two elements and use a HashSet to find the fourth element.
- Store answers in a Set<List<Integer>> to automatically remove duplicates.
- Time: O(N^3 * log M), Space: O(N + M)

Optimal:
- Sort the array.
- Fix the first two elements and use the Two Pointer approach for the remaining two.
- Skip duplicate values for the first element, second element, and the left and right pointers to avoid duplicate quadruplets.
- Time: O(N^3), Space: O(1) (excluding the output list)
*/


//better
// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {

//         Set<List<Integer>> set = new HashSet<>();

//         for (int i = 0; i < nums.length - 3; i++) {

//             for (int j = i + 1; j < nums.length - 2; j++) {

//                 HashSet<Long> hash = new HashSet<>();

//                 for (int k = j + 1; k < nums.length; k++) {

//                     long fourth = (long) target - nums[i] - nums[j] - nums[k];

//                     if (hash.contains(fourth)) {

//                         List<Integer> temp = Arrays.asList(
//                                 nums[i],
//                                 nums[j],
//                                 nums[k],
//                                 (int) fourth
//                         );

//                         Collections.sort(temp);
//                         set.add(temp);
//                     }

//                     hash.add((long) nums[k]);
//                 }
//             }
//         }

//         return new ArrayList<>(set);
//     }
// }
      

      //optimal

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {

                        ans.add(Arrays.asList(
                                nums[i],
                                nums[j],
                                nums[left],
                                nums[right]
                        ));

                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return ans;
    }
}
