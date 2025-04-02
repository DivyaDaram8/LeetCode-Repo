class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        Stack <Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch >= '0' && ch <= '9'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            sb.insert(0, st.pop());
        }
        return sb.toString();
    }
}