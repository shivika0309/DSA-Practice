/*
Approach:
- Assume the first string is the common prefix.
- Compare this prefix with every other string character by character.
- After each comparison, shrink the prefix to the matched portion.
- If the prefix becomes empty, no common prefix exists.

Pattern:
- String Traversal
- Prefix Matching

Time Complexity: O(n × m)
where n = number of strings and m = length of the shortest string.

Space Complexity: O(1)
*/
class LongestCommonPrefix{
    public String longestCommonPrefix(String[] strs) {
       String ans=strs[0];
       
       if(strs[0].length()==0)
        return "";

        for(int i=1;i<strs.length;i++){
          
            int j=0;
            while(j<strs[i].length() && j<ans.length() && ans.charAt(j)==strs[i].charAt(j)){
                j++;
            }
            ans=ans.substring(0,j);
            if(ans.equals(""))
            return ans;
        }
           
        return ans.toString();
            }
}
