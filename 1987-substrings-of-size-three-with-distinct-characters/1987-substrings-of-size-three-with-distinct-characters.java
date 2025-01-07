class Solution {
    public int countGoodSubstrings(String s) {
        int l = 0;
        int cnt = 0;
        for(int i = 0; i < s.length() ; i++){
            if(i - l + 1 == 3){
                if(s.charAt(l) != s.charAt(l+1) && s.charAt(l+1) != s.charAt(l+2) 
                && s.charAt(l+2) != s.charAt(l)){
                    cnt++;
                }
                 l++;
            }
           
        }
        return cnt;
    }
}