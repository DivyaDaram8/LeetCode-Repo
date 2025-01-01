class Solution {
    public int maximumDifference(int[] nums) {
        int sum = -1;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1 ; j < nums.length; j++){
                if(nums[i] < nums[j]){
                    sum = Math.max(sum, nums[j] - nums[i]);
                }
            }
        }
        return sum;
    }
}