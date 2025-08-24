class Solution {
    public int longestOnes(int[] nums, int k) {
        int begin = 0;
        int cnt = 0;
        int maxNums = Integer.MIN_VALUE;
        for(int end = 0; end < nums.length; end++){
            if(nums[end] == 0){
                cnt++;
            }
            while(cnt > k){
                if(nums[begin] == 0){
                    cnt -= 1;
                }
                begin++;
            }
            maxNums = Math.max(maxNums, end - begin + 1);
        }
        return maxNums;
    }
}