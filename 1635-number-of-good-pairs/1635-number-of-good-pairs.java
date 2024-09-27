class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        int res = 0;
        for(int i :hm.keySet()){
            int val = hm.get(i);
            int temp = (val *(val - 1))/2;
            res = res + temp;
        }
    return res;
    }
}