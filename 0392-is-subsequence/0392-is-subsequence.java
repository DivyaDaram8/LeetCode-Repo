class Solution{
    public boolean isSubsequence(String s, String t){
        int idxS = 0;
        int idxT = 0;
        int cnt = 0;
        if(s.length() == 0) return true;
        int len = t.length() - 1;
        while(idxT <= len && idxS < s.length()){
            if(s.charAt(idxS) == t.charAt(idxT)){
                idxS++;
                idxT++;
                cnt++;
            }else{
                idxT++;
            }
        }
        return cnt == s.length();
    }
}



// class Solution {
//     public boolean isSubsequence(String s, String t) {
//         int cntS = 0;
//         int cntT = 0;
//         int cnt = 0;
//         int lenT = t.length();
//         if(s.length() == 0){
//             return true;
//         }
//         while(--lenT >= 0){
//             char chS = s.charAt(cntS);
//             char chT = t.charAt(cntT);
//             if(chS == chT){
//                 cnt++;
//                 cntS++;
//                 cntT++;
//             }
//             else{
//                 cntT++;
//             }
//             if(cnt == s.length()) return true;
//         }
//         return false;
//     }
// }