// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> list = new ArrayList<>();
//         Arrays.sort(nums);
//         int j, k;
//         for(int i = 0; i < nums.length - 2 ; i++){
//             if(i > 0 && nums[i] == nums[i - 1]) continue;
//             j = i + 1;
//             k = nums.length - 1;
//             while(j< k){
//                 int sum = nums[i] + nums[j] + nums[k];
//                 if(sum == 0){
//                     list.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                     j++;
//                     k--;
//                     while(j < k && nums[j] == nums[j - 1]) j++;
//                     while(j < k && nums[k] == nums[k + 1]) k--;
//                 }
//                 else if(sum > 0){
//                     k--;
//                 }
//                 else{
//                     j++;
//                 }
//             }
//         }
//         return list;
//     }
// }


class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int j, k;
        int len = nums.length;
        int sum;
        for(int i = 0; i < len - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            j = i + 1;
            k = len - 1;
            while(j < k){
                sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j - 1]){
                        j++;
                    }
                    while(j < k && nums[k] == nums[k + 1]){
                        k--;
                    }
                }else if(sum > 0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return ans;
    }
}