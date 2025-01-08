class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums.length == 1) return 0;
        int min_diff = Integer.MAX_VALUE;
        int start = 0;
        for(int end = 0; end < nums.length; end++){
            if(end-start == k){
                start++;
            }
            if(end-start+1 == k){
                int temp_diff = nums[end] - nums[start];
                min_diff = Math.min(min_diff, temp_diff);
            }
        }
        return min_diff;
    }
}