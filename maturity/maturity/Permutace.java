public class Permutace {
    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        permutuj(s.toCharArray(), 0);
    }

    public static void permutuj(char[] pole, int index) {
        if (index == pole.length) {
            System.out.println(new String(pole));
            return;
        }

        for (int i = index; i < pole.length; i++) {
            swap(pole, index, i);
            permutuj(pole, index + 1);
            swap(pole, index, i); // vracime zmenu zpet
        }
    }

    public static void swap(char[] pole, int i, int j) {
        char temp = pole[i];
        pole[i] = pole[j];
        pole[j] = temp;
    }
}
