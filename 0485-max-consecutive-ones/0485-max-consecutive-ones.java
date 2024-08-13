class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countTemp=0;
        int countMain=0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1)
                countTemp ++;
            else{
                countTemp=0;
        }
            countMain = Math.max(countMain,countTemp);
        }
        return countMain;
    }
}