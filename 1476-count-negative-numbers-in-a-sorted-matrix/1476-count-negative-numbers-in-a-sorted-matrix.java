class Solution {
    public int countNegatives(int[][] grid) {
        int cnt = 0;
        for(int i = 0; i < grid.length; i++){
            int begin = 0;
            int end = grid[i].length - 1;
            while(begin <= end){
                int mid = end + (begin - end)/2;
                if(grid[i][mid] >= 0){
                    begin = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            cnt += grid[i].length - begin;
        }
        return cnt;
    }
}