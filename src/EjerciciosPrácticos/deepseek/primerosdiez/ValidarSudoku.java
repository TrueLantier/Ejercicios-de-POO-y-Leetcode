package EjerciciosPrácticos.deepseek.primerosdiez;

/*
  Dada una matriz 9x9 con números del 0 al 9 (0 = vacío), valida si las filas, columnas y subcuadrículas 3x3 no
  tienen números repetidos.
 */

import java.util.ArrayList;
import java.util.List;

public class ValidarSudoku {

    private final int TAMAÑO = 9;
    List<Integer> listaFilas = new ArrayList<>();
    List<Integer> listaColumnas = new ArrayList<>();
    List<Integer> listaCuadrículas = new ArrayList<>();

    String fila = "filas";
    String columna = "columnas";
    String cuadrícula = "cuadrículas";

    public void validarSudoku(int[][] sudoku) {
        if (!validarTamaño(sudoku)) {
            System.out.println("Tamaño de sudoku incorrecto.");
            return;
        }
        if (!validarFC(sudoku)) {
            System.out.println("Error.");
            return;
        }

        System.out.println("Sudoku válido.");
    }

    private boolean validarTamaño(int[][] sudoku) {
        if (sudoku.length != TAMAÑO) { return false;}
        return sudoku[0].length == TAMAÑO;
    }

    private boolean validarFC(int[][] sudoku) {
        for (int i = 0; i < TAMAÑO; i++) {
            for (int j = 0; j < TAMAÑO; j++) {
                if (sudoku[i][j] > 9 || sudoku[i][j] < 1) {
                    System.out.println("Número incorrecto: " + sudoku[i][j]);
                    return false;
                }

                if (contadorNúmeros(sudoku[i][j], "filas") || contadorNúmeros(sudoku[j][i], "columnas")) {
                    return false;
                }
            }

            listaFilas = new ArrayList<>();
            listaColumnas = new ArrayList<>();
        }
        return true;
    }

    private boolean validarCuadrículas(int[][] sudoku) {


        return true;
    }

    private boolean contadorNúmeros(int num, String rango) {

        if (rango.equals(fila)) {
            if (listaFilas.contains(num)) {
                System.out.println("Número repetido en fila.");
                return true;
            }
            listaFilas.add(num);
        }

        if (rango.equals(columna)) {
            if (listaColumnas.contains(num)) {
                System.out.println("Número repetido en columna.");
                return true;
            }
            listaColumnas.add(num);
        }

        return false;
    }
}
