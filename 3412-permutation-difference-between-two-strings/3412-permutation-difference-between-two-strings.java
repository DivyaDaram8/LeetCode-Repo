class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum = 0;
        for(char ch : s.toCharArray()){
            sum += Math.abs(s.indexOf(ch) - t.indexOf(ch));
        }
        return sum;
    }
}