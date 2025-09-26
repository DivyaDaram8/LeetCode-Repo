class Solution {
    public boolean isPossible(int[] nums, int maxOperations,int mid){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < mid){
                continue;
            }
            int parts = nums[i] / mid;
            int ops = 0;
            if(nums[i] % mid != 0){
                parts ++;
            }
            ops = parts;
            ops = parts - 1;
            maxOperations -= ops;
            if(maxOperations < 0){
                return false;
            }
        }
        return true;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int begin = 1;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(max, num);
        }
        int end = max;
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