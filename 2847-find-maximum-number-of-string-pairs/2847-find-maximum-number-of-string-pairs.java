class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        String rev = "";
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                if(!words[j].equals("0")){
                    rev = reverseWord(words[j]);
                    if(words[i].equals(rev)){
                        count++;
                        words[j] = "0";
                        break;
                    }
                }
            }
        }
        return count;
    }
    public String reverseWord(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i)); 
        }
        return sb.toString();
    }

}