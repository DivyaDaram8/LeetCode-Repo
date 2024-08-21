class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ele = 0;
        for(int i = 0; i< nums.length; i++){
            if(count == 0){
                count = 1;
                ele = nums[i];
            }
            else if( nums[i] == ele){
                count++;
            }
            else{
                count--;
            }
        }
        int countEle = 0;
        for(int i = 0; i < nums.length; i++){
            if(ele == nums[i])
            countEle++;
        } 
        if(countEle > (nums.length / 2))
            return ele;
        return -1;
    }
}