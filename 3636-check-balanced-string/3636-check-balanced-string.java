class Solution {
    public boolean isBalanced(String num) {
        int cntOdd = 0;
        int cntEven = 0;
        for(int i = 0; i < num.length(); i+=2){
            cntEven += num.charAt(i) - '0';
        }
        for(int i = 1; i < num.length(); i+=2){
            cntOdd += num.charAt(i) - '0';
        }
        return cntOdd == cntEven;        
    }
}