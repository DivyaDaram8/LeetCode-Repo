class Solution {
    public int majorityElement(int[] nums) {
//         HashMap<Integer, Integer> mp = new HashMap<>();
//         for( int i = 0; i < nums.length ; i++){
//             int value = mp.getOrDefault(nums[i],0);
//            mp.put(nums[i], value + 1);
//          }
//         for(Map.Entry<Integer, Integer> it : mp.entrySet()){
//             if(it.getValue() > (nums.length/2))
//             return it.getKey();
//         }
//         return -1;
//     }
// }
        int count = 0;
        int ele = 0;
        for(int i = 0; i< nums.length; i++){
            if(count == 0){
                count = 1;
                ele = nums[i];
            }
            else if( nums[i] == ele){
                count++;
            }
            else{
                count--;
            }
        }
        // int countEle = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(ele == nums[i])
        //     countEle++;
        // } 
        // if(countEle > (nums.length / 2))
            return ele;  

// //         // Arrays.sort(nums);
// //         // return nums[nums.length / 2];
// //         // return -1;
    }
}