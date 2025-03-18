class Solution {
    public boolean squareIsWhite(String coordinates) {
        // int sum = 0;
        // for(char ch : coordinates.toCharArray()){
        //     sum += (int) ch;
        // }
        // if((sum & 1) == 1) return true;
        // else return false; 
        int var1 = (int) coordinates.charAt(0);
        int var2 = (int) coordinates.charAt(1);
        return ((var1 + var2) % 2 ) != 0;
    }
}