package EjerciciosPrácticos.deepseek.primerosdiez;

/*
  Comprueba si dos palabras o frases son anagramas, ignorando mayúsculas y espacios.
 */

import java.util.*;

public class Anagramas {
    HashMap<String, Integer> listaUno = new HashMap<>();
    HashMap<String, Integer> listaDos = new HashMap<>();
    char[] listaSignos = { ' ', ',', '.', ';', ':', '?', '!'};
    boolean sonAnagramas = true;
    List<String> listaListUno = new ArrayList<>();
    List<String> listaListDos = new ArrayList<>();

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



        if (sonAnagramas) {
            System.out.println("Las frases: " + "\n" + fraseUno + "\n" + fraseDos + "\nson anagramas.");
        }   else {
            System.out.println("Las frases: " + "\n" + fraseUno + "\n" + fraseDos + "\n no son anagramas.");
        }

        listaUno.clear();
        listaDos.clear();
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

    public void comprobarListaAnagramas(String fraseUno, String fraseDos) {
        if (fraseUno.equals(fraseDos)) {
            System.out.println("Las frases: " + "\n" + fraseUno + "\n" + fraseDos + "\nson anagramas.");
            return;
        }

        llenarListasList(fraseUno, listaListUno);
        llenarListasList(fraseDos, listaListDos);

        if (listaListUno.size() != listaListDos.size()) {
            System.out.println("Las frases: " + "\n" + fraseUno + "\n" + fraseDos + "\n no son anagramas.");
            return;
        }

        System.out.println(listaListUno);
        System.out.println(listaListDos);

        if (!listaListUno.equals(listaListDos)) {
            System.out.println("No son anagramas.");
            return;
        }

        /*
          for (int i = 0; i < listaListUno.size(); i++) {
            //  listaListUno.get(i) != listaListDos.get(i)) --> Clásico problema de referencia vs. igualdad.
            //  !listaListUno.get(i) != listaListDos.get(i) --> Otra forma correcta. Pero tiene NullPointerEx

            if (!Objects.equals(listaListUno.get(i), listaListDos.get(i))) {
                System.out.print(listaListUno.get(i) + " " + listaListDos.get(i));
                System.out.println();
                System.out.println("No son anagramas.");
                return;
            }
        }
         */

        System.out.println("Son anagramas.");

        listaListUno.clear();
        listaListDos.clear();
    }

    public void llenarListasList(String frase, List<String> lista) {
        for (int i = 0; i < frase.length(); i++) {
            lista.add(String.valueOf(frase.charAt(i)));
        }
        Collections.sort(lista);
        lista.sort(null);
    }
}
