// class Solution {
//     public boolean isMatch(String s, String p) {
//         int n = s.length();
//         int m = p.length();
//         boolean[][] dp = new int[n+1][m+1];
//         dp[0][0] = true;
//         for(int i = 1; i <= n; i++){
//             dp[i][0] = false;
//         }
//         for(int j = 1; j <= m; j++){
//             if(p.charAt(j-1) == '*'){
//                 dp[0][j] = dp[0][j-1];
//             }
//         }
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= m; j++){
//                 if(p.charAt(j-1) == s.charAt(i-1) || p.charAt(j-1) == '?'){
//                     dp[i][j] = dp[i-1][j-1];
//                 }else if(p.charAt(j-1) == '*'){
//                     dp[i][j] = dp[i][j-1] || dp[i-1][j];
//                 }else{
//                     dp[i][j] = false;
//                 }
//             }
//         }
//         return dp[n][m];
//     }
// }

class Solution{
    public boolean isMatch(String s, String p){
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;
        for(int i = 1; i <= n; i++){
            dp[i][0] = false;
        }
        for(int j = 1; j <= m; j++){
            if(p.charAt(j - 1) == '*'){
                dp[0][j] = dp[0][j - 1];
            }
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?'){
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else if(p.charAt(j -1) == '*'){
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                }
                else{
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }
}

// class Solution {
//     public boolean isMatch(String s, String p) {
//         int n = s.length();
//         int m = p.length();
//         Boolean[][] memo = new Boolean[n+1][m+1];
//         return match(s, p, n, m, memo);
//     }

//     private boolean match(String s, String p, int i, int j, Boolean[][] memo) {
//         // Base cases
//         if (i == 0 && j == 0) return true;
//         if (j == 0) return false;
//         if (i == 0) {
//             for (int k = 1; k <= j; k++) {
//                 if (p.charAt(k - 1) != '*') return false;
//             }
//             return true;
//         }

//         // Memoization check
//         if (memo[i][j] != null) return memo[i][j];

//         char chS = s.charAt(i - 1);
//         char chP = p.charAt(j - 1);

//         boolean ans;

//         if (chP == chS || chP == '?') {
//             ans = match(s, p, i - 1, j - 1, memo);
//         } else if (chP == '*') {
//             // '*' matches empty or any one character
//             ans = match(s, p, i - 1, j, memo) || match(s, p, i, j - 1, memo);
//         } else {
//             ans = false;
//         }

//         return memo[i][j] = ans;
//     }
// }
