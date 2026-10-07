package EjerciciosPrácticos.deepseek.primerosdiez;

public class CasosAnagrama {

    public String[] casosA = {
            "amor",      // 0
            "amor",      // 1
            "delira",    // 2
            "espada",    // 3
            "calor",     // 4
            "perro",     // 5
            "mi casa",   // 6 frase
            "no es",     // 7 frase
            "se ver",    // 8 frase
            "la luna"    // 9 frase
    };

    public String[] casosB = {
            "ROMA",      // 0 true
            "zorra",     // 1 false
            "lidera",    // 2 true
            "pesada",    // 3 true
            "CLARO",     // 4 true
            "pera",      // 5 false
            "camisa",    // 6 true, ignorando espacio
            "SENO",      // 7 true, ignorando espacio
            "verse",     // 8 true, ignorando espacio
            "LANA"       // 9 false
    };

    boolean[] esperado = {
            true,   // amor / roma
            false,  // amor / zorra
            true,   // delira / lidera
            true,   // espada / pesada
            true,   // calor / claro
            false,  // perro / pera
            true,   // mi casa / camisa
            true,   // no es / seno
            true,   // se ver / verse
            false   // la luna / lana
    };

    public String[] frasesA = {
            "el sol brilla",
            "la casa roja",
            "vive la vida",
            "el perro ladra",
            "vas a ir"
    };

    public String[] frasesB = {
            "brilla el sol",
            "ROJA LA CASA",
            "vida la vive",
            "el gato maulla",
            "vas a ir"
    };

    boolean[] esperadoFrases = {
            true,
            true,
            true,
            false
    };
}
