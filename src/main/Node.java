package main;

public interface Node {
    
    public Node add(int value);

    public Node remove(int value);

    public boolean find(int x);

    public int get(int index, int current);

    @Override
    public String toString();

}
