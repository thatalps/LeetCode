package Facil;

import java.util.Arrays;

public class numero1 {
    //twoSum // Duas Somas // DuasSomas
    public static void main(String[] args) {
        int vetorNumeros[] = new int[]{3, 2, 4};
        int alvo = 9;
        System.out.println(Arrays.toString(twoSum(vetorNumeros, alvo)));
    }

    //primeira opção de resposta
    public static int[] twoSum(int[] nums, int target)
    {
        for (int i=0; i< nums.length; i++)
        {
            for (int k=0; k<nums.length;k++)
            {
                if(i!=k && nums[i]+nums[k]==target) {
                    return new int[]{i,k};
                }
            }
        }
        return new int[]{};
    }

    //segunda opção de resposta

//    public static int[] twoSum(int[] nums, int target) {
//        int volta = 0, pos = 0;
//        do {
//            if (pos == nums.length) {
//                pos = 0;
//                volta++;
//            }
//            if (volta != pos && nums[volta] + nums[pos] == target)
//                return new int[]{volta, pos};
//            pos++;
//        } while (nums.length != volta);
//        return new int[]{};
//    }
}
