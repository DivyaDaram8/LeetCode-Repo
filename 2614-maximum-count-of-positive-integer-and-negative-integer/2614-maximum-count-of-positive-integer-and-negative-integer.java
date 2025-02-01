class Solution {
    public int maximumCount(int[] nums) {
        // int begin = 0;
        // int end = nums.length - 1;
        // while(begin <= end){
        //     int mid = end + (begin - end)/2;
        //     if(nums[mid] < 0){
        //         begin = mid + 1;
        //     }
        //     else end = mid - 1;
        // } 
        // int neg = end + 1;

        // begin = 0;
        // end = nums.length - 1;
        // while(begin <= end){
        //     int mid = end + (begin - end)/2;
        //     if(nums[mid] > 0){
        //         end = mid - 1;
        //     }
        //     else{
        //         begin = mid + 1;
        //     }
        // }
        // int pos = nums.length - begin;
        // return Math.max(neg,pos);
        int neg = 0;
        int pos = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0 ){
                neg++;
            }
            else if(nums[i] > 0){
                pos++;
            }
        }
        return Math.max(neg,pos);
    }
}