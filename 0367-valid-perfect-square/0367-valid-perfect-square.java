class Solution {
    public boolean isPerfectSquare(int num) {
        long begin = 1;
        long end = num;
        while(begin <= end){
            long mid = begin + (end - begin) / 2;
            long sq = mid * mid;
            if(sq == num){
                return true;
            }else if(sq > num){
                end = mid - 1;
            }else{
                begin = mid + 1;
            }
        }
        return false;
    }
}