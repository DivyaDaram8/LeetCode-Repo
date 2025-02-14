class Solution {
    public boolean isPossible(int[] nums, int m, int dist){
        int prev = nums[0];
        int cnt = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - prev >= dist){
                m -= 1;
                prev = nums[i];
            }
            if(m == cnt){
                return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int begin =  1;
        int end = position[position.length - 1] - position[0];
        while(begin <= end){
            int mid = begin + (end - begin) / 2;
            if(isPossible(position, m, mid)){
                begin = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return end;
    }
}