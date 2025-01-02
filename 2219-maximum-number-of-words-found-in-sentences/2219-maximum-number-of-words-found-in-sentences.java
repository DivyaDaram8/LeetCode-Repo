class Solution {
    public int mostWordsFound(String[] sentences) {
        // int count = Integer.MIN_VALUE;
        // for(int i = 0; i < sentences.length; i++){
        //     String[] words = sentences[i].trim().split("\\s+");
        //     count = Math.max(count,words.length);
        // }
        // return count;
        int count = Integer.MIN_VALUE;
        for(int i = 0 ; i < sentences.length; i++){
            int tempCount = 0;
            for(int j = 0; j < sentences[i].length(); j++){
                if(sentences[i].charAt(j) == ' ') tempCount++;
            }
            count = Math.max(count, tempCount+1);
        }
        return count;
    }
}