package main;

public class End implements Node {

    @Override
    public Node add(int value) {
        return new Element(value);       
    }

    @Override
    public Node remove(int value) {
        return this;
    }

    
    @Override
    public boolean find(int x) {
        return false;     
    }
    
    @Override
    public int get(int index, int current) {
        return -1;
    }
    
    @Override
    public String toString() {
        return "END";
    }
    
}
