class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                nums[i] = nums[i] * nums[i];
            }
            else{
                nums[i] = nums[i] * nums[i];
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}