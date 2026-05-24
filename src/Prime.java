import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        boolean isPrime = true;

        /*int i = 2;
        while (i <= Math.sqrt(num)) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }*/

        if (num < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.printf("%d is a prime!", num);
        } else {
            System.out.printf("%d is NOT a prime!", num);
        }
    }
}
