package EjerciciosPrácticos.deepseek.primerosdiez;

/*
  Encuentra la subcadena más larga de una cadena que no contenga caracteres repetidos. Usa bucles tradicionales.
 */

// Usaré String y no StringBuilder.

public class Subcadena {

    public void analizarCadena(String cadena) {
        String string = "";
        int longitud = 0;

        for (int i = 0; i < cadena.length(); i++) {
            // if (string.contains(cadena.charAt(i))) {

            // }

            string += cadena.charAt(i);
            longitud++;
        }
    }
}
