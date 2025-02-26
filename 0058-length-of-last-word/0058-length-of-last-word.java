class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+"); // Handles multiple spaces
        return words[words.length - 1].length(); // Returns last word's length
    }
}
