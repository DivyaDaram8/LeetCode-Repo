class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // int len = nums.length;
        // int[] res = new int[len];
        // List <Integer> arr = new ArrayList<>();
        // for(int num : nums){
        //     arr.add(num);
        // }
        // Collections.sort(arr);
        // for(int i = 0; i < len; i++){
        //     res[i] = arr.indexOf(nums[i]);
        // }
        // return res;

        int len = nums.length;
        int[] arr = nums.clone();
        Arrays.sort(arr);
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] res = new int[len];
        for(int i = 0; i < len; i++){
            hm.putIfAbsent(arr[i], i);
        }
        for(int i = 0; i < len; i++){
            res[i] = hm.get(nums[i]);
        }
        return res;
    }
}