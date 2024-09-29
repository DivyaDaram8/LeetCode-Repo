// class Solution {
//     public int strStr(String haystack, String needle) {
//         int idx1 = 0;
//         int idx2 = 0;
//         int cnt = 0;
//         for(int i = 0; i < haystack.length(); i++){
//             if(haystack.charAt(idx1) == needle.charAt(idx2)){
//                 idx1++;
//                 idx2++;
//                 cnt++;
//                 if(cnt == needle.length()){
//                     return idx1 - idx2;
//                 }
//             }else{
//                 idx1++;
//                 idx2 = 0;
//             }
//         }
//         return -1;
//     }
// }
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
