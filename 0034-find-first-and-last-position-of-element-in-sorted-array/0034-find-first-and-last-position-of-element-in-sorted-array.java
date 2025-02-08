class Solution {
    public int leftMost(int[] nums, int target){
        if(nums.length == 0) return -1;
        int begin = 0;
        int end = nums.length - 1;
        while(begin <= end){
            int mid = end + (begin - end) / 2;
            if(nums[mid] < target){
                begin = mid + 1;
            }
            else if(nums[mid] >= target){
                end = mid - 1;
            }
        }
        if(begin >= nums.length){
            return -1;
        }
        if(nums[begin] != target){
            return -1;
        }
        return begin;
    }
    public int rightMost(int[] nums, int target){
        if(nums.length == 0) return -1;
        int begin = 0;
        int end = nums.length - 1;
        while(begin <= end){
            int mid = end + (begin - end) / 2;
            if(nums[mid] <= target){
                begin = mid + 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
        }
        if(end < 0){
            return -1;
        }
        if(nums[end] != target){
            return -1;
        }
        return end;
    }
    public int[] searchRange(int[] nums, int target) {
        int leftMost = leftMost(nums, target);
        int rightMost = rightMost(nums, target);
        int ans[] = {leftMost, rightMost};
        return ans;
    }
}