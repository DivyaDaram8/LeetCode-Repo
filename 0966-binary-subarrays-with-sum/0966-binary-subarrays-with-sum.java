class Solution {
    public int atMostGoals(int[] nums, int goal){
        if(goal < 0){
            return 0;
        }
        int begin = 0;
        int sum = 0;
        int cnt = 0;
        for(int end = 0; end < nums.length; end++){
            sum += nums[end];
            while(sum > goal){
                sum -= nums[begin];
                begin++;
            }
            cnt += end - begin + 1;
        }
        return cnt;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
       return atMostGoals(nums, goal) - atMostGoals(nums, goal - 1);
    }
}