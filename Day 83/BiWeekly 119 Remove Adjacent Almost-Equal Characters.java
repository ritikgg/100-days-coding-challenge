class Solution {
    private boolean areAlmostEqual(char ch1, char ch2) {
        return ch1 == ch2 || ch1 + 1 == ch2 || ch1 == ch2 + 1;
    }

    public int removeAlmostEqualCharacters(String word) {
        int m = word.length();
        int cnt = 0;
        int i = 0;

        while (i < m - 1) {
            if (areAlmostEqual(word.charAt(i), word.charAt(i + 1))) {
                cnt++;
                i++;
            }
            i++;
        }

        return cnt;
    }
}
