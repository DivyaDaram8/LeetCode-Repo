class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] res = new int[2];
        res[0] = res[1] = -1;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int remNum = target - num;
            if(hm.containsKey(remNum)){
                res[0] = hm.get(remNum);
                res[1] = i;
            }
            hm.put(num, i);
        }
        return res;
    }
}