class Solution {
    public String largestGoodInteger(String num) {
        String largestGoodInteger = "";

        for (int i = 0; i <= num.length() - 3; i++) {
            String substring = num.substring(i, i + 3);

            if (isGoodInteger(substring) && substring.compareTo(largestGoodInteger) > 0) {
                largestGoodInteger = substring;
            }
        }

        return largestGoodInteger;
    }

    private boolean isGoodInteger(String s) {
        return s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2);
    }
}
