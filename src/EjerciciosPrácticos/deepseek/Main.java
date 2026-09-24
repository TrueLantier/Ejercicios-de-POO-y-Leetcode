package EjerciciosPrácticos.deepseek;

import EjerciciosPrácticos.deepseek.primerosdiez.*;

public class Main {
    public static void main(String[] args) {
        ValidarSudoku vs = new ValidarSudoku();
        vs.validarSudoku(Sudoku.sudokusIncorrectos[1]);
        vs.validarSudoku(Sudoku.sudokusCorrectos[0]);

        System.out.println("\n Hola Mundo.\n");

        for (int i = 0; i < 10; i++) {
//            vs.validarSudoku(Sudoku.sudokusCorrectos[i]);
//            System.out.println();
            vs.validarSudoku(Sudoku.sudokusIncorrectos[i]);
            System.out.println();
        }



    }

}
