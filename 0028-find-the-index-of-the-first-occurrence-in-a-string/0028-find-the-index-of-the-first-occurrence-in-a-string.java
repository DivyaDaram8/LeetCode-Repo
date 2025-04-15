class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        int hayLen = haystack.length();
        int needLen = needle.length();
        for(int i = 0; i <= hayLen - needLen; i++){
            if(haystack.substring(i,i+ needLen).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}