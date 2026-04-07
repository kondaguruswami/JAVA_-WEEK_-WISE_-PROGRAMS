abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double r = 5;

    void area() {
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    int l = 10, b = 5;

    void area() {
        System.out.println("Area of Rectangle = " + (l * b));
    }
}

public class TestShape {
    public static void main(String[] args) {

        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}