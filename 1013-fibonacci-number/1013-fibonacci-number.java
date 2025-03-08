class Solution {
    // public int fib(int n) {
    //     if ( n <= 1) return n;
    //     return fib(n - 1) + fib(n - 2);
    // }
    public int fib(int n){
        if ( n <= 1) return n;
        int num1 = 0;
        int num2 = 1;
        int temp = 0;
        for(int i = 2; i <= n; i++){
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        return temp;
    }
}