class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] hashTable = new int[nums.length + 1];
        for(int num : nums){
            hashTable[num]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < hashTable.length; i++){
            if(hashTable[i] == 0){
                list.add(i);
            }
        }
        return list;
    }
}