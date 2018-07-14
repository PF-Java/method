package CountTheLettersInAString;

import java.util.Scanner;

public class AString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string = scanner.nextLine();
        int count = countLetters(string);
        System.out.println(count + " letters");
    }
    public static int countLetters(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i)))
                count++;
        }
        return count;
    }
}
