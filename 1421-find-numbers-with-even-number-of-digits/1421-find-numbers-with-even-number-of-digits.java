class Solution {
    public int findNumbers(int[] nums) {
         int count=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int ele = (int) (Math.log10(num)+1);
            if(ele % 2 == 0){
                count++;
            }
        }
        return count;
        
    }
}