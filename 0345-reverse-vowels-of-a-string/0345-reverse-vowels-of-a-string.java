class Solution {
    public String reverseVowels(String s) {
        if(s == null || s.length() < 2) return s;

        int start = 0;
        int end = s.length() - 1;
        char[] chars = s.toCharArray();

        while(start < end){
            while(start < end && !isVowel(s.charAt(start))){
                start++;
            }
            while(start < end && !isVowel(s.charAt(end))){
                end--;
            }
            swap(chars, start, end);
            start++;
            end--;
        }
        return new String(chars);
    }
    public boolean isVowel(char c){
        String str = "AEIOUaeiou";
        return str.indexOf(c) != -1;
    }
    public void swap(char[] chars, int start, int end){
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
    }
}