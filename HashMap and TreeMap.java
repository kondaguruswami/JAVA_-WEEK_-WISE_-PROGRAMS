import java.util.*;

public class MapExample {
    public static void main(String args[]) {

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"Java");
        hm.put(2,"Python");

        System.out.println("HashMap: " + hm);

        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(3,"C");
        tm.put(4,"C++");

        System.out.println("TreeMap: " + tm);
    }
}