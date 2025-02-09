class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }
}
