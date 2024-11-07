package Facil;

import java.util.HashMap;

public class numero291 {

    public static void main(String[] args) {
        int [] numeros = {1,2,3,1};
        int k=3;

//        int [] numeros = {1,0,1,1};
//        int k =1;

//        int [] numeros = {1,2,3,1,2,3};
//        int k =2;

        System.out.println(containsNearbyDuplicate(numeros, k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer> mapa = new HashMap<>();
        int antigaPosicao=0;
        int dif=0;
        for(int i=0; i<nums.length;i++)
        {
            if(mapa.containsKey(nums[i]))
            {
                antigaPosicao = mapa.get(nums[i]);
                dif = antigaPosicao - i;
                if(dif<0)
                    dif*=-1;
                if(dif<=k)
                    return true;
            }
            mapa.put(nums[i], i);
        }
        return false;
    }

}
