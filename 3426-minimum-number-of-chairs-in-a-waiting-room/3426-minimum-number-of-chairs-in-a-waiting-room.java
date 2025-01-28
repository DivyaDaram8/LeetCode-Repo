class Solution {
    public int minimumChairs(String s) {
        int res = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'E'){
                res++;
                max = Math.max(max,res);
            } 
            else{
                res--;
            }
        }
        return max;
    }
}