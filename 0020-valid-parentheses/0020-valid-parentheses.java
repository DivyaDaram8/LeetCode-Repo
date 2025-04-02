class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else{
                if(!isTrue(st,ch)){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public boolean isTrue(Stack<Character> st, char ch){
        if(st.isEmpty()){
            return false;
        }
        char top = st.pop();
        if(ch == ')' && top != '('){
            return false;
        }
        else if(ch == ']' && top != '['){
            return false;
        }
        else if(ch == '}' && top != '{'){
            return false;
        }
        else return true;
    }
}