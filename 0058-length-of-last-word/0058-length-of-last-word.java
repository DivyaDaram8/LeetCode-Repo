// class Solution {
//     public int lengthOfLastWord(String s) {
//         String[] words = s.trim().split("\\s+"); // Handles multiple spaces
//         return words[words.length - 1].length(); // Returns last word's length
//     }
// }

class Solution{
    public int lengthOfLastWord(String s){
        s = s.trim();
        int start = 0;
        int end = 0;
        int len = 0;
        while(end < s.length()){
            while( end < s.length() && s.charAt(end) != ' '){
                end++;
            }
            len = end - start;
            start = end;
            while(start < s.length() && s.charAt(start) == ' '){
                start++;
            }
            end = start;
        }
        return len;
    }
}