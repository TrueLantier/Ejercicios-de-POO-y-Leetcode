package EjerciciosPrácticos.deepseek.primerosdiez;

public class CasosSubcadena {
    String[] entradas = {
            "",
            "a",
            "abcabcbb",
            "bbbbb",
            "pwwkew",
            "abcdef",
            "abba",
            "dvdf",
            "anviaj",
            " ",
            "au",
            "tmmzuxt",
            "ohvhjdml",
            "abcdeaf",
            "aA",
            "a1b2c3",
            "123123"
    };

    int[] longitudesEsperadas = {
            0, 1, 3, 1, 3, 6, 2, 3, 5, 1, 2, 5, 6, 6, 2, 6, 3
    };

    String[] subcadenasEsperadas = {
            "",
            "a",
            "abc",   // también "bca", "cab"
            "b",
            "wke",   // también "kew"
            "abcdef",
            "ab",    // también "ba"
            "vdf",
            "nviaj",
            " ",
            "au",
            "mzuxt",
            "vhjdml",
            "bcdeaf",
            "aA",    // si distingue mayúsculas/minúsculas
            "a1b2c3",
            "123"    // también "231", etc.
    };
}
