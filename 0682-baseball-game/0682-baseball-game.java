class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String ch : operations){
            if(ch.equals("+")){
                int prev1 = st.pop();
                int prev2 = st.pop();
                int sum = prev1 + prev2;
                st.push(prev2);
                st.push(prev1);
                st.push(sum);
            }else if(ch.equals("C")){
                st.pop();
            }else if(ch.equals("D")){
                st.push(st.peek() * 2);
            }
            else{
                st.push(Integer.valueOf(ch));
            }
        }
        int ans = 0;
        while(!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }
}