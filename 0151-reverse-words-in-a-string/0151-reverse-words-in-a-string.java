class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        List<String> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        while(end < s.length()){
            while(end < s.length() && s.charAt(end) != ' '){
                end++;
            }
            list.add(s.substring(start, end));
            start = end;
            while(start < s.length() && s.charAt(start) == ' '){
                start++;
            }
            end = start;
        }
        String[] reverseWords = reverse(list.toArray(new String[list.size()]));
        return String.join(" ", reverseWords);
    }
    public String[] reverse(String[] words){
        int start = 0;
        int end = words.length - 1;
        while(start < end){
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }
        return words;
    }
}