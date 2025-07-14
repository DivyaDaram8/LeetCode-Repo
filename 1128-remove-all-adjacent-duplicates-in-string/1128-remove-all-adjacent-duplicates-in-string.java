// class Solution {
//     public String removeDuplicates(String s) {
//         Stack<Character> st = new Stack<>();
//         for(int i = 0; i < s.length(); i++){
//             if(!st.isEmpty() && st.peek() == s.charAt(i)){
//                 st.pop();
//             }else{
//                 st.push(s.charAt(i));
//             }
//         }
//         StringBuilder sb = new StringBuilder();
//         while(!st.isEmpty()){
//             sb.insert(0, st.pop());
//         }
//         return sb.toString();
//     }
// }

class Solution{
    public String removeDuplicates(String s){
        StringBuilder sb = new StringBuilder();
        int len;
        for(int i = 0; i < s.length(); i++){
            len = sb.length();
            if(len > 0 && sb.charAt(len - 1) == s.charAt(i)){
                sb.deleteCharAt(len - 1);
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}