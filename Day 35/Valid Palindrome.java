class Solution {
    public boolean isPalindrome(String s) {
        // Convert the string to lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        char[] str = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (str[start] != str[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
