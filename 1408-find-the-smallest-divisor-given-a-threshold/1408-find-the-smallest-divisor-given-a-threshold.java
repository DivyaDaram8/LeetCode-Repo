class Solution {
    public boolean isLessThanThreshold(int[] nums, int threshold, int mid){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            int temp = val / mid;
            if(val % mid != 0) temp += 1;
            sum += temp;
        }
        return sum <= threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int begin = 1;
        int end = (int)Math.pow(10,6);
        while(begin <= end){
            int mid = begin + (end - begin) / 2;
            if(isLessThanThreshold(nums,threshold, mid)){
                end = mid - 1;
            }
            else{
                begin = mid + 1;
            }
        }
        return begin;
    }
}