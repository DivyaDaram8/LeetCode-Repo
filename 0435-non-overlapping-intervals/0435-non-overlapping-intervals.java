class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));
        int cnt = 0 ;
        int prevEnd = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(prevEnd <= intervals[i][0]){
                prevEnd = intervals[i][1];
            }else{
                cnt++;
            }
        }
        return  cnt;
    }
}