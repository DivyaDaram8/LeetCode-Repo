class Solution {
    public int findMin(int[] nums) {
        int begin = 0;
        int end = nums.length - 1;
        if(nums[begin] < nums[end]){
            return nums[begin];
        }
        while(begin <= end){
            int mid = begin + (end - begin) / 2;
            if(mid > 0 && nums[mid] < nums[mid - 1]){
                return nums[mid];
            }else if(nums[mid] > nums[end]){
                begin = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return nums[begin];
    }
}