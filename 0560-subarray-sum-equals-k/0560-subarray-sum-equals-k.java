class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);
        int prefixSum = 0;
        int cnt = 0;
        for(int num : nums){
            prefixSum += num;

            if(mp.containsKey(prefixSum - k)){
                cnt += mp.get(prefixSum - k);
            }
            mp.put(prefixSum, mp.getOrDefault(prefixSum, 0) + 1);
        }
        return cnt;
    }
}