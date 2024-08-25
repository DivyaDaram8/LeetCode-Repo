class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if( n == 0)
            return 0;
        int maxCnt = 1;
        Set<Integer> set = new HashSet<>();
        for( int i = 0; i < n ; i++){
            set.add(nums[i]);
        }
        for(int i : set){
           if(!set.contains(i -1)){
            int cnt = 1;
            int ele = i;
            while(set.contains(ele + 1)){
                ele = ele + 1;
                cnt = cnt + 1;
            }
            maxCnt = Math.max(maxCnt, cnt);
           }
        }
        return maxCnt;
    }
}