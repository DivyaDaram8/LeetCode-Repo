class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        StringBuilder ans = new StringBuilder("");
        int i = 0;
        int j = 0;
        while(i < w1 && j < w2){
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i < w1){
            ans.append(word1.charAt(i));
            i++;
        }
        while(j < w2){
            ans.append(word2.charAt(j));
            j++;
        }
        return ans.toString();
    }
}