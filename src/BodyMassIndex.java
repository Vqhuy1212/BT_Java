import java.util.Scanner;

public class BodyMassIndex {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight (in kilogram): ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height (in meter): ");
        double height = scanner.nextDouble();

        double bmi = weight / Math.pow(height, 2); //(height * height)
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi >= 30.0) {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        } else if (bmi >= 25.0) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        } else if (bmi >= 18.5) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        }
    }
}
