class StockSpanner {
ArrayList<Integer> list;
Stack<Integer> st;
    public StockSpanner() {
        list = new ArrayList<>();

        st = new Stack<>();
        
    }
    
    public int next(int price) {
              list.add(price);

        while(!st.isEmpty() && list.get(st.peek()) <= price){
            st.pop();
        }
           int prevgI =  (st.isEmpty())?-1:st.peek();
           int ans = list.size() -prevgI -1;
           st.push(list.size() -1);
           return ans;
        

        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */