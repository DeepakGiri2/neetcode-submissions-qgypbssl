class MinStack {
    List<Integer> list;
    List<Integer> min; 
    public MinStack() {
        list = new ArrayList<>();
        min = new ArrayList<>();
    }
    
    public void push(int val) {
        list.add(val);
        if(min.isEmpty() || val < min.get(min.size()-1))
        {
            min.add(val);
        }
        else
        {
            min.add(min.get(min.size()-1));
        }
    }
    
    public void pop() {
        int lastindex = list.size() -1;
        list.remove(lastindex);
        min.remove(lastindex);
    }
    
    public int top() {
        int lastindex = list.size() -1;
        return list.get(lastindex);
    }
    
    public int getMin() {
        return min.get(min.size()-1);
    }
}
