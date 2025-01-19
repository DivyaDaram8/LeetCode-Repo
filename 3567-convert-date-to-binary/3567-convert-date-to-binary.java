class Solution {
    public String bin(String s){
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for(char ch : s.toCharArray()){
            num = num * 10 + (ch - '0');
        }
        while(num > 0){
            sb.insert(0, (num % 2 == 0 ? "0" : "1"));
            num /= 2;
        }
        return sb.toString();
    }
    public String convertDateToBinary(String date) {
        return bin(date.substring(0,4)) + "-" + bin(date.substring(5,7)) + "-" + bin(date.substring(8,10));
    }
}