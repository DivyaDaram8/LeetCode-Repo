class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();

        boolean[][] dp = new boolean[n + 1][m + 1];
        // Base case: empty string matches empty pattern
        dp[0][0] = true;

        for (int j = 1; j <= m; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                char sChar = s.charAt(i - 1);
                char pChar = p.charAt(j - 1);

                if (pChar == '.' || pChar == sChar) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pChar == '*') {
                    // Case 1: Zero occurrences of preceding element
                    dp[i][j] = dp[i][j - 2];

                    // Case 2: One or more occurrences
                    char prevChar = p.charAt(j - 2);
                    if (prevChar == '.' || prevChar == sChar) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                } else{
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }
}
