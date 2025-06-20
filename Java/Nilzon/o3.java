package Java.Nilzon;

import java.util.HashMap;
import java.util.Map;

public class o3 {

    /*
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
     */

    static public int romanToInt(String s) {

        int numero = 0;
        int previous = 0;

        Map<Character, Integer> romanos = new HashMap<>();
        romanos.put('I', 1);
        romanos.put('V', 5);
        romanos.put('X', 10);
        romanos.put('L', 50);
        romanos.put('C', 100);
        romanos.put('D', 500);
        romanos.put('M', 1000);

        for(int i = s.length() - 1; i >= 0; i--){
            int current = romanos.get(s.charAt(i));
            if(current < previous){
                numero -= current;
            }else{
                numero += current;
            }
            previous = current;
        }
        return numero;
    }
}
