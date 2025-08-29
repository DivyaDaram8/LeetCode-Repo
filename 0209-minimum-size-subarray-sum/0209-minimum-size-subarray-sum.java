class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int begin = 0;
        int cnt = Integer.MAX_VALUE;
        int sum = 0;
        for(int end = 0; end < nums.length; end++){
            sum += nums[end];
            while(sum >= target){
                cnt = Math.min(cnt, end - begin + 1);
                sum -= nums[begin];
                begin++;
            }
        }
        return (cnt == Integer.MAX_VALUE) ? 0 : cnt;
    }
}