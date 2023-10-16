class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int len = s.length()-1;
        char[] toChar = s.toCharArray();
        for(; len>=0 && toChar[len] == ' '; len--){
        }
        for(; len>=0 && toChar[len] != ' '; len--){
            count++;        
        }
        return count;
    }
}
