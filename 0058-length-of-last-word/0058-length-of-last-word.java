class Solution {
    public int lengthOfLastWord(String s) {
        String[] newstr = s.split(" ");
        int len = newstr.length -1;
        String word = newstr[len];
        return word.length();
    }
}