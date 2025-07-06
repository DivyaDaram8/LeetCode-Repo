// class Solution {
//     public List<String> summaryRanges(int[] nums) {
//         List<String> sol = new ArrayList<>();
//         int begin = 0;
//         int end = 1;
//         int counter = 0;
//         while(end < nums.length){
//             while(end < nums.length && nums[counter] + 1 == nums[end] ){
//                 end++;
//                 counter++;
//             }
//             if(end - begin == 1){
//                 sol.add(String.valueOf(nums[begin]));
//             }
//             else{
//                 sol.add(nums[begin]+"->"+nums[counter]);
//             }
//             begin = end;
//             counter = end;
//             end++;
//         }
//         if(begin == nums.length -1){
//             sol.add(String.valueOf(nums[begin]));
//         }
//         return sol;
//     }
// }
class Solution{
    public List<String> summaryRanges(int[] nums){
        List<String> ans = new ArrayList<>();
        int begin = 0;
        int end = 1;
        int counter = 0;
        while(end < nums.length){
            while(end < nums.length && nums[counter] + 1 == nums[end]){
                end++;
                counter++;
            }
            if(end - begin == 1){
                ans.add(String.valueOf(nums[begin]));
            }else{
                ans.add(nums[begin]+"->"+nums[counter]);
            }
            begin = end;
            counter = end;
            end++;
        }
        if(begin == nums.length - 1){
            ans.add(String.valueOf(nums[begin]));
        }
        return ans;
    }
}