class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stk = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(x=='(' || x=='{' || x=='[')
            stk.push(x);
            else{
                if(stk.isEmpty()==true)
                return false;
                else if(isMatching(stk.peek(),x) == false)
                return false;
                else
                stk.pop();
            }
        } 
           return (stk.isEmpty()==true);
    }
    public boolean isMatching(char a,char b){
        return ((a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']'));
    }
}