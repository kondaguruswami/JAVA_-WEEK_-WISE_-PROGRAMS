// File: pack1/Addition.java
package pack1;

public class Addition {
    public int add(int a, int b) {
        return a + b;
    }
}
// File: TestPackage.java
import pack1.Addition;

public class TestPackage {
    public static void main(String args[]) {
        Addition obj = new Addition();
        System.out.println("Sum = " + obj.add(10, 20));
    }
}