import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rate = 23000; //23000 VND/USD

        System.out.println("Enter the amount in USD:");
        double usd = scanner.nextDouble();

        double vnd = usd * rate;

        System.out.printf("Converted amount in VND: %.1f", vnd);
    }
}
