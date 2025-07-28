class Solution {
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            if((n & 1) == 1){
                sb.append('1');
            }else{
                sb.append('0');
            }
            n = n >> 1;
        }

        while(sb.length() < 32){
            sb.append('0');
        }

        String str = sb.toString();
        long num = Long.parseLong(str, 2);
        return (int)num;
    }
}