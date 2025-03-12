class Solution {
    public boolean isSubsequence(String s, String t) {
        int cntS = 0;
        int cntT = 0;
        int cnt = 0;
        int lenT = t.length();
        if(s.length() == 0){
            return true;
        }
        while(--lenT >= 0){
            char chS = s.charAt(cntS);
            char chT = t.charAt(cntT);
            if(chS == chT){
                cnt++;
                cntS++;
                cntT++;
            }
            else{
                cntT++;
            }
            if(cnt == s.length()) return true;
        }
        return false;
    }
}