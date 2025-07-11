class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int sign = 1;
        long res = 0;

        while(i < n && s.charAt(i) == ' '){
            i++;
        }

        if(i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            sign = (s.charAt(i) == '-' ? -1 : 1);
            i++;
        }
        while(i < s.length()){
            char ch = s.charAt(i);
            if(ch < '0' || ch > '9') break;

            res = res * 10 + (ch - '0');
            if(sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int) (sign * res);
    }
}