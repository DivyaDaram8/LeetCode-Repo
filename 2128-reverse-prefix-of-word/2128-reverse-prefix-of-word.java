class Solution {
    public String reversePrefix(String word, char ch) {
        int indx = word.indexOf(ch);
        char[] charsArr = word.toCharArray();
        if(indx == -1){
            return word;
        }else{
            
            int  s =0;
            int e = indx;
           while(s < e){
                char temp = charsArr[s];
                charsArr[s] = charsArr[e];
                charsArr[e] = temp;
                s++;
                e--;
            }
        }
        return new String(charsArr);
    }
}