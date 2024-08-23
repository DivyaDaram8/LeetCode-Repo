class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posInd = 0;
        int negInd = 1;
        int arr[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                arr[negInd] = nums[i];
                negInd += 2; 
            }
            else{
                arr[posInd] = nums[i];
                posInd += 2;
            }
        }   
        return arr;
    }
}