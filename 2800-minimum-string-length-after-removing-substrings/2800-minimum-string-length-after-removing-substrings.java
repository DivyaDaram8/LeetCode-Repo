class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            st.push(ch);
            if(st.size() >= 2){
                char topEle = st.pop();
                if((st.peek() == 'A' && topEle == 'B') ||
                     (st.peek() == 'C' && topEle == 'D')){
                        st.pop();
                }else{
                    st.push(topEle);
                }
            }
        }
        // StringBuilder sb = new StringBuilder();
        // while(!st.isEmpty()){
        //     sb.insert(0,st.pop());
        // }
        // return sb.toString().length();
        return st.size();
    }
}