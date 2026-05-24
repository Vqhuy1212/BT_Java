import java.util.Scanner;

public class DisplayShapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        while (choice != 4) {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("1. Top-left");
                    System.out.println("2. Top-right)");
                    System.out.println("3. Bottom-left");
                    System.out.println("4. Bottom-right");
                    System.out.print("Enter the corner: ");
                    int corner = scanner.nextInt();

                    switch (corner) {
                        case 1:
                            for (int i = 5; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            for (int i = 5; i >= 1; i--) {
                                for (int j = 1; j <= 5 - i; j++) {
                                    System.out.print("  ");
                                }
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            for (int i = 1; i <= 5; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            for (int i = 1; i <= 5; i++) {
                                for (int j = 4; j >= i; j--) {
                                    System.out.print("  ");
                                }
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        default:
                            System.out.println("No choice!");
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 4; i++) {
                        for (int j = 1; j <= 4 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
