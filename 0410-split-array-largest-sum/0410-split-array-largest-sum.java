class Solution {
    public boolean isPossible(int[] nums, int k, int mid){
        int tempSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > mid){
                return false;
            }
            if(tempSum + nums[i] <= mid){
                tempSum += nums[i];
            }
            else{
                k -= 1;
                tempSum = nums[i];
            }
            if(k <= 0){
                return false;
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int begin = 0;
        int end = 0;
        for(int num : nums){
            end += num;
        }
        while(begin <= end){
            int mid = begin + (end - begin) / 2;
            if(isPossible(nums, k, mid)){
                end = mid - 1;
            }
            else{
                begin = mid + 1;
            }
        }
        return begin;
    }
}