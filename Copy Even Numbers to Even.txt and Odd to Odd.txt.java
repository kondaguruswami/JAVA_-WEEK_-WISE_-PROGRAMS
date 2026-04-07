import java.io.*;

public class EvenOddFile {
    public static void main(String args[]) throws Exception {

        int arr[] = {1,2,3,4,5,6,7,8,9};

        FileWriter even = new FileWriter("Even.txt");
        FileWriter odd = new FileWriter("Odd.txt");

        for(int i : arr)
        {
            if(i % 2 == 0)
                even.write(i + " ");
            else
                odd.write(i + " ");
        }

        even.close();
        odd.close();

        System.out.println("Numbers copied to files");
    }
}