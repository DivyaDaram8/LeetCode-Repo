// class Solution {
//     public boolean isPalindrome(String s) {
//          s = s.toLowerCase();
//         StringBuilder sb = new StringBuilder();
//         for(char ch : s.toCharArray()){
//             if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
//                 sb.append(ch);
//             }
//         }
//         sb.toString().toCharArray();
//         int left = 0;
//         int right = sb.length() - 1;
//         while(left < right){
//             if(sb.charAt(left) != sb.charAt(right)){
//                 return false;
//             }
//             else{
//                 left++;
//                 right--;
//             }
//         }
//         return true;
//     }
// }

class Solution{
    public boolean isPalindrome(String s){
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        char ch;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                sb.append(ch);
            }
        }
        sb.toString().toCharArray();
        int start = 0;
        int end = sb.length() - 1;
        while(start < end){
            if(sb.charAt(start) != sb.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}