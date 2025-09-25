class Solution {
    public int singleNonDuplicate(int[] nums) {
        int begin = 0;
        int end = nums.length - 1;
        while(begin < end){
            int mid = (begin + end) / 2;
            if((mid % 2 == 0 && nums[mid] == nums[mid + 1] || mid % 2 == 1 && nums[mid] == nums[mid - 1])){
                begin = mid + 1;
            }else{
                end = mid;
            }
        }
        return nums[begin];
    }
}