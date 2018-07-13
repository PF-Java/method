package SortInteger;

import java.util.Scanner;

public class SortInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        System.out.println("Enter number: ");
        int[] Integers = new int[size];
        for (int i = 0; i < Integers.length; i++) {
            Integers[i] = scanner.nextInt();
        }

        System.out.printf("List numbers Integer with %d elements: \n",size);
        displayIntegers(Integers);
        System.out.println("\nList numbers after sort: ");
        sortNumber(Integers);
        displayIntegers(Integers);
    }

    public static void sortNumber(int[] Integers) {
        for (int i = 0; i < Integers.length; i++) {
            int j;
            int current = Integers[i];
            for (j = i - 1; j >= 0 && current < Integers[j]; j--) {
                Integers[j + 1] = Integers[j];
            }
            Integers[j + 1] = current;
        }
    }

    public static void displayIntegers(int[] Integers) {
        for (int i = 0; i < Integers.length; i++) {
            System.out.print(Integers[i] + "\t");
        }
    }
}
