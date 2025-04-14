import java.util.Scanner;

public class PrevodSoustavManualne {
    public static int charToValue(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        } else {
            return c - 'A' + 10;
        }
    }

    public static char valueToChar(int val) {
        if (val >= 0 && val <= 9) {
            return (char) ('0' + val);
        } else {
            return (char) ('A' + val - 10);
        }
    }

    public static int toDecimal(String cislo, int zaklad) {
        int vysledek = 0;
        for (int i = 0; i < cislo.length(); i++) {
            int hodnota = charToValue(Character.toUpperCase(cislo.charAt(i)));
            vysledek = vysledek * zaklad + hodnota;
        }
        return vysledek;
    }

    public static String fromDecimal(int cislo, int zaklad) {
        String vysledek = "";
        do {
            int zbytek = cislo % zaklad;
            vysledek = valueToChar(zbytek) + vysledek;
            cislo /= zaklad;
        } while (cislo > 0);
        return vysledek;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadej cislo: ");
        String cislo = sc.next();

        System.out.print("Z jake soustavy: ");
        int zSoustavy = sc.nextInt();

        System.out.print("Do jake soustavy: ");
        int doSoustavy = sc.nextInt();

        int decimal = toDecimal(cislo, zSoustavy);
        String vysledek = fromDecimal(decimal, doSoustavy);

        System.out.println("Vysledek: " + vysledek);
    }
}
