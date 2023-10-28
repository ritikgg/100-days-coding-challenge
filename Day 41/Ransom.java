// Using HashMap

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> charFrequency = new HashMap<>();
        
        // Iterate in magazine
        for(char c : magazine.toCharArray()){
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Check for Ransom note i can be create or not

        for(char c : ransomNote.toCharArray()){
            if (charFrequency.containsKey(c) && charFrequency.get(c) > 0){
                charFrequency.put(c, charFrequency.get(c) - 1);
            }
            else{
                return false; // Ransom cannot be created
            }
        }

        return true; // Ransom can be created
        
    }
}
