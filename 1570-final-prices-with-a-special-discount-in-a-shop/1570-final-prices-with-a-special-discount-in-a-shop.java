class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() > prices[i]) {
                st.pop();
            }

            int discount = st.isEmpty() ? 0 : st.peek();
            st.push(prices[i]);
            prices[i] -= discount;
        }

        return prices;
    }
}
