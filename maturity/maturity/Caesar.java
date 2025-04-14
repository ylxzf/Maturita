import java.util.Scanner;

public class Caesar {

    private static final int POSUN = 3;

    public static String encrypt(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isUpperCase(ch)) {
                ch = (char) (((ch - 'A' + POSUN) % 26) + 'A');
            } else if (Character.isLowerCase(ch)) {
                ch = (char) (((ch - 'a' + POSUN) % 26) + 'a');
            }
            result.append(ch);
        }

        return result.toString();
    }

    public static String decrypt(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isUpperCase(ch)) {
                ch = (char) (((ch - 'A' - POSUN + 26) % 26) + 'A');
            } else if (Character.isLowerCase(ch)) {
                ch = (char) (((ch - 'a' - POSUN + 26) % 26) + 'a');
            }
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option (1-3): ");
            System.out.println("1. Zasifruj text");
            System.out.println("2. Desifruj text");
            System.out.println("3. Exit");
            System.out.println();

            System.out.print("> ");
            String volba = scanner.nextLine();

            if (volba.equals("3")) {
                break;
            }

            System.out.println();

            switch (volba) {
                case "1":
                    System.out.print("Zadej text, ktery chces zasifrovat: ");
                    String textToEncrypt = scanner.nextLine();
                    System.out.println("Zasifrovany text: " + "\u001B[32m" + encrypt(textToEncrypt) + "\u001B[0m");
                    break;

                case "2":
                    System.out.print("Zadej text, ktery chces desifrovat: ");
                    String textToDecrypt = scanner.nextLine();
                    System.out.println("Desifrovany text: " + "\u001B[32m" + decrypt(textToDecrypt) + "\u001B[0m");
                    break;

                default:
                    System.out.println("Spatna volba.");
            }
        }

        scanner.close();
    }
}