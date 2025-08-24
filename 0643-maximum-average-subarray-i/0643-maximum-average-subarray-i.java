class Solution {
    public double findMaxAverage(int[] nums, int k){
        double sum = 0;
        double maxAvg = Integer.MIN_VALUE;
        int begin = 0;
        
        for(int end = 0; end < nums.length; end++){
            sum += nums[end];
            if(end - begin == k){
                sum -= nums[begin];
                begin++;
            }
            if(end - begin + 1 == k){
                double avg = sum / k;
                maxAvg = Math.max(avg, maxAvg);
            }
        }
        return maxAvg;
    }
}
