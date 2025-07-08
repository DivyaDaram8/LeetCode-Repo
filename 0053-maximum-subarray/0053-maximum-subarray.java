class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxVal = nums[0];
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            maxVal = Math.max(sum, maxVal);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxVal;
    }
}