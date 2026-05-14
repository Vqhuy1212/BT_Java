import java.util.Scanner;

public class LinearEquationResolver {
    static void main() {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c'");
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        System.out.println("(" + a + ") * x + (" + b + ") = " + c);

        if (a != 0) {
            double result = (c - b) / a;
            System.out.printf("Equation pass with x = %.2f!\n", result);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
