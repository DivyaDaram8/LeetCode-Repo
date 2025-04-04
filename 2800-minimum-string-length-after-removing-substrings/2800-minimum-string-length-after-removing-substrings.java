class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        // for(char ch : s.toCharArray()){
        //     st.push(ch);
        //     if(st.size() >= 2){
        //         char topEle = st.pop();
        //         if((st.peek() == 'A' && topEle == 'B') ||
        //              (st.peek() == 'C' && topEle == 'D')){
        //                 st.pop();
        //         }else{
        //             st.push(topEle);
        //         }
        //     }
        // }


        for(char ch : s.toCharArray()){
            if(!st.isEmpty() && ((ch == 'B' && st.peek() == 'A') || (ch == 'D' && st.peek() == 'C'))){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        return st.size();
    }
}