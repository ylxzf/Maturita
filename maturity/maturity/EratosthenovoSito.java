import java.util.Scanner;

public class EratosthenovoSito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadej horni mez: ");
        int n = sc.nextInt();

        boolean[] prvocisla = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            prvocisla[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (prvocisla[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prvocisla[j] = false;
                }
            }
        }

        System.out.println("Prvocisla do " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (prvocisla[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
