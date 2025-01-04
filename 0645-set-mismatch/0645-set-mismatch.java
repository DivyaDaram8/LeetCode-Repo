class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] frequency = new int[n + 1]; // Frequency array for numbers 1 to n
        int repeated = -1;
        int missing = -1;

        // Count the frequency of each number in nums
        for (int num : nums) {
            frequency[num]++;
        }

        // Identify repeated and missing numbers
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
