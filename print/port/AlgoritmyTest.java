import java.util.*;

public class AlgoritmyTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        
        System.out.println("Jak velké pole chcete vygenerovat?");
        int[] pole = new int[sc.nextInt()];
        System.out.println("Pole bude doplněno náhodnými čísly");
        System.out.println("Zadejte nejmenší generovatelné číslo:");
        int min = sc.nextInt();
        System.out.println("Zadejte největší generovatelné číslo:");
        int max = sc.nextInt();
        
        for (int i = 0; i<pole.length; i++) {
            pole[i] = min + rnd.nextInt(max - min + 1);
        }
        
        System.out.println();
        prvniVolba();
        int volba = sc.nextInt();
        
        switch (volba) {
            case 1:
                volbaRazeni();
                volba = sc.nextInt();
                switch (volba) {
                    case 1:
                        vypsaniPole(pole);
                        bubbleSort(pole);
                    break;
                    case 2:
                        vypsaniPole(pole);
                        insertSort(pole);
                    break;
                    case 3:
                        vypsaniPole(pole);
                        selectSort(pole);
                    break;
                    case 4:
                        vypsaniPole(pole);
                        System.out.println();
                        int[] finalpole = quickSort(0, pole.length-1, pole);
                        System.out.println("Seřazené pole:");
                        for (int i = 0; i<finalpole.length; i++) {
                            System.out.format("%6d", finalpole[i]);
                        }
                    break;
                    default:
                        System.out.println("Neplatná volba");
                        System.exit(0);
                    break;
                }
            break;
            case 2:
                System.out.println("Jaký prvek chcete v poli vyhledávat?");
                int x = sc.nextInt();
                volbaVyhledavani();
                volba = sc.nextInt();
                switch (volba) {
                    case 1:
                        vypsaniPole(pole);
                        naivniVyhledavani(pole, x);
                    break;
                    case 2:
                        vypsaniPole(pole);
                        bezZarazky(pole, x);
                    break;
                    case 3:
                        vypsaniPole(pole);
                        seZarazkou(pole, x);
                    break;
                    case 4:
                        vypsaniPole(pole);
                        int[] finalpole = quickSort(0, pole.length-1, pole);
                        int vysledek = binarniVyhledavani(finalpole, 0, finalpole.length-1, x);
                        if (vysledek == -1) {
                            System.out.println("Prvek se v poli nenachází");
                        } else {
                            System.out.println("Prvek se v poli nachází");
                        }
                    break;
                    default:
                        System.out.println("Neplatná volba");
                        System.exit(0);
                    break;
                }
            break;
            default:
                System.out.println("Neplatná volba");
                System.exit(0);
            break;
        }
    }
    
    public static void prvniVolba() {
        System.out.println("Jakou operaci chcete provést?");
        System.out.println("1 - Seřadit pole");
        System.out.println("2 - Vyhledat prvek v poli");
    }
    
    public static void volbaRazeni() {
        System.out.println("Jaký algoritmus chcete použít?");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Insert Sort");
        System.out.println("3 - Select Sort");
        System.out.println("4 - Quick Sort");
    }
    
    public static void volbaVyhledavani() {
        System.out.println("Jaký způsob vyhledávání chcete použít?");
        System.out.println("1 - Naivní");
        System.out.println("2 - Bez zarážky");
        System.out.println("3 - Se zarážkou");
        System.out.println("4 - Binární");
    }
    
    public static void vypsaniPole (int[] pole) {
        System.out.println("Vygenerované pole:");
        for (int i = 0; i<pole.length; i++) {
            System.out.format("%6d", pole[i]);
        }
        System.out.println();
    }
    
    public static void bubbleSort(int[] pole) {
        for (int i = 0; i<(pole.length-1); i++) {
            for (int j = 0; j<(pole.length-1-i); j++) {
                if (pole[j] > pole[j+1]) {
                    int pom = pole[j];
                    pole[j] = pole[j+1];
                    pole[j+1] = pom;
                }
            }
        }
        
        System.out.println("Seřazené pole:");
        for (int i = 0; i<pole.length; i++) {
            System.out.format("%6d", pole[i]);
        }
    }





    public static void insertSort(int[] pole) {
        for (int i = 1; i<pole.length; i++) {
            int ins = pole[i];
            int j = i-1;
            while ((j >= 0) && (pole[j] > ins)) {
                pole[j+1] = pole[j];
                j--;
            }
            pole[j+1] = ins;
        }
        
        System.out.println("Seřazené pole:");
        for (int i = 0; i<pole.length; i++) {
            System.out.format("%6d", pole[i]);
        }
    }
    
    public static void selectSort(int[] pole) {
        for (int i = 0; i<pole.length-1; i++) {
            int max_pos = pole.length-1-i;
            for (int j = 0; j<pole.length-i; j++) {
                if (pole[j] > pole[max_pos]) {
                    max_pos = j;
                }
            }
            int pom = pole[pole.length-1-i];
            pole[pole.length-1-i] = pole[max_pos];
            pole[max_pos] = pom;
        }
        
        System.out.println("Seřazené pole:");
        for (int i = 0; i<pole.length; i++) {
            System.out.format("%6d", pole[i]);
        }
    }
    
    public static int[] quickSort(int l, int r, int[] pole) {
        int i = l;
        int j = r;
        int pivot = pole[((l + r) /2)];
        
        do {
            while (pole[i] < pivot) i++;
            while (pole[j] > pivot) j--;
            if (i <= j) {
                int pom = pole[i];
                pole[i] = pole[j];
                pole[j] = pom;
                i++;
                j--;
            }
        } while (i < j);
        
        if ((j - l) > 0) quickSort(l, j, pole);
        if ((r - i) > 0) quickSort(i, r, pole);
        
        return pole;
    }
    
    public static void naivniVyhledavani(int[] p, int x) {
        boolean vysledek = false;
        
        for (int i = 0; i<p.length; i++) {
            if (p[i] == x) {
                vysledek = true;
            }
        }
        
        if (vysledek == true) {
            System.out.println("Prvek se v poli nachází");
        } else {
            System.out.println("Prvek se v poli nenachází");
        }
    }
    
    public static void bezZarazky(int[] p, int x) {
        boolean vysledek = false;
        int i = 0;
        
        while (vysledek == false && i < p.length) {
            if (p[i] == x) {
                vysledek = true;
            }
            i++;
        }
        
        if (vysledek == true) {
            System.out.println("Prvek se v poli nachází");
        } else {
            System.out.println("Prvek se v poli nenachází");
        }
    }
    
    public static void seZarazkou(int[] p, int x) {
        int[] pole = new int[p.length+1];
        for (int i = 0; i<p.length; i++) {
            pole[i] = p[i];
        }
        pole[p.length] = x;
        
        boolean vysledek = false;
        int i = 0;
        
        while (vysledek == false) {
            if (pole[i] == x) {
                vysledek = true;
            }
            i++;
        }
        
        if (vysledek == true && i < pole.length) {
            System.out.println("Prvek se v poli nachází");
        } else {
            System.out.println("Prvek se v poli nenachází");
        }
    }
    
    public static int binarniVyhledavani(int[] pole, int l, int r, int x) {
        if (r >= l) {
            int s = l + (r - l) / 2;
            
            if (pole[s] == x) {
                return s;
            }
            if (pole[s] > x) {
                return binarniVyhledavani(pole, l, s-1, x);
            } else {
                return binarniVyhledavani(pole, s+1, r, x);
            }
        }
        return -1;
    }
    
}