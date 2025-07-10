// class Solution {
//     public int lengthOfLastWord(String s) {
//         String[] words = s.trim().split("\\s+"); // Handles multiple spaces
//         return words[words.length - 1].length(); // Returns last word's length
//     }
// }

// class Solution{
//     public int lengthOfLastWord(String s){
//         s = s.trim();
//         int start = 0;
//         int end = 0;
//         int len = 0;
//         while(end < s.length()){
//             while( end < s.length() && s.charAt(end) != ' '){
//                 end++;
//             }
//             len = end - start;
//             start = end;
//             while(start < s.length() && s.charAt(start) == ' '){
//                 start++;
//             }
//             end = start;
//         }
//         return len;
//     }
// }


class Solution{
    public int lengthOfLastWord(String s){
        s = s.trim();
        int len = 0;
        int i = s.length() - 1;
        while(i >= 0 && s.charAt(i) != ' '){
            i--;
            len++;
        }
        return len;
    }
}