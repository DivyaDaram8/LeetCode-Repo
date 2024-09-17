class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        int preSum = 0, cnt = 0;
        for(int i = 0; i < nums.length; i++){
            preSum += nums[i];
            int remain = preSum - k;
            cnt += mp.getOrDefault(remain, 0);
            // if(mp.containsKey(preSum - k)){
            //     cnt += mp.get(preSum - k);
            // }
            mp.put(preSum, mp.getOrDefault(preSum, 0) + 1);

        }
        return cnt;
    }
}