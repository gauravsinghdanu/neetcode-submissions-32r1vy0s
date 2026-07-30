class StockSpanner {
    public List<Integer>li;

    public StockSpanner() {
        li=new ArrayList<>();    
    }
    
    public int next(int price) {
        li.add(price);
        int span=1;
        int i=li.size()-2;
        while(i>=0 && li.get(i)<=price){
            span++;
            i--;
        }
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */