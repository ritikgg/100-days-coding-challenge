class Solution {
    public int maxScore(String s) {
        int zero = 0;
        int one = 0;
        int res = 0;

        // count the number of ones in the entire string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                one += 1;
            }
        }

        // iterate through the string, updating zero and one counts and calculating the score
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zero += 1;
            } else {
                one -= 1;
            }
            res = Math.max(res, zero + one);
        }

        return res;
    }
}
