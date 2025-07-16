// class Solution {
//     public int minInsertions(String s) {
//         int n = s.length();
//         int[][] dp = new int[n][n];

//         for(int len = 2; len <= n; len++){
//             for(int i = 0; i <= n - len; i++){
//                 int j = i + len - 1;

//                 if(s.charAt(i) == s.charAt(j)){
//                     dp[i][j] = dp[i + 1][j - 1];
//                 }else{
//                     dp[i][j] = 1 + Math.min(dp[i+1][j], dp[i][j - 1]);
//                 }
//             }
//         }
//         return dp[0][n - 1];
//     }
// }


class Solution {
    public int minInsertions(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        int n = s.length();

        int[][] dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == rev.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int lps = dp[n][n];
        return n - lps;
    }
}
