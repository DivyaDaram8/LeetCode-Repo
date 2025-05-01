class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));
        int cnt = 1;
        int prevEnd = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(prevEnd <= intervals[i][0]){
                cnt++;
                prevEnd = intervals[i][1];
            }
        }
        return intervals.length - cnt;
    }
}