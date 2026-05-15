import java.util.Scanner;

public class LeapYearCalculator {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        /*
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.printf("%d is a leap year!", year);
        } else {
            System.out.printf("%d is NOT a leap year!", year);
        }
        */

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d is a leap year!", year);
                } else {
                    System.out.printf("%d is NOT a leap year!", year);
                }
            } else {
                System.out.printf("%d is a leap year!", year);
            }
        } else {
            System.out.printf("%d is NOT a leap year!", year);
        }
    }
}
