class Solution {
    public String convertToTitle(int columnNumber) {
        char[] alpha = new char[27];
        char ch = 'A';
        for(int i = 1; i <= 26 ; i++){
            alpha[i] = ch;
            ch++;
        }
        int num = columnNumber;
        StringBuilder res = new StringBuilder();
        while(num > 0){
            int rem = num % 26;
            if(rem == 0){
                res.append(alpha[26]);
                num = (num/26) -1;
            }
            else{
                res.append(alpha[rem]);
                num /= 26;
            }
        }
        return res.reverse().toString();
    }
}