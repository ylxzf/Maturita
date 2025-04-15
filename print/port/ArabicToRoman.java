public class ArabicToRoman {
 
    public static String arabicToRoman(int arabic) {
        //pole arabskych konstant
        int arabicNums[] = {1000, 900, 500, 400, 100, 90, 50,
                40, 10, 9, 5, 4, 1};
        String romanNums[] = {"M", "CM", "D", "CD", "C", "XC", "L",
                "XL", "X", "IX", "V", "IV", "I"};
        
        //String s vysledkem
        String result = "";
        
        //projdi vsechny arabske konstanty
        for(int i = 0; i < arabicNums.length; i++) {
            //dokud se aktualni arabska cislice vejde do prevadeneho cisla
            while(arabic >= arabicNums[i]) {
                //do vysledku pricteme rimsky ekvivalent aktualni arabske cislice
                result += romanNums[i];
                //od prevadene cislice odecteme aktualni arabskou
                arabic -= arabicNums[i];
            }
        }
        
        //vratime vysledek
        return  result;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(arabicToRoman(3894));
        
        for(int i = 0; i <= 3000; i++) {
            System.out.println(i + " - " + arabicToRoman(i));
        }
    }
}