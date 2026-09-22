package EjerciciosPrácticos.deepseek.primerosdiez;

/*
  Crea una matriz de tamaño variable (por ejemplo 3x4) y genera su transpuesta. Muestra ambas matrices formateadas.
 */

import Útiles.PrintArray;

public class MatrizTranspuesta {
    private int filas = (int) (Math.random() * 9 + 1);
    private int columnas = (int) (Math.random() * 9 + 1);

    private int[][] matriz = new int[filas][columnas];
    private int[][] matrizTranspuesta = new int[columnas][filas];

    public void generarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 9 + 1);
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }

        PrintArray.arrayPrint(matriz);
        System.out.println();
        PrintArray.arrayPrint(matrizTranspuesta);
    }

}
