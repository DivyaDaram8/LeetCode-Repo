class Solution {
    public int searchInsert(int[] nums, int target) {
        int begin = 0;
        int end = nums.length - 1;
        while (begin <= end) {
            int mid = end + (begin - end) / 2;
            if (nums[mid] < target) {
                begin = mid + 1;
            } else if (nums[mid] >= target) {
                end = mid - 1;
            }
        }
        return begin;
    }
}