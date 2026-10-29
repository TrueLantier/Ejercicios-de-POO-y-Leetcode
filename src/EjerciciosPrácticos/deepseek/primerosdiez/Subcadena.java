package EjerciciosPrácticos.deepseek.primerosdiez;

/*
  Encuentra la subcadena más larga de una cadena que no contenga caracteres repetidos. Usa bucles tradicionales.
 */

import java.util.ArrayList;
import java.util.List;

public class Subcadena {
    public List<StringBuilder> listaSubcadenas;

    public void buscarSubcadena(String cadena) {
        if (cadena.isBlank()) {
            System.out.println(cadena);
            return;
        }
        listaSubcadenas = new ArrayList<>();
        StringBuilder subcadena = new StringBuilder();
        String string = "";
        String cadenaActual = "";
        int longitud = 0;
        int mayorLongitudActual;

        uno: for (int j = 0; j < cadena.length(); j++) {

            for (int i = j; i < cadena.length(); i++) {
                String caracter = String.valueOf(cadena.charAt(i));

                if (subcadena.indexOf(caracter) < 0) {
                    subcadena.append(caracter);
                    if (i==cadena.length()-1) { // Cuando termina una cadena limpia.
                        listaSubcadenas.add(subcadena);
                        subcadena = new StringBuilder();
                    }
                } else {
                    listaSubcadenas.add(subcadena);
//                    if (subcadena.length() > (cadena.length()-j)) {
//                        break uno;
//                    }
                    subcadena = new StringBuilder();

                    continue uno;
                    //subcadena.append(caracter);
                }


            }
        }

        List<Integer> listNums = new ArrayList<>();
        string = String.valueOf(listaSubcadenas.getFirst());
        int num1 = listaSubcadenas.getFirst().length();
        for (StringBuilder listaSubcadena : listaSubcadenas) {
            listNums.add(listaSubcadena.length());
            int num2 = listaSubcadena.length();

            if (num1 < num2) {
                num1 = num2;
                string = String.valueOf(listaSubcadena);
            }
        }

        System.out.println(string);
        System.out.println(listNums);
        System.out.println(listaSubcadenas);
        System.out.println(cadena);
    }

    public void analizarCadena(String cadena) {
        listaSubcadenas = new ArrayList<>();
        StringBuilder subcadena = new StringBuilder();
        String string = "";
        String cadenaActual = "";
        int longitud = 0;
        int mayorLongitudActual;

        uno: for (int j = 0; j < cadena.length(); j++) {
            mayorLongitudActual = 0;

            for (int i = j; i < cadena.length(); i++) {
                String caracter = String.valueOf(cadena.charAt(i));

                if (subcadena.indexOf(caracter) < 0) {
                    subcadena.append(caracter);
                } else {
                    listaSubcadenas.add(subcadena);
                    subcadena = new StringBuilder();
                    continue uno;
                    // subcadena.append(caracter);
                }

                if (i == cadena.length()-1 && listaSubcadenas.isEmpty()) {
                    string = String.valueOf(subcadena);
                    break uno;
                }

                mayorLongitudActual++;
            }

            System.out.println(mayorLongitudActual + " " + longitud);
            if (mayorLongitudActual > longitud || string.isEmpty()) {
                longitud = mayorLongitudActual;
                string = String.valueOf(listaSubcadenas.getLast());
            }
        }
        System.out.println(string);
    }
}

/*
    public void analizarCadena(String cadena) {
        listaSubcadenas = new ArrayList<>();
        StringBuilder subcadena = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            String caracter = String.valueOf(cadena.charAt(i));
            System.out.print(caracter.hashCode() + " ");

            if (subcadena.indexOf(caracter) < 0) {
                subcadena.append(caracter);
            } else {
                listaSubcadenas.add(subcadena);
                subcadena.delete(0, subcadena.length()); // Fulísimo
                subcadena.append(caracter);
            }
        }
    }
 */
