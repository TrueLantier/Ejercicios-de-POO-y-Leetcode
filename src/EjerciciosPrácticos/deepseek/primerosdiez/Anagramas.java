package EjerciciosPrácticos.deepseek.primerosdiez;

/*
  Comprueba si dos palabras o frases son anagramas, ignorando mayúsculas y espacios.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Anagramas {
    HashMap<String, Integer> listaUno = new HashMap<>();
    HashMap<String, Integer> listaDos = new HashMap<>();
    char[] listaSignos = { ' ', ',', '.', ';', ':', '?', '!'};
    boolean sonAnagramas = true;

    public void comprobarAnagramas(String fraseUno, String fraseDos) {
        if (fraseUno.equals(fraseDos)) {
            System.out.println("Las frases: " + "\n" + fraseUno + "\n" + fraseDos + "\nson anagramas.");
            return;
        }

        llenarListas(fraseUno, listaUno);
        llenarListas(fraseDos, listaDos);

        if (listaUno.size() != listaDos.size()) {
            System.out.println("Las frases: " + "\n" + fraseUno + "\n" + fraseDos + "\n no son anagramas.");
            return;
        }

        for (int i = 0; i < listaUno.size(); i++) {

        }

        if (sonAnagramas) {
            System.out.println("Las frases: " + "\n" + fraseUno + "\n" + fraseDos + "\nson anagramas.");
        }   else {
            System.out.println("Las frases: " + "\n" + fraseUno + "\n" + fraseDos + "\n no son anagramas.");
        }
    }

    public void llenarListas(String frase, HashMap<String, Integer> lista) {
        uno: for (int i = 0; i < frase.length(); i++) {
            for (char listaSigno : listaSignos) {
                if (frase.charAt(i) == listaSigno) {
                    continue uno;
                }
            }

            lista.merge(String.valueOf(frase.charAt(i)), 1, Integer::sum);
        }
    }

    // Hacerlos usando listas que guardan los valores, se ordenan, y luego se comparan entre sí.
}
