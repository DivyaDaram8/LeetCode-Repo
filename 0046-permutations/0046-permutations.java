class Solution{
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result, new boolean[nums.length]);
        return result;
    }
    private void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> result, boolean[] used){
        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            temp.add(nums[i]);

            backtrack(nums, temp, result, used);

            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }
}
