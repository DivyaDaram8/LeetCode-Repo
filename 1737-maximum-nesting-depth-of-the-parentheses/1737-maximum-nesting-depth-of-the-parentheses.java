class Solution {
    public int maxDepth(String s) {
        Stack <Character> st = new Stack<>();
        int max = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
            }else if(ch == ')'){
                st.pop();
            }else{
                continue;
            }
            max = Math.max(max, st.size());
        }
        return max;
    }
}