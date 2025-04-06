class Solution {
    int resolves(int a, int b, char operator) {
        if (operator == '+') return a + b;
        else if (operator == '-') return a - b;
        else if (operator == '*') return a * b;
        return a / b; // Division truncates toward zero by default in Java
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (token.length() == 1 && token.charAt(0) < '0') {
                int b = stack.pop();
                int a = stack.pop();
                int result = resolves(a, b, token.charAt(0));
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.pop();
    }
}
