class MyStack {
    private Queue<Integer>qt;

    public MyStack() {
        qt=new LinkedList<>();    
    }
    
    public void push(int x) {
        qt.add(x);
        for(int i=1;i<qt.size();i++){
            qt.add(qt.remove());
        }
    }
    
    public int pop() {
        return qt.remove();
    }
    
    public int top() {
        return qt.peek();
    }
    
    public boolean empty() {
        return qt.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */