class Solution {
    public int calcs(int a, int b, char operator){
        if (operator == '+') return a + b;
        else if(operator == '-') return a - b;
        else if (operator == '*') return a * b;
        return a / b;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if(token.length() == 1 && token.charAt(0) < '0'){
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = calcs(num1, num2, token.charAt(0));
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}