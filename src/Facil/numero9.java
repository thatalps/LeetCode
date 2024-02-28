package Facil;

public class numero9 {
    //9. Palindrome Number // Palindromo numérico

    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }

    //primeira opção de resposta
    public static boolean isPalindrome(int x) {
        String numero = ""+x;
        int y=numero.length()-1;
        for(int i=0; i!=y && y>=0;i++)
        {
            if(numero.charAt(i)!=numero.charAt(y))
                return false;
            y--;
        }
        return true;
    }

    //segunda opção de resposta

//    public static boolean isPalindrome(int x) {//121
//        String numero = ""+x;
//        int y=numero.length()-1;
//        int i=0;
//
//        while(i!=y && y>=0 && i<=y)
//        {
//            if(numero.charAt(i)!=numero.charAt(y))
//                return false;
//            i++;y--;
//        }
//        return true;
//    }

}
