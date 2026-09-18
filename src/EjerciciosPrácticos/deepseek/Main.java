package EjerciciosPrácticos.deepseek;

import EjerciciosPrácticos.deepseek.primerosdiez.*;
import Útiles.PrintArray;

public class Main {
    public static void main(String[] args) {
        OrdenarMedir om = new OrdenarMedir();

        //om.ordenarInserción(OrdenarMedir.arrayCuatro);
        //System.out.println(om.comparacionesInserción);

        om.mostrarComparaciones(OrdenarMedir.arrayCuatro);
    }
}
