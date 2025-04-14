import java.util.Scanner;

public class KvadratickaRovnice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadej a: ");
        double a = sc.nextDouble();

        System.out.print("Zadej b: ");
        double b = sc.nextDouble();

        System.out.print("Zadej c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("To neni kvadraticka rovnice.");
            return;
        }

        double D = b * b - 4 * a * c;

        System.out.println("Diskriminant D = " + D);

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Rovnice ma 2 realne koreny:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("Rovnice ma 1 realny dvojnasobny koren:");
            System.out.println("x = " + x);
        } else {
            double realnaCast = -b / (2 * a);
            double imaginarniCast = Math.sqrt(-D) / (2 * a);
            System.out.println("Rovnice ma 2 komplexni koreny:");
            System.out.println("x1 = " + realnaCast + " + " + imaginarniCast + "i");
            System.out.println("x2 = " + realnaCast + " - " + imaginarniCast + "i");
        }
    }
}
