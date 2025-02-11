class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int begin = 1;
        int end = piles[0];
        for(int pile : piles){
            end = Math.max(end, pile);
        }
        while(begin <= end){
            int mid = begin + (end - begin) /2;
            if(eats(piles, h, mid)){
                end = mid - 1;
            }
            else{
                begin = mid + 1;
            }
        }
        return begin;
    }
    public boolean eats(int[] piles, int h, int mid){
        int sum = 0;
         for (int pile : piles) {
            sum += Math.ceil((double) pile /(double) mid); 
        }
        return sum <= h;
    }
}