import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList pf = new ArrayList<>();

        System.out.print("cislo: ");
        long cislo = scan.nextLong();
        scan.close();

        long tmp = cislo;

        for (long i = 2; i <= cislo; i++) {
            while (tmp % i == 0) {
                pf.add(i);
                tmp /= i;
            }

            if (tmp == 1) {
                break;
            }
        }
        System.out.print("Prime factor of number " + cislo + " is: ");
        System.out.println(pf);
    }
}
