class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        for(int i = 0; i <= m; i++){
            if(matrix[i][0] <= target && matrix[i][n] >= target){
                for(int j = 0; j <= n; j++){
                    if(matrix[i][j] == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}