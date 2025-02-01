class Solution {
    public int idx(int[] nums, int target){
        int begin = 0;
        int end = nums.length-1;
        while(begin <= end){
            int mid = end + (begin - end) /2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                begin = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return idx(nums, target);
    }
}