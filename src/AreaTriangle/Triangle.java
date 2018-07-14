package AreaTriangle;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 side triangle:");
        System.out.println("Enter side 1:");
        double side1 = scanner.nextDouble();
        System.out.println("Enter side 2:");
        double side2 = scanner.nextDouble();
        System.out.println("Enter side 3:");
        double side3 = scanner.nextDouble();

        if (isTriangle(side1, side2, side3)) {
            System.out.println("Area Triangle is: " + areaTriangle(side1,side2,side3));
        } else System.out.println("The Triangle is not exist.");
    }

    public static boolean isTriangle(double side1, double side2, double side3) {
        if ((side1+side2)<=side3||((side1+side3)<=side2)||((side2+side3)<=side1)) return false;
        else return true;
    }

    public static double areaTriangle(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2 * (s - side3)));
        return area;
    }
}
