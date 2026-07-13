/*
 * Reverse Words in a String
 *
 * Approach:
 * - Traverse the string from the end towards the beginning.
 * - Skip any extra spaces between words.
 * - Identify each word by finding its start and end indices.
 * - Append the word to the result, adding a single space only between words.
 * - This automatically removes leading, trailing, and multiple spaces.
 *
 * Pattern:
 * - Two Pointers
 * - Reverse Traversal + String Parsing
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class ReverseWordsInAString {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {

            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) break;

            int end = i;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            int start = i ;

            if (ans.length() > 0) {
                ans.append(' ');
            }

            ans.append(s.substring(start+1, end + 1));
        }

        return ans.toString();
    }
}
