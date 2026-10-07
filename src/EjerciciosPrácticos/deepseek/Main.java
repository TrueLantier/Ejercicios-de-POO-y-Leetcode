package EjerciciosPrácticos.deepseek;

import EjerciciosPrácticos.deepseek.primerosdiez.*;

public class Main {
    public static void main(String[] args) {
        String[] listaUno = { "amor", "amor", "letras", "escuela", "roma", "a", "aa"};
        String[] listaDos = { "roma", "ramo", "lastre", "secuela", "amor", "a", "aa"};

        Anagramas anagramas = new Anagramas();

        for (int i = 0; i < listaUno.length; i++) {
            anagramas.comprobarListaAnagramas(listaUno[i], listaDos[i]);
            System.out.println();
        }

    }
}
