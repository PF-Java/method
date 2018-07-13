package ConvertFeetAndMeters;

import java.util.Scanner;

public class ConvertFeetAndMeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose = -1;
        double foot;
        double meter;

        do {
            System.out.println("Menu:");
            System.out.println("1. Convert Foot to Meter.");
            System.out.println("2. Convert Meter to Foot.");
            System.out.println("0. Exit.");
            System.out.println("Choose:");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Enter foot: ");
                    foot = scanner.nextDouble();
                    meter = footToMeters(foot);
                    System.out.printf("%.3f foot = %.3f meter\n",foot,meter);
                    break;
                case 2:
                    System.out.println("Enter meter: ");
                    meter = scanner.nextDouble();
                    foot = metersToFoot(meter);
                    System.out.printf("%.3f meter = %.3f food\n",meter,foot);
                    break;
                case 0:
                    break;
                    default:
                        System.out.println("Can't not choose number. Choose again");break;
            }
        } while (choose != 0);
    }

    public static double footToMeters(double foot) {
        double meters = foot * 0.305;
        return meters;
    }

    public static double metersToFoot(double meters) {
        double foot = meters * 3.279;
        return foot;
    }

}
