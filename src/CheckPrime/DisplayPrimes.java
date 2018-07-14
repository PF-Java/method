package CheckPrime;

public class DisplayPrimes {
    public static void main(String[] args) {
        System.out.println("Primers number less than 10000: ");
        for (int i = 2; i < 10000; i++) {
            if (checkPrime(i)) System.out.print(i + "\t");
        }
    }

    public static boolean checkPrime(int number) {
        boolean isPrime = true;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0 && i != 1) {
                return false;
            }
        }
        return isPrime;
    }

}
