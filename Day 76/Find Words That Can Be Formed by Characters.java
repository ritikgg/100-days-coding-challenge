class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charCount = new int[26]; // let lowercase alphabets only
        
        // count chars
        for (char c : chars.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        int result = 0;
        
        // check each word
        for (String word : words) {
            int[] wordCount = new int[26];
            boolean valid = true;
            
            // count characters in word
            for (char c : word.toCharArray()) {
                wordCount[c - 'a']++;
                
                // check for word count excdeeds in chars count
                if (wordCount[c - 'a'] > charCount[c - 'a']) {
                    valid = false;
                    break;
                }
            }
            
            // If word is valid, add its length to the result
            if (valid) {
                result += word.length();
            }
        }
        
        return result;
    }
}
