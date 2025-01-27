class Solution {
    public int reverse(int x) {
        int n = x > 0 ? x : x * -1 ;
        long num = 0;
        while(n > 0){
            int rem = n % 10;
            num = num * 10 + rem;
            n /= 10;
        }
        
        if(num > Integer.MAX_VALUE || num < Integer.MIN_VALUE){
            return 0;
        }
        if(x > 0){
            return (int)num;
        }
        return (int)num * -1;
    }
}