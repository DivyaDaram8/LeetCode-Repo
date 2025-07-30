class Solution {
    public int divide(int dividend, int divisor) {

        if(dividend == Integer.MIN_VALUE && divisor == - 1){
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);

        long divd = Math.abs((long) dividend);
        long divs = Math.abs((long) divisor);
        int res = 0;

        while(divd >= divs){
            long temp = divs;
            int multiples = 1;
            while(divd >= (temp << 1)){
                temp <<= 1;
                multiples <<= 1;
            }
            divd -= temp;
            res += multiples;
        }
    return negative ? -res : res;
    }
}
