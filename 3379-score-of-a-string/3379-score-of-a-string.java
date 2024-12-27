class Solution {
    public int scoreOfString(String s) {
        int ans=0;
        for(int i = 0; i < s.length() - 1; i++){
            ans = ans + Math.abs(s.charAt(i+1) - s.charAt(i));
        }
        return ans;
    }
}