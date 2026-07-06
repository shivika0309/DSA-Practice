// Brute Force Approach - Check the XOR of every possible subarray and count those with XOR equal to K. Time: O(n²) | Space: O(1)

// Optimal Approach (Prefix XOR + HashMap) - Store the frequency of prefix XORs; for each element, check if (prefixXOR ^ K) exists to count valid subarrays. Time: O(n) | Space: O(n)class Solution {
    public int subarraysWithXorK(int[] nums, int k) {
        int XOR=0;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
        XOR^=nums[i];
            if(map.containsKey(XOR^k)){
                ans+=map.get(XOR^k);
            }

           if(map.containsKey(XOR)){
            map.put(XOR,map.get(XOR)+1);
           }
           else{
            map.put(XOR,1);
           }
            
        }
        return ans;
      }
    }
