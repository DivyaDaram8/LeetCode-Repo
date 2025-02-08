class Solution {
    public int addDigits(int num) {
        // return 1 + (num - 1) % 9;
        // return (num % 9 == 0 && num != 0) ? 9 : num % 9;
        while(num >= 10){
            int sum = 0;
            while(num > 0){
                sum += num % 10;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }
}