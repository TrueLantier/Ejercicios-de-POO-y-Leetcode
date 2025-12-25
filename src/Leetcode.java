public class Leetcode {
    public static void main(String[] args) {
        int[] tabla1 = { 1, 2, 3, 4, 5, 6, 7};
        int steps = 6;
        arrayPrint(rotarArrayDerecha(tabla1, steps));
    }

    // 1 rotate array in Java
    static int[] rotarArrayDerecha(int[] array, int pasos) {
        int guardarUno = array[0];
        int guardarDos;

        for (int i = 0; i < pasos; i++) {
            for (int j = 1; j < array.length; j++) {
                guardarDos = array[j];

                array[j] = guardarUno;

                guardarUno = guardarDos;

                if (j == array.length-1) {
                    array[0] = guardarUno;
                }
            }
        }
        return array;
    }

    public static void arrayPrint(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void arrayPrint(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) continue;
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
