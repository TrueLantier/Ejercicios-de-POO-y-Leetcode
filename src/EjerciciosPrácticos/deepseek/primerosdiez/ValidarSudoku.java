package EjerciciosPrácticos.deepseek.primerosdiez;

/*
  Dada una matriz 9x9 con números del 0 al 9 (0 = vacío), valida si las filas, columnas y subcuadrículas 3x3 no
  tienen números repetidos.
 */

import java.util.ArrayList;
import java.util.List;

public class ValidarSudoku {
    private final int TAMAÑO = 9;
    List<Integer> lista = new ArrayList<>();

    public void validarSudoku(int[][] sudoku) {
        if (!validarTamaño(sudoku)) {
            System.out.println("Tamaño de sudoku incorrecto.");
            return;
        }
        if (!validarFilas(sudoku)) {
            System.out.println("Error en las filas del sudoku.");
            return;
        }

        System.out.println("Sudoku válido.");
    }

    public boolean validarTamaño(int[][] sudoku) {
        if (sudoku.length != TAMAÑO) { return false;}
        return sudoku[0].length == TAMAÑO;
    }

    public boolean validarFilas(int[][] sudoku) {
        for (int i = 0; i < TAMAÑO; i++) {
            for (int j = 0; j < TAMAÑO; j++) {
                if (sudoku[i][j] > 9 || sudoku[i][j] < 1) {
                    return false;
                }
                if (!contadorNúmeros(sudoku[i][j])) {
                    return false;
                }
            }

            lista = new ArrayList<>();
        }
        return true;
    }

    private boolean contadorNúmeros(int num) {
        if (lista.contains(num)) {
            return false;
        }
        lista.add(num);
        return true;
    }
}
