class Solution {
    public int minimumOperations(int[][] grid) {
        int m = grid.length, n = grid[0].length, ans = 0;
        for (int i = 0; i < n; i++) {
            int prev = grid[0][i];
            for (int j = 1; j < m; j++) {
                if (prev >= grid[j][i]) {
                    ans += (prev - grid[j][i] + 1);
                    prev++;
                } else {
                    prev = grid[j][i];
                }
            }
        }
        return ans;
    }
}