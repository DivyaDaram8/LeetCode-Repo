class Solution {
    public double findMaxAverage(int[] nums, int k){
        double sum = 0;
        double maxAvg = Integer.MIN_VALUE;
        int start = 0;
        for(int end = 0; end < nums.length; end++){
            sum += nums[end];
            if(end - start == k){
                sum -= nums[start];
                start++;
            }
            if(end - start + 1 == k){
                double avg = sum / k;
                maxAvg = Math.max(maxAvg, avg);
            }
        }
        return maxAvg;
    }
}