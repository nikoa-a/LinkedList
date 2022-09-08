package main;

public class Main {

    public static void main(String[] args) throws Exception {
        
        LinkedList list = new LinkedList();

        list.add(420);
        list.add(1);
        list.add(69);
        list.add(50);     
        list.add(3);
        System.out.println(list);
   
        System.out.println(list.find(1));
        System.out.println(list.find(666));

        System.out.println(list.get(3));

        list.remove(50);
        list.remove(1);

        System.out.println(list);
    }
    
}
