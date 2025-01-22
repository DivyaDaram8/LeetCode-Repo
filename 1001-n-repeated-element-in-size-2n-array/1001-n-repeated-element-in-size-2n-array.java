class Solution {
    public int repeatedNTimes(int[] nums) {
        // HashMap<Integer, Integer> hm = new HashMap<>();
        // for(int num : nums){
        //     hm.put(num, hm.getOrDefault(num,0) + 1);
        // }
        // for(int key : hm.keySet()){
        //     if(hm.get(key) == nums.length/2){
        //         return key;
        //     }
        // }
        // return -1;
        HashMap <Integer, Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
            if(hm.get(num) == 2){
                return num;
            }
        }
        return -1;
    }
}