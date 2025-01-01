class Solution {
    public int maxDistance(int[] colors) {
        int dist1 = 0, dist2 = 0, start = 0, end = colors.length - 1;
        while(start <= end){
            if(colors[start] != colors[end]){
                dist1 = end - start;
                break;
            }
            end--;
        }
        start = 0;
        end = colors.length - 1;
        while(start <= end){
            if(colors[start] != colors[end]){
                dist2 = end - start;
                break;
            }
            start++;
        }
        return Math.max(dist1, dist2);
    }
}