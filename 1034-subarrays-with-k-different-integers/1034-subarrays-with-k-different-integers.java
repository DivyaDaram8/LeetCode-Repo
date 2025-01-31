class Solution {
    public int atMostK(int[] nums, int k){
        int begin = 0;
        int cnt = 0;
        HashMap <Integer, Integer> hm = new HashMap<>();
        for(int end = 0; end < nums.length; end++){
            hm.put(nums[end], hm.getOrDefault(nums[end], 0) + 1);
            while(hm.size() > k){
                int beginVal = nums[begin];
                hm.put(beginVal, hm.get(beginVal) - 1);
                if(hm.get(beginVal) == 0){
                    hm.remove(beginVal);
                }
                begin++;
            }
            cnt += end - begin ;
        }
        return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k -1);
    }
}