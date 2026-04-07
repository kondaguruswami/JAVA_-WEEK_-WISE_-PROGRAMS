public class MultipleCatch {
    public static void main(String args[]) {

        try {
            int a = 10/0;
            int b[] = new int[5];
            b[10] = 50;
        }

        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception");
        }

        finally {
            System.out.println("Finally block executed");
        }
    }
}