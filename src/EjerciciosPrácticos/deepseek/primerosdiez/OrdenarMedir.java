package EjerciciosPrácticos.deepseek.primerosdiez;

/*
  Ejercicio 3:
  Implementa el algoritmo de burbuja y el de inserción para ordenar un array de enteros. Cuenta y muestra cuántas
  comparaciones realiza cada uno.
 */

import Útiles.PrintArray;

import java.lang.reflect.Array;

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
        int[] arrayFijo = array;

        ordenarBurbuja(array);
        System.out.println("El algoritmo burbuja hizo: " + comparacionesBurbuja + " comparaciones.");

        ordenarInserción(arrayFijo);
        System.out.println("El algoritmo inserción hizo: " + comparacionesInserción + " comparaciones.");
    }

    public void ordenarBurbuja(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                int numActual = array[j];
                if (array[j] > array[j+1]) {
                    array[j] = array[j+1];
                    array[j+1] = numActual;
                    ++comparacionesBurbuja;
                }
            }
        }
        PrintArray.arrayPrint(array);
    }

    public void ordenarInserción(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                int numActual = array[j];
                if (array[j] < array[j-1]) {
                    array[j] = array[j-1];
                    array[j-1] = numActual;
                    ++comparacionesInserción;
                }
            }
        }
        PrintArray.arrayPrint(array);
    }
}
