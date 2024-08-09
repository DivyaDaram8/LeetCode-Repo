class Solution {
    public int missingNumber(int[] nums) {
        int len= nums.length;
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0;i < len ; i++){
            xor1 = xor1 ^ nums[i];
            xor2 = xor2 ^ (i+1);
        }
        
        return xor2 ^ xor1;
    }
}