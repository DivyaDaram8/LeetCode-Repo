class Solution {
    public int maximumDifference(int[] nums) {
        //ans1
        // int sum = -1;
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1 ; j < nums.length; j++){
        //         if(nums[i] < nums[j]){
        //             sum = Math.max(sum, nums[j] - nums[i]);
        //         }
        //     }
        // }
        // return sum;

        //ans2
        // int sum = -1;
        // int mini = nums[0];
        // for(int i = 1; i < nums.length; i++){
        //     if(mini < nums[i]){
        //         sum = Math.max(sum, nums[i] - mini);
        //     }
        //     mini = Math.min(mini, nums[i]);
        // }
        // return sum;

        //ans3
        int min = Integer.MAX_VALUE;
        int diff = -1;
        for(int i : nums){
            if(i <= min ){
                min = i;
            }
            else{
                diff = Math.max(diff, i - min);
            }
        }
        return diff;
    }
}