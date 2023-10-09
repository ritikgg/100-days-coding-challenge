import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        // Check if the lengths of the two strings are different
        if (s.length() != t.length()) {
            return false;
        }

        // Convert the strings to character arrays
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        // Sort the character arrays
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Compare the sorted arrays
        return Arrays.equals(sChars, tChars);
    }
}
