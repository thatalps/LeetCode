package Facil;

public class numero14 {
    //14. Longest Common Prefix // Maior prefixo comum

    public static void main(String[] args) {
//        String [] vetor = {"cachorro", "cadela", "cavalo"};
//        String [] vetor = {"flower", "flow", "float"};
//        String [] vetor = {"cachorro", "gato", "pato"};
        String [] vetor = {"cir","car"};
        System.out.println(longestCommonPrefix(vetor));
    }

    public static String longestCommonPrefix(String[] strs) {
        int menorString = strs[0].length(), indiceMenor = 0, cont, ultimoIndice=-1;
        String comum="";

        for (int i=1; i< strs.length;i++)
            if(menorString>strs[i].length()) {
                menorString = strs[i].length();
                indiceMenor=i;
            }

        for (int i=0;i<menorString;i++)
        {//percorre a menor string flor
            cont=0;
            for (int k = 0; k < strs.length; k++)
            { //percorre o vetor
                //confere se primeiro item é igual, se não for, já retorna vazio
                if(strs[indiceMenor].charAt(i) != strs[k].charAt(i) && i==0)
                    return "";
                //se for igual, conta 1 e guarda indice
                if(strs[indiceMenor].charAt(i) == strs[k].charAt(i))
                    cont++;
                //se contador=tamanho do vetor
                //e ultimo indice é i-1
                if(cont==strs.length && (ultimoIndice==(i-1))) {
                    comum += strs[indiceMenor].charAt(i);
                    ultimoIndice=i;
                }
            }
        }
        return comum;
    }
}
