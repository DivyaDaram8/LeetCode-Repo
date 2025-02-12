class Solution {
    public boolean isPossible(int[] weights, int days, int mid){
        int cnt = 0;
        for(int i = 0; i < weights.length; i++){
            int val = weights[i];
            if(val > mid) return false;
            if(cnt + val > mid){
                days -= 1;
                cnt = 0;
            }
            cnt += val;
            if(days <= 0){
                return false;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int begin = 0;
        int end = 0;
        for(int weight : weights){
            begin = Math.max(begin, weight);
            end += weight;
        }
        while(begin <= end){
            int mid = begin + (end - begin) / 2;
            if(isPossible(weights, days, mid)){
                end = mid - 1;
            }
            else{
                begin = mid + 1;
            }
        }
        return begin;
    }
}