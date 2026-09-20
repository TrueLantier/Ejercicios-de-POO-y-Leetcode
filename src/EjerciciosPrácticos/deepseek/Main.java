package EjerciciosPrácticos.deepseek;

import EjerciciosPrácticos.deepseek.primerosdiez.*;

public class Main {
    public static void main(String[] args) {
        ValidarSudoku vs = new ValidarSudoku();

        vs.validarSudoku(Sudoku.valido1Int);
    }
}
