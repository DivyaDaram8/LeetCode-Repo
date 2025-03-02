class Solution {
    public int[] sortedSquares(int[] nums) {
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] < 0){
        //         nums[i] = nums[i] * nums[i];
        //     }
        //     else{
        //         nums[i] = nums[i] * nums[i];
        //     }
        // }
        // Arrays.sort(nums);
        // return nums;
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[nums.length];
        for(int i = nums.length - 1; i >= 0; i--){
            if(Math.abs(nums[right]) > Math.abs(nums[left])){
                res[i] = nums[right] * nums[right];
                right--;
            }
            else{
                res[i] = nums[left] * nums[left];
                left++;
            }
        }
        return res;
    }
}