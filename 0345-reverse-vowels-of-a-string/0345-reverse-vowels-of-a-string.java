class Solution {
    public String reverseVowels(String s) {
        boolean[] isVowel = new boolean[128];
        for(char ch : "aeiouAEIOU".toCharArray()){
            isVowel[ch] = true;
        }
        int start = 0;
        int end = s.length() - 1;
        char[] strArr = s.toCharArray();
        while(start < end){
            if(!isVowel[s.charAt(start)]){
                start++;
                continue;
            }
            if(!isVowel[s.charAt(end)]){
                end--;
                continue;
            }
            char temp = strArr[start];
            strArr[start] = strArr[end];
            strArr[end] = temp;
            start++;
            end--;
        }
        return new String(strArr);
    }
}