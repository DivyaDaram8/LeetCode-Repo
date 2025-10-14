class Solution {
    public boolean isIdealPermutation(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length - 1; i++){
            if(max > nums[i + 1]){
                return false;
            }
            max = Math.max(nums[i], max);
        }
        return true;
    }
}