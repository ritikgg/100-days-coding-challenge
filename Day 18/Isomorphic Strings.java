class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] sLastSeen = new int[256]; 
        int[] tLastSeen = new int[256]; 

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            char charS = sChars[i];
            char charT = tChars[i];

            if (sLastSeen[charS] != tLastSeen[charT]) {
                return false;
            }

            sLastSeen[charS] = i + 1; 
            tLastSeen[charT] = i + 1; 
        }

        return true;
    }
}
