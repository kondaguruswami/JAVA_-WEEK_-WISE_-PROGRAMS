package pack1;

public class Base {
    protected int num = 100;
}

import pack1.Base;

class Derived extends Base {
    void display() {
        System.out.println("Protected value = " + num);
    }

    public static void main(String args[]) {
        Derived obj = new Derived();
        obj.display();
    }
}