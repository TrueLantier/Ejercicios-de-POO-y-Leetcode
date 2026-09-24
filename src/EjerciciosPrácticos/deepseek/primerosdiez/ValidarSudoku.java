package EjerciciosPrácticos.deepseek.primerosdiez;

/*
  Dada una matriz 9x9 con números del 0 al 9 (0 = vacío), valida si las filas, columnas y subcuadrículas 3x3 no
  tienen números repetidos.
 */

/*
  Nota: si hay variables que necesitan reutilizarse, en ocasiones es mejor reiniciarlas al INICIO, no al final.
  Porque si algún método o ciclo sale por alguna razón antes del final, esas variables no se reiniciarán.
  Esto provocará que arrastren datos en la siguiente operación( método o algo más), alterando el funcionamiento del
  programa.

  Nota2: Un programa puede dar correcto para una lista de casos válidos, incorrecto para casos inválidos, y aún así
  tener errores si las listas se combinan.
 */

import Útiles.PrintArray;

import java.util.ArrayList;
import java.util.List;

public class ValidarSudoku {

    private final int TAMAÑO = 9;
    List<Integer> listaFilas = new ArrayList<>();
    List<Integer> listaColumnas = new ArrayList<>();
    List<Integer> listaCuadrículas = new ArrayList<>();

    int[][] intervalos = { {0, 0}, {0, 3}, {0, 6}, {3, 0}, {3, 3}, {3, 6}, {6, 0}, {6, 3}, {6, 6} };

    String fila = "filas";
    String columna = "columnas";

    public void validarSudoku(int[][] sudoku) {
        if (!validarTamaño(sudoku)) {
            System.out.println("Tamaño de sudoku incorrecto.");
            return;
        }
        if (!validarFC(sudoku)) {
            System.out.println("Error.");
            return;
        }
        if (!validarCuadrículas(sudoku)) {
            System.out.println("Error en la cuadrículas.");
            return;
        }

        System.out.println("Sudoku válido.");
    }

    private boolean validarTamaño(int[][] sudoku) {
        if (sudoku.length != TAMAÑO) { return false;}
        for (int i = 0; i < TAMAÑO; i++) {
            if (sudoku[i].length != TAMAÑO) {
                return false;
            }
        }

        return true;
    }

    private boolean validarFC(int[][] sudoku) {
        for (int i = 0; i < TAMAÑO; i++) {
            listaFilas = new ArrayList<>();
            listaColumnas = new ArrayList<>();

            for (int j = 0; j < TAMAÑO; j++) {
                if (sudoku[i][j] > 9 || sudoku[i][j] < 1) {
                    System.out.println("Número incorrecto: " + sudoku[i][j]);
                    return false;
                }

                if (contadorNúmeros(sudoku[i][j], fila) || contadorNúmeros(sudoku[j][i], columna)) {
                    return false;
                }
            }

        }
        return true;
    }

    private boolean validarCuadrículas(int[][] sudoku) {
        for (int[] rangos: intervalos) {
            int sumaFila = rangos[0];
            int sumaColumna = rangos[1];
            listaCuadrículas = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int numActual = sudoku[i + sumaFila][j + sumaColumna];

                    if (listaCuadrículas.contains(numActual)) {
                        PrintArray.arrayPrint(rangos);
                        return false;
                    }
                    listaCuadrículas.add(numActual);
                }
            }
        }
        return true;
    }

    private boolean contadorNúmeros(int num, String rango) {

       switch (rango) {
           case "filas":
               if (listaFilas.contains(num)) {
                   System.out.println("Número repetido en fila. Es: " + num);
                   return true;
               }
               listaFilas.add(num);
               break;
           case "columnas":
               if (listaColumnas.contains(num)) {
                   System.out.println("Número repetido en columna. Es: " + num);
                   return true;
               }
               listaColumnas.add(num);
       }

       return false;
    }
}
