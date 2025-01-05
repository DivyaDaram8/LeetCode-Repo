class Solution {
    public boolean isValid(int[][] matrix, int x, int y){
        int rows = matrix.length;
        int cols = matrix[0].length; 
        int val = matrix[x][y];
        x++;
        y++;
        while(x < rows && y < cols){
            if(val != matrix[x][y]){
                return false;
            }
            x++;
            y++;
        }
        return true;
    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean ans = true;
        for(int i = 0; i < cols; i++){
            if(!isValid(matrix,0,i)){
                return false;
            }
        }
        for(int i = 1; i < rows; i++){
            if(!isValid(matrix,i,0)){
               return false;
            }
        }
        return true;

    }
}