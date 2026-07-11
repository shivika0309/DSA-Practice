class LargestOddNumberInString {
    public String largestOddNumber(String num) {
        // int maxind=-1;
        // boolean check=false; 
        // StringBuffer st=new StringBuffer();
        // for(int i=0;i<num.length();i++){
        //     int j=num.charAt(i)-48;
        //     if(j%2!=0)
        //             maxind=i;                   
        //         check=true; 
        //     }
        
        // if(check){
        //     for(int i=0;i<=maxind;i++){
        //         st.append(num.charAt(i));
        //     }
        //     return st.toString();
        // }
        
        // return "";


        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
