import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        // if the lengths of the two strings are different
        if (s.length() != t.length()) {
            return false;
        }

        // strings to character arrays
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // compare sorted arrays
        return Arrays.equals(sChars, tChars);
    }
}
