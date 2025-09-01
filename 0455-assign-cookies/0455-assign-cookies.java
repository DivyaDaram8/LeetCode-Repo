class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int idx = 0;
        for(int i = 0; idx < g.length && i < s.length; i++){
            if(g[idx] <= s[i]){
                idx++;
            }
        }
        return idx;
    }
}