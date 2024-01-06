class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i<ransomNote.length(); i++) {
            char letter = ransomNote.charAt(i);
            
            int matchedIndex = magazine.indexOf(letter);
            
            if(matchedIndex == -1)
                return false;
            
            magazine = magazine.substring(0, matchedIndex) +     magazine.substring(matchedIndex+1,magazine.length());
        }
        return true;
    }
}