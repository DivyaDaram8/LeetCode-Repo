class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int idx1 = -1;
        int idx2 = -1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if( sum > target){
                right--;
            }
            else if(sum < target){
                left++;
            }
            else{
                idx1 = left + 1;
                idx2 = right + 1;
                return new int[]{idx1, idx2};
            }
        }
        return new int[]{};
    }
} 