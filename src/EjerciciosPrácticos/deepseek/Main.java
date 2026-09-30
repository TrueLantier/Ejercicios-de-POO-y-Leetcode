package EjerciciosPrácticos.deepseek;

import EjerciciosPrácticos.deepseek.primerosdiez.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {8, 16, 29, 92, 99, 14, 19, 40, 44, 49, 50, 90};
        int[] nums2 = {160, 165, 199, 256, 387, 995, 3199, 100, 400, 444, 500, 900, };
        int[] nums3 = {1665, 3199, 1000, 1994, 2024, 3999, 1111, 1666, -1};
        String[] letras = { "VIII", "XVI", "XXIX", "XCII", "XCIX", "XIV", "XIX", "XL", "XLIV", "XLIX", "L", "XC"};

        RomanoDecimal rd = new RomanoDecimal();

//        for (int x: nums) {
//            rd.convertirARomano(x);
//        }

//        for (String l: letras) {
//            rd.convertirADecimal(l);
//        }

        for (int num : nums3) {
            String letra = rd.convertirARomano(num);
            System.out.println(letra + " " + rd.convertirADecimal(letra));
        }
    }
}
