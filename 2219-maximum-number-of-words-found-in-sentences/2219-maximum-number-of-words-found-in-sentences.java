class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = Integer.MIN_VALUE;
        for(int i = 0; i < sentences.length; i++){
            String[] words = sentences[i].trim().split("\\s+");
            count = Math.max(count,words.length);
        }
        return count;
    }
}