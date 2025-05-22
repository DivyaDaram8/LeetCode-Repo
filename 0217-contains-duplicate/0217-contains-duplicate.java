// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashMap<Integer, Integer> hm = new HashMap<>();
//         for(int i = 0; i < nums.length; i++){
//             hm.put(nums[i], hm.getOrDefault(nums[i], 0) +1);
//             if(hm.get(nums[i]) > 1){
//                 return true;
//             }
//         }
//         return false;
//     }
// }
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}