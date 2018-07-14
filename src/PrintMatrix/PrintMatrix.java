package PrintMatrix;

import java.util.Random;
import java.util.Scanner;

public class PrintMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        System.out.printf("Matrix %d - %d:\n", n, n);
        printMatrix(n);
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               Random random = new Random();
                int rd = random.nextInt(2);
                System.out.print(rd + "\t");
            }
            System.out.println();
        }
    }
}


