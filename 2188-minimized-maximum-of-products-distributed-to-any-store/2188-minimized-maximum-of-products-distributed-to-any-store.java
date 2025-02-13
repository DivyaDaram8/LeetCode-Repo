class Solution {
    public boolean isPossible(int[] nums, int n, int mid){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += (nums[i] + mid - 1) / mid;
        }
        return sum <= n;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int begin = 1;
        int end = Integer.MIN_VALUE;
        for(int ele : quantities){
            end = Math.max(end, ele);
        }
        while(begin <= end){
            int mid = begin + (end - begin) / 2;
            if(isPossible(quantities, n, mid)){
                end = mid - 1;
            }
            else{
                begin = mid + 1;
            }
        }
        return begin;
    }
}