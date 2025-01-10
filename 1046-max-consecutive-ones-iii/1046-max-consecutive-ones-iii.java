class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int temp = 0;
        int ans = 0;
        int start = 0;
        for(int end = 0; end < n; end++){
            if(nums[end] == 0){
                temp+=1;
            }
            while(temp > k){
                if(nums[start] == 0){
                    temp -= 1;
                }
                start++;
            }
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }
}