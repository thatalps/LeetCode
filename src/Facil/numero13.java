package Facil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class numero13
{
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV")); //1000 900 90 4 // 1994
        System.out.println(romanToInt("MDCXCV")); //1000 600 90 5 // 1695
        System.out.println(romanToInt("III")); //1000 600 90 5 // 1695
    }

    public static int romanToInt(String s)
    {
        Map<Character,Integer> mapaRomano = preencheMapa();
        int resposta=0, numAtual=0, proximo=0;
        try {
            for (int i = 0; i < s.length(); i++) {
                numAtual = mapaRomano.get(s.charAt(i));
                proximo = mapaRomano.get(s.charAt(i + 1));

                if (numAtual >= proximo)
                    resposta += numAtual;
                else
                {
                    resposta += proximo - numAtual;
                    i++;
                }
            }
        }catch (Exception e) { resposta+=numAtual;}
        return resposta;
    }

    public static Map<Character, Integer> preencheMapa() {
        Map<Character,Integer> mapaRomano = new HashMap<Character,Integer>();
        mapaRomano.put('I',1);
        mapaRomano.put('V',5);
        mapaRomano.put('X',10);
        mapaRomano.put('L',50);
        mapaRomano.put('C',100);
        mapaRomano.put('D',500);
        mapaRomano.put('M',1000);
        return mapaRomano;
    }
}
