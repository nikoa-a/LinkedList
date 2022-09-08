package main;

public class Element implements Node {

    private int value;
    private Node next;
    
    public Element(int value) {
        this.value = value;
        next = new End();
    }
    
    @Override
    public Node add(int value) {
        next = next.add(value);
        return this;
    }
    
    @Override
    public Node remove(int value) {
        if (this.value == value) {
            return next;
        }
        next = next.remove(value); 
        return this;
    }
    
    @Override
    public boolean find(int x) {
        if (x == value) {
            return true;
        }
        return next.find(x);
    }
    
    @Override
    public int get(int index, int current) {
        if (index == current) {
            return value;
        }
        return next.get(index, current + 1);
    }
     
    @Override
    public String toString() {
        return "" + value + " -> " + next;
    }
    
}
