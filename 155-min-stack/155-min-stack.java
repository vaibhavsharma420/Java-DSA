class MinStack {

    Stack<Integer> s = new Stack<>();
Stack<Integer> ss = new Stack<>();

public void push(int val) {
    s.push(val);
    if(ss.size() == 0 || val <= ss.peek()){
        ss.push(val);
    }
}

public void pop() {
    if(s.size()==0){
        return ;
    }
    int ans = s.peek();
    s.pop();
    if(ss.peek()==ans){
        ss.pop();
    }
}

public int top() {
    return s.peek();
}

public int getMin() {
    if(ss.size()==0){
        return -1;
    }
    return ss.peek();
}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */