import java.util.*;

public class ListExample {
    public static void main(String args[]) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("ArrayList: " + list);

        LinkedList<String> link = new LinkedList<>();
        link.add("Apple");
        link.add("Banana");
        link.add("Mango");

        System.out.println("LinkedList: " + link);
    }
}