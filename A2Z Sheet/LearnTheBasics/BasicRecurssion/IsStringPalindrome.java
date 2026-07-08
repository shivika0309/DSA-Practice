class IsStringPalindrome {
    public boolean isPalindrome(String s) {
//         String st="";
//         int index=0;
//         s=s.toLowerCase();
//         StringBuilder sb=new StringBuilder();
//         for(int i=0;i<s.length();i++){
//           if((s.charAt(i)>='a' && s.charAt(i)<='z') || Character.isDigit(s.charAt(i))){
//              sb.append(s.charAt(i));
//              index++;
//           }
//         }
//       return isPalindrome(sb.toString(),0,sb.length()-1);
        
//     }

//     private boolean isPalindrome(String st,int left,int right){
//         if(left>=right)
//         return true; 
//         if(st.charAt(left)!=st.charAt(right))
//          return false; 
//         return isPalindrome(st,left+1,right-1);   
//     }

// }

return isPalindrome(s,0,s.length()-1);
    }

    private boolean isPalindrome(String s,int left, int right){
        if(left>=right)
        return true; 

        while(left<right && !Character.isLetterOrDigit(s.charAt(left)))
        left++;

        while(left<right && !Character.isLetterOrDigit(s.charAt(right)))
        right--;

        if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right)))
        return false; 

        return isPalindrome(s,left+1,right-1);
    }
}
