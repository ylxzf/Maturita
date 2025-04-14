import java.util.*;

public class Uhly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Zadej úhel: ");
        double uhel = scan.nextDouble();

        double zakladniUhel;

        if (uhel >= 0) {
            zakladniUhel = uhel % 360;
            System.out.println("Základní úhel je: " + zakladniUhel);
        } else {
            double tempUhel = uhel;

            while (tempUhel < -360) {
                tempUhel += 360;
            }

            zakladniUhel = 360 + tempUhel;

            System.out.println("Základní úhel je: " + zakladniUhel);
        }
    }
}