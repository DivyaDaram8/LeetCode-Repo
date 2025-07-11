// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> st = new Stack<>();
//         for(char ch : s.toCharArray()){
//             if(ch == '(' || ch == '{' || ch == '['){
//                 st.push(ch);
//             }else if(ch == ')' && !(st.isEmpty())){
//                 if(st.pop() != '('){
//                     return false;
//                 }
//             }else if(ch == ']' && !(st.isEmpty())){
//                 if(st.pop() != '['){
//                     return false;
//                 }
//             }else if (ch == '}' && !(st.isEmpty())){
//                 if(st.pop() != '{'){
//                     return false;
//                 }
//             }else{
//                 return false;
//             }
//         }
//         return st.isEmpty();
//     }
// }

class Solution {
    public boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else if(ch == ')' && !(st.isEmpty())){
                if(st.pop() != '('){
                    return false;
                }
            }
             else if(ch == ']' && !(st.isEmpty())){
                if(st.pop() != '['){
                    return false;
                }
            } else if(ch == '}' && !(st.isEmpty())){
                if(st.pop() != '{'){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return st.isEmpty();
    }
} 