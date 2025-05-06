import java.util.Scanner;

public class BaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        String cislo = scanner.next();

        System.out.print("From which base: ");
        int fromBase = scanner.nextInt();

        System.out.print("To which base: ");
        int toBase = scanner.nextInt();

        try {
            int decimalValue = Integer.parseInt(cislo, fromBase);

            String result = Integer.toString(decimalValue, toBase);

            System.out.println("Result: " + result.toUpperCase());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number or base");
        }

        scanner.close();
    }
}