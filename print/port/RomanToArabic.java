public class RomanToArabic {
 
    public static int romanToArabic(String roman) {
        //vysledek
        int result = 0;
        //aktualni hodnota - prave ji ctu
        int cur = 0;
        //predchozi hodnota - cetl jsem ji minule
        int prev = 0;
        
        //cteme rimske cislo odzadu
        for(int i = roman.length() - 1; i >= 0; i--) {
            //nacti znak
            char znak = roman.charAt(i);
            //nastav aktualni cislici
            switch(znak) {
                case 'I':
                    cur = 1;
                    break;
                case 'V':
                    cur = 5;
                    break;
                case 'X':
                    cur = 10;
                    break;
                case 'L':
                    cur = 50;
                    break;
                case 'C':
                    cur = 100;
                    break;
                case 'D':
                    cur = 500;
                    break;
                case 'M':
                    cur = 1000;
                    break;
            }
            
            //porovnej jestli aktualni cislice je vyssi nebo rovna te minule
            if(cur >= prev) {
                //ano - neni poruseno pravidlo od mensich k vetsim => pricitame
                result += cur;
            } else {
                //ne - je poruseno pravidlo od mensich k vetsim => odcitame
                result -= cur;
            }
            //aktualizujeme minule cislo
            prev = cur;
        }
        
        //vratime vysledek
        return result;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(romanToArabic("MMMDCCCXCIV"));
        System.out.println(romanToArabic(" "));
    }
}