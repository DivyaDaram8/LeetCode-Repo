class Solution {
    // public boolean isLessThanThreshold(int[] nums, int threshold, int mid){
    //     int sum = 0;
    //     for(int i = 0; i < nums.length; i++){
    //         int val = nums[i];
    //         val /= mid;
    //         if(nums[i] % mid != 0) val += 1;
    //         sum += val;
    //     }
    //     return sum <= threshold;
    // }

    public boolean isLessThanThreshold(int[] nums, int threshold, int mid){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += (nums[i] + mid - 1) / mid; 
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