package EjerciciosPrácticos.deepseek;

import EjerciciosPrácticos.deepseek.primerosdiez.*;
import EjerciciosPrácticos.deepseek.segundosdiez.*;

public class Main {
    static void main(String[] args) {
        Subcadena subcadena = new Subcadena();

        String a = "weufrvbweufwrinrvirohsuvbrieruewbvbug";
        // subcadena.analizarCadena(a);
        // System.out.println(subcadena.listaSubcadenas);

        int[] num = { 1, 2, 3, 4, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16};
        CasosSubcadena casosSubcadena = new CasosSubcadena();

        subcadena.buscarSubcadena(casosSubcadena.entradas[2]);

        for (int x: num) {

        }

//        System.out.println();
//        subcadena.buscarSubcadena(a);

//
//        System.out.println(subcadena.listaSubcadenas);

//        for (int i = 0; i < casosSubcadena.entradas.length; i++) {
//            subcadena.analizarCadena(casosSubcadena.entradas[i]);
//            System.out.println(subcadena.listaSubcadenas);
//            System.out.println(casosSubcadena.entradas[i]);
//            System.out.println();
//        }


    }
}
