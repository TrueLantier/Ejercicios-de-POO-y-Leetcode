public class Leetcode {
    public static void main(String[] args) {
        int[] tabla1 = { 1, 2, 3, 4, 5, 6, 7};
        int steps = 2;
        arrayPrint(rotarArrayDerechaDos(tabla1, steps));
    }

    // 1 rotate array in Java. Eje: {1, 2, 3, 4, 5, 6, 7 } y 3 ==> { 5, 6, 7, 1, 2, 3, 4 }
    static int[] rotarArrayDerecha(int[] array, int pasos) {
        int guardarUno = array[0];
        int guardarDos;

        for (int i = 0; i < pasos; i++) {
            for (int j = 1; j < array.length; j++) {
                guardarDos = array[j];
                array[j] = guardarUno;
                guardarUno = guardarDos;

                if (j == array.length-1) { array[0] = guardarUno; }
            }
        }
        return array;
    }
    static int[] rotarArrayDerechaDos(int[] array, int pasos) {
        // Solo si largo > pasos.
        int largo = array.length;
        if (largo < pasos) { return array; }
        int[] arrayDerecho = new int[largo];
        int inmovibles = 0;

        for (int i = 0; i < largo; i++) {
            if (i < pasos) {
                arrayDerecho[i] = array[largo - pasos + i];
            }   else {
                arrayDerecho[i] = array[inmovibles];
                ++inmovibles;
            }
        }
        return arrayDerecho;
    }

    // Métodos auxiliares.
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
