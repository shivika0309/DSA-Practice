class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

      
/*Brute:
- Generate all possible triplets using three nested loops.
- Store unique triplets in a Set.
- Time: O(N^3 * log M), Space: O(M)

Better:
- Fix one element and use a HashSet to find the third element.
- Store answers in a Set<List<Integer>> to automatically remove duplicates.
- Time: O(N^2 * log M), Space: O(N + M)

Optimal:
- Sort the array.
- Fix the first element and use the Two Pointer approach.
- Skip duplicate values for the first element as well as the left and right pointers to avoid duplicate triplets.
- Time: O(N^2), Space: O(1) (excluding the output list)*/

//better soln 
// Arrays.sort(nums);
// List<List<Integer>> ans=new ArrayList<>();
// for(int i=0;i<nums.length-2;i++){
//     if(i==0||nums[i]!=nums[i-1]){
//     int target=0-nums[i];

//     HashSet<Integer> set=new HashSet<>();
//     for(int j=i+1;j<nums.length;j++){
//         if(set.contains(target-nums[j])){
//             ArrayList<Integer> list=new ArrayList<>();
//             list.add(nums[i]);
//             list.add(nums[j]);
//             list.add(target-nums[j]);
//             ans.add(list);
//              while(j<nums.length-1 && nums[j]==nums[j+1]){
//             ++j;
//         }
//         }
//        set.add(nums[j]);
//         }
//     }
//     }
//       return ans;
// }
// }

optimal soln 
      // List<List<Integer>> ans=new ArrayList<>();

        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-2;i++){
        //     if(i==0||nums[i]!=nums[i-1]){
        //     int low=i+1;
        //     int high=nums.length-1;
        //     while(low<high){
        //         int sum=nums[i]+nums[low]+nums[high];
        //         if(sum==0){
        //             List<Integer> list=new ArrayList<>();
        //             list.add(nums[i]);
        //             list.add(nums[low]);
        //             list.add(nums[high]);
        //             ans.add(list);
        //             while(low<high&&nums[low+1]==nums[low]){
        //             low++;
        //             }
        //             low++;
        //             while(nums[high-1]==nums[high]&&low<high){
        //             high--;
        //             }
        //             high--;

        //         }
        //         else if(sum<0){
        //             low++;
        //         }
        //         else{
        //             high--;
        //         }      
        //         }
        //     }
        // }
        // return ans;
      
      //  }

    //better
    //using Set<List> 
    //duplicate already removed 
        Arrays.sort(nums);

        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            HashSet<Integer> set = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {

                int third = -(nums[i] + nums[j]);

                if (set.contains(third)) {

                    List<Integer> list = new ArrayList<>();

                    // Add in sorted order
                    list.add(nums[i]);
                    list.add(third);
                    list.add(nums[j]);

                    ans.add(list);
                }

                set.add(nums[j]);
            }
        }

        return new ArrayList<>(ans);
    }
}
