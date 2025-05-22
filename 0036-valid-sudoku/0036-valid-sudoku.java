class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            int[] rowHash = new int[9];
            int[] colHash = new int[9];
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    int ele = board[i][j] - '1';
                    if(rowHash[ele] > 0){
                        return false;
                    }
                    rowHash[ele]++;
                }
                if(board[j][i] != '.'){
                    int ele = board[j][i] - '1';
                    if(colHash[ele] > 0){
                        return false;
                    }
                    colHash[ele]++;
                }
            }
        }
        for(int block  = 0; block < 9; block++){
            int[] boxHash = new int[9];
            int rowStart = 3 * (block / 3);
            int colStart = 3 * (block % 3);
            for(int i = rowStart; i < rowStart + 3; i++){
                for(int j = colStart; j < colStart + 3; j++){
                    if(board[i][j] != '.'){
                        int ele = board[i][j] - '1';
                        if(boxHash[ele] > 0){
                            return false;
                        }
                        boxHash[ele]++;
                    }
                }
            }
        }
        return true;
    }
}