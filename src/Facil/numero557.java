package Facil;

public class numero557 {

    public static void main(String[] args) {

        String frase = "João foi ao shopping";
        System.out.println(reverseWords(frase));
    }

    public static String reverseWords(String s) {
        String[] separado = s.split(" ");
        String resultado="";
        int tamanho = separado.length;
        int cont =0;

        for (String palavra: separado)
        {
            for (int i = palavra.length()-1; i>=0 ; i--)
            {
                resultado= resultado + palavra.charAt(i);
            }
            cont++;
            if(cont!=tamanho)
                resultado+=" ";
        }
        return resultado;
    }

}
