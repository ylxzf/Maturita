import java.util.Scanner;

public class Trojuhelniky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadej stranu a: ");
        double a = sc.nextDouble();

        System.out.print("Zadej stranu b: ");
        double b = sc.nextDouble();

        System.out.print("Zadej stranu c: ");
        double c = sc.nextDouble();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Trojuhlenik nelze sestrojit.");
        } else if (a == b && b == c) {
            System.out.println("Rovnostranny trojuhelnik.");
        } else if (a == b || a == c || b == c) {
            if (isRightTriangle(a, b, c)) {
                System.out.println("Rovnoramenny a pravouhly trojuhelnik.");
            } else {
                System.out.println("Rovnoramenny trojuhelnik.");
            }
        } else if (isRightTriangle(a, b, c)) {
            System.out.println("Pravouhly trojuhelnik.");
        } else {
            System.out.println("Obecny trojuhelnik.");
        }
    }

    // Pomocna metoda na overeni pravoúhlosti (Pythagorova veta)
    public static boolean isRightTriangle(double a, double b, double c) {
        return almostEqual(a * a + b * b, c * c)
                || almostEqual(a * a + c * c, b * b)
                || almostEqual(b * b + c * c, a * a);
    }

    // Porovnani s toleranci kvuli zaokrouhleni
    public static boolean almostEqual(double x, double y) {
        double epsilon = 1e-6;
        return Math.abs(x - y) < epsilon;
    }
}
