class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int indx = -1;
        for(int i = 0; i < nums.length; i++){
            if( nums[i] > 0){
                int ele = nums[i] - 0;
                if(ele <= min){
                min = ele;
                indx = i;
            }
            }
            else{
                int ele2 = 0 - nums[i];
                if(ele2 < min){
                    min = ele2;
                    indx = i;
                }
            }
        }
        return nums[indx];
    }
}