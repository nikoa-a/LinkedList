package main;

public class End implements Node {

    @Override
    public Node add(int value) {
        return new Element(value);       
    }

    @Override
    public String toString() {
        return "END";
    }

}
