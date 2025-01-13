import java.util.HashMap;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> hs = new HashSet<>();
        for(String word : words){
            StringBuilder encodedString = new StringBuilder();
            for(char ch : word.toCharArray()){
                encodedString.append(codes[ch - 'a']);
            }
            hs.add(encodedString.toString());
        }
        return hs.size();
    }
}
