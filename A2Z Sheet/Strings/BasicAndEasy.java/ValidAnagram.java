/*
Approach:
- Count the frequency of each character in both strings using HashMaps.
- Compare the frequencies of every character.
- If any frequency differs or a character is missing, return false.
- Otherwise, the strings are anagrams.

Pattern:
- HashMap
- Frequency Counting

Time Complexity: O(n)

Space Complexity: O(k)
where k is the number of distinct characters.
*/
class ValidAnagram {
    public boolean isAnagram(String s, String t) {
    //     if(s.length()!=t.length())
    //     return false;

    //     else{
    //         HashMap<Character,Integer> map=new HashMap<>();
    //         HashMap<Character,Integer> mapa=new HashMap<>();
    //         for(int i=0;i<s.length();i++){
    //             char sch=s.charAt(i);
    //             char tch=t.charAt(i);
    //             if(map.containsKey(sch))
    //             map.put(sch,map.get(sch)+1);
    //             else
    //             map.put(sch,1);

    //             if(mapa.containsKey(tch))
    //             mapa.put(tch,mapa.get(tch)+1);
    //             else
    //             mapa.put(tch,1);
    //         }

    //         for(char ch:map.keySet()){
    //             if(mapa.containsKey(ch)){
    //                 if(!map.get(ch).equals(mapa.get(ch)))
    //                 return false;
    //             }
    //             else
    //             return false;
    //         }
    //     }
    // return true;

    //when only lower case in both
    if(s.length()!=t.length())
    return false;

    int []arr=new int[26];
    for(int i=0;i<s.length();i++){
        arr[s.charAt(i)-'a']++;
        arr[t.charAt(i)-'a']--;
    }
    
    for(int i:arr){
        if(i!=0)
        return false;
    }
    return true;
    }
}
