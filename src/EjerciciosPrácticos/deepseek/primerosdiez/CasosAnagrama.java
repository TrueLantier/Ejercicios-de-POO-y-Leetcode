package EjerciciosPrácticos.deepseek.primerosdiez;

public class CasosAnagrama {


    String[] casosA = {
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

    String[] casosB = {
            "roma",      // 0 true
            "zorra",     // 1 false
            "lidera",    // 2 true
            "pesada",    // 3 true
            "claro",     // 4 true
            "pera",      // 5 false
            "camisa",    // 6 true, ignorando espacio
            "seno",      // 7 true, ignorando espacio
            "verse",     // 8 true, ignorando espacio
            "lana"       // 9 false
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
}
