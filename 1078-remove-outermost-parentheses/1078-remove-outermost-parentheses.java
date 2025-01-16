class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sf=new StringBuilder();
        int count=0;
        for(char i:s.toCharArray()){
            if(i =='('){
                if(count>0){
                    sf.append(i);
                }
              count++;
            }
            if(i==')'){
                count--;
                if(count>0){
                    sf.append(i);
                }
            }
        }
        return sf.toString();
    }
}