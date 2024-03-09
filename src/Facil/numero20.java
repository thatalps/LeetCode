package Facil;

import java.util.ArrayList;

public class numero20 {
    //20. Valid Parentheses // Validar parenteses // PaCoCha -> (Pa renteses Co lchetes Cha ves)

    public static void main(String[] args) {
//        String s = "(2+1)";
//        String s = "()";
//        String s = "[2+1)";
//        String s = "[[2-1])";
//        String s = "()[]{}";
//        String s = "}";
        String s = "(])";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        ArrayList<Character> lista = new ArrayList<>();
        char aux;
        for (int i=0;i<s.length();i++)
        {
            aux = s.charAt(i);
            if( (aux==')' || aux==']' || aux=='}') && lista.isEmpty())
                return false;
            if(aux=='(' || aux=='[' || aux=='{' )
                lista.addLast(s.charAt(i));
            else
            {
                if (aux == ')' && lista.getLast() == '(' )
                    lista.removeLast();
                else if (aux == ']' && lista.getLast() == '[')
                    lista.removeLast();
                else if (aux == '}' && lista.getLast() == '{')
                    lista.removeLast();
                else if(aux == ')' || aux == ']' || aux == '}' )
                    lista.addLast(aux);
            }
        }
        return lista.isEmpty();
    }
}
