import java.util.Scanner;

public class PrevodSoustavFunkce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadej cislo: ");
        String cislo = sc.next();

        System.out.print("Z jake soustavy: ");
        int zSoustavy = sc.nextInt();

        System.out.print("Do jake soustavy: ");
        int doSoustavy = sc.nextInt();

        try {
            int decimalValue = Integer.parseInt(cislo, zSoustavy);

            String vysledek = Integer.toString(decimalValue, doSoustavy);

            System.out.println("Vysledek: " + vysledek.toUpperCase());
        } catch (NumberFormatException e) {
            System.out.println("Neplatne cislo nebo soustava.");
        }
    }
}
