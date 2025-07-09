class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int start = 0;
        int end = 1;
        int temp;
        while(start < len && end < len){
            if(nums[start] == 0){
                while(end < len && nums[end] == 0){
                    end++;
                }
                if(end < len){
                    temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                }
            }
            start++;
            end++;
        }
    }
}