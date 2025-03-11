class Solution {
    	public int projectionArea(int[][] grid) {
        int m = grid.length, totalArea = 0, xzMax, yzMax;

        for ( int i = 0; i < m; i++ ) {
            xzMax = 0; yzMax = 0;
            for ( int j = 0; j < m; j++ ) {
                xzMax = Math.max(xzMax, grid[i][j]);
                yzMax = Math.max(yzMax, grid[j][i]);
                if ( grid[i][j] > 0 ) totalArea += 1;
            }
            totalArea += xzMax + yzMax;
        }
        return totalArea;
    }
}