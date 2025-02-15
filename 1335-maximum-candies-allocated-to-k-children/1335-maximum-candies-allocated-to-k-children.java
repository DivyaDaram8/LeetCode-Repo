class Solution {
    public boolean isPossible(int[] candies, long k, int mid){
        for(int i = 0; i < candies.length; i++){
            int val = candies[i] / mid;
            k -= val;
            if(k <= 0){
                return true;
            }
        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
        int begin = 1;
        int end = 0;
        for(int ele : candies){
            end = Math.max(end, ele);
        }
        while(begin <= end){
            int mid = begin + (end - begin) / 2;
            if(isPossible(candies, k, mid)){
                begin = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return end;
    }
}