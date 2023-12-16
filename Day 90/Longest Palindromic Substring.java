class Solution {
    public String longestPalindrome(String s) {
        int[] range = {0, 0};
        
        for (int i = 0; i < s.length(); i++) {
            expandAroundCenter(s, i, i, range);
            expandAroundCenter(s, i, i + 1, range);
        }
        
        return s.substring(range[0], range[1] + 1);
    }

    private void expandAroundCenter(String s, int left, int right, int[] range) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        if (right - left - 1 > range[1] - range[0]) {
            range[0] = left + 1;
            range[1] = right - 1;
        }
    }
}
