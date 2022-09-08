package main;

public class LinkedList {

    private Node root;
    
    public LinkedList() {
        this.root = new End();
    }

    public void add(int value) {
        root = root.add(value);
    }

    public void remove(int value) {
        root = root.remove(value);
    }

    
    public boolean find(int x) {
        return root.find(x);
    }
    
    public int get(int index) {
        return root.get(index, 0);
    }
    
    @Override
    public String toString() {
        return "Start -> " + root;
    }
    
}
