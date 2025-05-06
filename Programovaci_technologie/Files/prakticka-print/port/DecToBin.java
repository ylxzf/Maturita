public class DecToBin {
    
    public static String decToBin_classic(int cislo) {
        String result = "";
        while(cislo > 0) {
            int podil = cislo / 2;
            int zbytek = cislo % 2;
            result += zbytek;
            cislo = podil;
        }
        //vysledek je ve stringu opacne
        //prevraceni stringu - oldschool
        /*
        String result_opacne = "";
        for(int i = result.length() - 1; i >= 0; i--) {
            result_opacne += result.charAt(i);
        }
        */
        StringBuilder result_sb = new StringBuilder(result);
        StringBuilder result_opacne = result_sb.reverse();
        return result_opacne.toString();
    }
    
    public static String decToBin_rek(int cislo) {
        int zbytek;
        if(cislo <= 1) {
            //nerekurzivni vetev
            return Integer.toString(cislo);
        } else {
            //rekurzivni
            zbytek = cislo % 2;
            return decToBin_rek(cislo / 2) + zbytek;
        }
    }
 
    public static void main(String[] args) {
        System.out.println(decToBin_classic(11));
        System.out.println(decToBin_rek(11));
        
        for(int i = 0; i <= 100; i++) {
            System.out.println(i + " - " + decToBin_rek(i));
        }
    }
}
