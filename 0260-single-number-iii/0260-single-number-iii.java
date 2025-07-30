class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            xor ^= nums[i];
        }

        int diffBit = xor & -xor;
        int a = 0;
        int b = 0;
        for(int i = 0; i < nums.length; i++){
            if((nums[i] & diffBit) != 0){
                a ^= nums[i];
            }else{
                b ^= nums[i];
            }
        }
        return new int[]{a, b};
    }
}