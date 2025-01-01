class Solution {
    public int maxDistance(int[] colors) {
        int dist = Integer.MIN_VALUE;
        for(int i = 0; i < colors.length; i++ ){
            for(int j = 0; j < colors.length; j++){
                if(colors[i] != colors[j]){
                    dist = Math.max(dist, j-i);
                }
            }            
        }
        return dist;
    }
}