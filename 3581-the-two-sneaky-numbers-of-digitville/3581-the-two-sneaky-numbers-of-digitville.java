class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        HashSet <Integer> hs = new HashSet<>();
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(hs.contains(nums[i])){
                arr[idx] = nums[i];
                idx++;
            }
            hs.add(nums[i]);
        }
        return arr;
    }
}