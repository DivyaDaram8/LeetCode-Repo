class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int begin = 0;
        int end = 0;
        for(int ele : bloomDay) end = Math.max(end, ele);
        int tempEnd = end;
        while(begin <= end){
            int mid = begin + (end - begin) / 2;
            if(isPossible(bloomDay, m, k, mid)){
                end = mid - 1;
            }
            else{
                begin = mid + 1;
            }
        }
        if ( begin == tempEnd + 1){
            return -1;
        }
        return begin;
    }
    public boolean isPossible(int[] nums, int m, int k, int mid){
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(mid >= nums[i]){
            cnt++;
            }else{
                cnt = 0;
            }
            if(cnt == k){
                m -= 1;
                cnt = 0;
            }
            if(m == 0){
                return true;
            }
        }
        return false;
    }
}