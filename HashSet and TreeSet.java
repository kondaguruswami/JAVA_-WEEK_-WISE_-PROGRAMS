import java.util.*;

public class SetExample {
    public static void main(String args[]) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);

        System.out.println("HashSet: " + hs);

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(15);
        ts.add(25);

        System.out.println("TreeSet: " + ts);
    }
}