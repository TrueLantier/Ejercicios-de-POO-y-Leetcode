package pruebas;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        int[][] nums = {
                {1,2,  3,4},
                {5,1,  7,3},

                {3,4,  1,2},
                {5,4,  9,3}
        };

        int[][] intervalos = {
                {0, 0},
                {0, 2},
                {2, 0},
                {2, 2}
        };

        for (int[] rangos: intervalos) {
            int sumaFila = rangos[0];
            int sumaColumna = rangos[1];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    int numActual = nums[i + sumaFila][j + sumaColumna];

                    //System.out.print(numActual + " ");
                    if (lista.contains(numActual)) {
                        System.out.println("NEC");

                    }

                    lista.add(numActual);
                }
            }

            lista = new ArrayList<>();
            // System.out.println();

        }
    }
}
