package EjerciciosPrácticos.deepseek.primerosdiez;
import Útiles.PrintArray;

/*
  Ejercicio 3:
  Implementa el algoritmo de burbuja y el de inserción para ordenar un array de enteros. Cuenta y muestra cuántas
  comparaciones realiza cada uno.
 */

public class OrdenarMedir {
    public static int[] arrayUno = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static int[] arrayDos = {7, 1, 7, 1, 11, 2, 13, 8, 9, 0};
    public static int[] arrayTres = {17, 21, 7, 0, 1, 22, 3, 8, 9, 100};
    public static int[] arrayCuatro = {5, 3, 8, 1};
    public static int[] arrayCuatroDos = {8, 5, 3, 1};
    public static int[] arrayCinco = {8, 5, 3, 1, 2, 4, 6};

    public int comparacionesBurbuja = 0;
    public int comparacionesInserción = 0;

    public void mostrarComparaciones(int[] array) {

        ordenarBurbuja(array);
        System.out.println("El algoritmo burbuja hizo: " + comparacionesBurbuja + " comparaciones.");

        ordenarInserción(array);
        System.out.println("El algoritmo inserción hizo: " + comparacionesInserción + " comparaciones.");
    }

    public void ordenarBurbuja(int[] array) {
        int[] arrayFijo = array.clone();

        for (int i = 0; i < arrayFijo.length-1; i++) {
            for (int j = 0; j < arrayFijo.length-1; j++) {
                int numActual = arrayFijo[j];
                if (arrayFijo[j] > arrayFijo[j+1]) {
                    arrayFijo[j] = arrayFijo[j+1];
                    arrayFijo[j+1] = numActual;
                    ++comparacionesBurbuja;
                }
            }
        }
        PrintArray.arrayPrint(arrayFijo);
    }

    public void ordenarInserción(int[] array) {
        int[] arrayFijo = array.clone();

        for (int i = 1; i < arrayFijo.length; i++) {
            for (int j = i; j > 0; j--) {
                int numActual = arrayFijo[j];
                if (arrayFijo[j] < arrayFijo[j-1]) {
                    arrayFijo[j] = arrayFijo[j-1];
                    arrayFijo[j-1] = numActual;
                    ++comparacionesInserción;
                }
            }
        }
        PrintArray.arrayPrint(arrayFijo);
    }
}

/*
        int[] num1 = { 1, 2, 3};
        int[] num2 = num1;

        PrintArray.arrayPrint(num1);
        PrintArray.arrayPrint(num2);

        num2[0] = 3;
        num2[1] = 2;
        num2[2] = 1;
        PrintArray.arrayPrint(num1);
        PrintArray.arrayPrint(num2);

        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 6 + 1);
            System.out.print(a + " ");
        }
 */