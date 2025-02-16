class Solution {
    public int arrangeCoins(int n) {
        if (n == 1) return 1;  

        int row = 1; 
        
        while (n >= row) { 
            n -= row;
            row++;
        }

        return row - 1;  
    }
}
