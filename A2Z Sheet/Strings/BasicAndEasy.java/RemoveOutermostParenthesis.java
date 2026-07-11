/*
Pattern: String Traversal + Depth Counter (Nesting Level)

Key Idea:
- Maintain the current nesting depth of parentheses.
- Skip the first '(' of every primitive (depth == 0).
- Skip the last ')' of every primitive (depth becomes 0 after decrement).
- Append all inner parentheses to the answer.

Approach:
- Traverse the string once.
- Increase depth for '(' and decrease for ')'.
- Decide whether to append based on the current depth.

Time Complexity: O(n)
Space Complexity: O(n)

Related Problems:
- Maximum Nesting Depth of Parentheses
- Valid Parentheses
- Score of Parentheses
- Generate Parentheses
- Minimum Remove to Make Valid Parentheses
*/
class RemoveOutermostParenthesis {
    public String removeOuterParentheses(String s) {
        StringBuilder st=new StringBuilder();
        int depth=0;
        for(char ch:s.toCharArray()){
        
            if(ch=='('){
                if(depth>0){
                    st.append('(');
                }
                depth++;
        }
            else if(ch==')'){
               depth--;
               if(depth>0){
                st.append(')');
               }
        }     
    }
return st.toString();
}
}
