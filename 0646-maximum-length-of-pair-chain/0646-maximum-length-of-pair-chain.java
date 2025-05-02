class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));
        int prevEnd = pairs[0][1];
        int cnt = 1;
        for(int i = 1; i < pairs.length; i++){
            if(pairs[i][0]  > prevEnd){
                cnt++;
                prevEnd = pairs[i][1];
            }
        }
        return cnt;
    }
}