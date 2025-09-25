class Solution {
    public int removeDuplicates(int[] nums) {
        int pntr = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[pntr]){
                nums[pntr + 1] = nums[i];
                pntr++;
            } 
        }
        return pntr + 1;
    }
}