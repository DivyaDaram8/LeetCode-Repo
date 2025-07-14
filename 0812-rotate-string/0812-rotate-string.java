// class Solution {
//     public boolean rotateString(String s, String goal) {
//         if(s.length() != goal.length()){
//             return false;
//         }
//         for(int i = 0; i < s.length(); i++){
//             String rotated = rotation(s, i);
//             if(rotated.equals(goal)){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public String rotation(String s, int idxG){
//         char[] chars = s.toCharArray();

//         reverse(chars, 0, chars.length - 1);
//         reverse(chars, 0, chars.length - idxG - 1);
//         reverse(chars, chars.length - idxG, chars.length -1);

//         return new String(chars);
//     }
//     public void reverse(char[] chars, int start, int end){
//         char temp;
//         while(start < end){
//             temp = chars[start];
//             chars[start] = chars[end];
//             chars[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }

class Solution{
    public boolean rotateString(String s, String goal){
        return (s.length() == goal.length()) && (s + s).contains(goal);
    }
}