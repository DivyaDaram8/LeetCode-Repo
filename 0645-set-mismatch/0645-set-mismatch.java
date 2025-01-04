class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] frequency = new int[n + 1]; 
        int repeated = -1;
        int missing = -1;

        for (int num : nums) {
            frequency[num]++;
        }
        for (int i = 1; i <= n; i++) {
            if (frequency[i] == 2) {
                repeated = i;
            } else if (frequency[i] == 0) {
                missing = i;
            }
        }

        return new int[]{repeated, missing};
    }
}
