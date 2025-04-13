class StockSpanner {
    Stack<Integer> stack;
    ArrayList <Integer> stocks;
    int i ;
    public StockSpanner() {
        stack = new Stack<>();
        stocks = new ArrayList<>();
        i = - 1;
    }
    
    public int next(int price) {
        i++;
        stocks.add(price);
        while(!stack.isEmpty() && stocks.get(i) >= stocks.get(stack.peek())){
            stack.pop();
        }
        int span = stack.isEmpty() ? i + 1 : i - stack.peek();
        stack.push(i);
        return span; 
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */