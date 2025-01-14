// class Solution {
//     public String reverseWords(String s) {
//         String[] words = s.split(" ");
//         StringBuilder revSent = new StringBuilder();
        
//         for (String word : words) {
//             char[] chars = word.toCharArray();
//             int left = 0, right = chars.length - 1;
//             while (left < right) {
//                 char temp = chars[left];
//                 chars[left] = chars[right];
//                 chars[right] = temp;
//                 left++;
//                 right--;
//             }
//             revSent.append(new String(chars)).append(" ");
//         }
        
//         return revSent.toString().trim();
//     }
// }

// class Solution {
//     public String reverseWords(String s) {
//         StringBuilder revSent = new StringBuilder();
//         for (String word : s.split("\\s+")) {
//             StringBuilder revWord = new StringBuilder(word);
//             int wordlen = revWord.length();
//             for (int i = 0; i < wordlen / 2; i++) {
//                 char ch = revWord.charAt(i);
//                 revWord.setCharAt(i, revWord.charAt(wordlen - 1 - i));
//                 revWord.setCharAt(wordlen - 1 - i, ch);
//             }
//             revSent.append(revWord).append(" ");
//         }
//         return revSent.toString().trim();
//     }
// }


// public class Solution {
//     public String reverseWords(String s) {
//         String[] words = s.split("\\s+"); 
//         StringBuilder reversed = new StringBuilder();
//         for (String word : words) {
//             StringBuilder reversedWord = new StringBuilder(word);
//             reversedWord.reverse(); 
//             reversed.append(reversedWord).append(" "); 
//         }
//         return reversed.toString().trim();
//     }
// }

public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        
        return result.toString().trim();
    }
}