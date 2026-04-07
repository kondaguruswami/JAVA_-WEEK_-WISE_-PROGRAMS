import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine().toLowerCase();

        boolean[] alphabet = new boolean[26];

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

        boolean pangram = true;

        for (boolean b : alphabet) {
            if (!b) {
                pangram = false;
                break;
            }
        }

        if (pangram)
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram");
    }
}