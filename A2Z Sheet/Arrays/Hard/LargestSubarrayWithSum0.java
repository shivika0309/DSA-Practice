// Brute Force Approach - Check every possible subarray and track the maximum length with sum 0. Time: O(n²) | Space: O(1)

// Optimal Approach (Prefix Sum + HashMap) - Store the first occurrence of each prefix sum; if the same sum appears again, the subarray between them has sum 0. Time: O(n) | Space: O(n)class Solution {
    public int maxLen(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int max=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
             sum+=arr[i];
            if(map.containsKey(sum)){
                 max=Math.max(max,i-map.get(sum));
            }
            if(!map.containsKey(arr[i])){
                map.put(sum,i);
            }
        }
        return max;
    }
}
