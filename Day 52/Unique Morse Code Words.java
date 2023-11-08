import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        // Morse code representations for the 26 English letters.
        String[] morseCodes = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        
        Set<String> uniqueTransformations = new HashSet<>();
        
        for (String word : words) {
            StringBuilder transformation = new StringBuilder();
            for (char c : word.toCharArray()) {
                transformation.append(morseCodes[c - 'a']); // Map the letter to its Morse code.
            }
            uniqueTransformations.add(transformation.toString());
        }
        
        return uniqueTransformations.size();
    }
}
