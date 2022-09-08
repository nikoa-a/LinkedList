package main;

public class LinkedList {

    private Node root;
    
    public LinkedList() {
        this.root = new End();
    }

    public void add(int value) {
        root = root.add(value);
    }

    @Override
    public String toString() {
        return "Start -> " + root;
    }
    
}
