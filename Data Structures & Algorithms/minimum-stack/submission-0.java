class MinStack {
    private Stack<Integer>input;
    private Stack<Integer>output;

    public MinStack() {
        input=new Stack<>();
        output=new Stack<>();   
    }
    
    public void push(int val) {
        input.push(val);
        if(output.isEmpty() || val<=output.peek()){
            output.push(val);
        }
    }
    
    public void pop() {
        int ans=input.pop();
        if(ans==output.peek()){
            output.pop();
        }
        
    }
    
    public int top() {
        return input.peek();
    }
    
    public int getMin() {
        return output.peek();
    }
}
