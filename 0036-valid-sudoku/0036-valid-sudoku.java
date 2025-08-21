class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            int[] rowHash = new int[10];
            int[] colHash = new int[10];
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    int ele = board[i][j] - '0';
                    if(rowHash[ele] > 0){
                        return false;
                    }
                    rowHash[ele]++;
                }
                if(board[j][i] != '.'){
                    int ele = board[j][i] - '0';
                    if(colHash[ele] > 0){
                        return false;
                    }
                    colHash[ele]++;
                }
            }
        }
        for(int block = 0; block < 9; block++){
            int[] boxHash = new int[10];
            int rowStart = 3 * (block / 3);
            int colStart = 3 * (block % 3);

            for(int i = rowStart; i < rowStart + 3; i++){
                for(int j = colStart; j < colStart + 3; j++){
                    if(board[i][j] != '.'){
                        int num = board[i][j] - '0';
                        if(boxHash[num] > 0){
                            return false;
                        }
                        boxHash[num]++;
                    }
                }
            }
        }
        return true;
    }
}