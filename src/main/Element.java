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
    public String toString() {
        return "" + value + " -> " + next;
    }
    
}
