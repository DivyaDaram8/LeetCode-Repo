class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = i + 1; j < cols; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][rows - j - 1];
                matrix[i][rows - j - 1] = temp;
            }
        }
    }
}