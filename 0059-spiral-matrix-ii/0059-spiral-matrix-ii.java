class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int top = 0;
        int right = n - 1;
        int bottom = n - 1;
        int left = 0;
        int cnt = 1;
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                res[top][i] = cnt++;
            }
            top++;
            for(int i = top; i <= bottom; i++){
                res[i][right] = cnt++;
            }
            right --;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    res[bottom][i] = cnt++;
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    res[i][left] = cnt++;
                }
                left++;
            }
        }
        return res;
    }
}