class Solution {
    public boolean isPossible(int[] nums, int maxOperations,int mid){
        for(int i = 0; i < nums.length; i++){
            int  temp = nums[i] / mid;
            if(nums[i] % mid != 0){
                temp ++;
            }
            temp--;
            maxOperations -= temp;
            if(maxOperations < 0){
                return false;
            }
        }
        return true;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int begin = 1;
        int end = (int) Math.pow(10,9);
        while(begin <= end){
            int mid = begin + (end - begin) / 2;
            if(isPossible(nums, maxOperations, mid)){
                end = mid - 1;
            }
            else{
                begin = mid + 1;
            }
        }
        return begin;
    }
}