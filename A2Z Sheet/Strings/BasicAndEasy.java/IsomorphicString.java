/*
Approach:
- Use two HashMaps to maintain one-to-one mappings in both directions.
- One map stores character mappings from s → t.
- The other map stores reverse mappings from t → s.
- If any existing mapping conflicts, return false.
- If all mappings remain consistent, return true.

Pattern:
- HashMap
- Bidirectional Mapping

Time Complexity: O(n)

Space Complexity: O(k)
where k is the number of distinct characters.
*/
class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
      HashMap<Character, Character> map = new HashMap<>();
HashMap<Character, Character> rev = new HashMap<>();

for (int i = 0; i < s.length(); i++) {

    char c1 = s.charAt(i);
    char c2 = t.charAt(i);

    if (map.containsKey(c1)) {
        if (map.get(c1) != c2)
            return false;
    } else {
        map.put(c1, c2);
    }

    if (rev.containsKey(c2)) {
        if (rev.get(c2) != c1)
            return false;
    } else {
        rev.put(c2, c1);
    }
}

return true;
        }
       
    }
