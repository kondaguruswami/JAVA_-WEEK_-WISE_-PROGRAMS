import java.util.Scanner;

public class FrequentChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        int count[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        int max = -1;
        char result = ' ';

        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] > max) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        System.out.println("Most frequent character: " + result);
    }
}