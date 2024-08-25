class Solution {
    public void nextPermutation(int[] nums) {
        int indx = -1;
        int indx2 = -1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                indx = i;
                break;
            }
        }
        if(indx == -1){
            reverse(nums,0);
        }
        else{
            for(int i = nums.length - 1; i >= 0; i--){
                if(nums[i] > nums[indx]){
                    indx2 = i;
                    break;
                }
            }
            swap(nums, indx, indx2);
            reverse(nums,indx+1);

        }
    }
    void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length -1;
        while(i < j){
            swap(nums, i , j);
            i++;
            j--;
        }
        
    }
}