class Solution {
    public int atMostKs(int[] nums, int k){
        int begin = 0;
        int cntOdd = 0;
        int res = 0;
        for(int end = 0; end < nums.length; end++){
            if(nums[end] % 2 == 1){
                cntOdd++;
            }
            while(cntOdd > k){
                int beginVal = nums[begin];
                if(beginVal % 2 == 1){
                    cntOdd--;
                }
                begin++;
            }
            res += end - begin + 1;
        }
        return res;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atMostKs(nums,k) - atMostKs(nums,k-1);
    }
}