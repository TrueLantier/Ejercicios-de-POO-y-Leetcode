package EjerciciosPrácticos.deepseek;

import EjerciciosPrácticos.deepseek.primerosdiez.*;

public class Main {
    public static void main(String[] args) {
        String[] listaUno = { "amor", "amor", "letras", "escuela", "roma", "a", "aa"};
        String[] listaDos = { "roma", "ramo", "lastre", "secuela", "amor", "a", "aa"};

        CasosAnagrama ca = new CasosAnagrama();
        Anagramas anagramas = new Anagramas();

        for (int i = 0; i < ca.frasesA.length; i++) {
            anagramas.comprobarAnagramas(ca.casosA[i], ca.casosB[i]);
            System.out.println();
        }

    }
}
