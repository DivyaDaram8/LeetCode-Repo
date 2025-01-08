class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int min = 0;
        int ans = 0;
        for(int end = 1; end < nums.length; end+=2){
            min = Math.min(nums[start],nums[end]);
            ans+= min;
            start+=2;
        }
        return ans;
    }
}