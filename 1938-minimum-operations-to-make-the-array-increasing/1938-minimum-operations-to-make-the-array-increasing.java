class Solution {
    public int minOperations(int[] nums) {
        int cnt = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] >= nums[i+1]){
                int cntTemp  = Math.abs(nums[i+1] - nums[i]) + 1;
                nums[i+1] = nums[i+1] + cntTemp;
                cnt += cntTemp;
            }
        }
        return cnt;
    }
}