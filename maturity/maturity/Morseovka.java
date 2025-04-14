import java.util.HashMap;
import java.util.Scanner;

public class Morseovka {
    private static final HashMap<Character, String> textToMorse = new HashMap<>();

    static {
        // Pismena
        textToMorse.put('A', ".-");


        // Cisla
        textToMorse.put('0', "-----");

        // Specialni znaky
        textToMorse.put('.', ".-.-.-");
        textToMorse.put(',', "--..--");
        textToMorse.put('?', "..--..");
        textToMorse.put('\'', ".----.");
        textToMorse.put('!', "-.-.--");
        textToMorse.put('/', "-..-.");
        textToMorse.put('(', "-.--.");
        textToMorse.put(')', "-.--.-");
        textToMorse.put('&', ".-...");
        textToMorse.put(':', "---...");
        textToMorse.put(';', "-.-.-.");
        textToMorse.put('=', "-...-");
        textToMorse.put('+', ".-.-.");
        textToMorse.put('-', "-....-");
        textToMorse.put('_', "..--.-");
        textToMorse.put('"', ".-..-.");
        textToMorse.put('$', "...-..-");
        textToMorse.put('@', ".--.-.");
        textToMorse.put(' ', "/");
    }

    public static String translateToMorse(String text) {
        StringBuilder morseCode = new StringBuilder();
        text = text.toUpperCase();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (textToMorse.containsKey(c)) {
                morseCode.append(textToMorse.get(c)).append(" ");
            } else {
                morseCode.append("? ");
            }
        }

        return morseCode.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadej text k prelozeni do morseovky (nebo 'exit' pro konec):");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String morseCode = translateToMorse(input);
            System.out.println("Morseovka: " + morseCode);
        }

        scanner.close();
    }
}