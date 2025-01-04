class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet <Integer> hs = new HashSet<>();
        int repeated = -1;
        int missing = -1;
        for(int num : nums){
            if(hs.contains(num)){
                repeated = num;
            }
            hs.add(num);
        }
        for(int i = 1; i < nums.length + 1; i++){
            if(!hs.contains(i)){
                missing = i ;
            }
        }
        return new int[]{repeated,missing};
    }
}