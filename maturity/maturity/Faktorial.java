import java.util.Scanner;

public class FaktorialIterativne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadej cislo: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Faktorial nelze spocitat (zaporne cislo).");
            return;
        }

        long faktorial = 1;

        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }

        System.out.println(n + "! = " + faktorial);
    }
}

import java.util.Scanner;

public class FaktorialRekurzivne {

    public static long faktorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * faktorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadej cislo: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Faktorial nelze spocitat (zaporne cislo).");
            return;
        }

        System.out.println(n + "! = " + faktorial(n));
    }
}
