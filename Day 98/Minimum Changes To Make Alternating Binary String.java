class Solution {
    public int minOperations(String s) {
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                cnt += (s.charAt(i) == '0') ? 1 : 0;
            } else {
                cnt += (s.charAt(i) == '1') ? 1 : 0;
            }
        }

        return Math.min(cnt, s.length() - cnt);
    }
}
